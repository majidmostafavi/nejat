package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by majid on 6/25/16.
 */
@MappedSuperclass
public abstract class AbstractCoRoleOrganization extends BaseOrganizationEntity {

    private Long id;
    private Set<CoRole> roles = new HashSet<CoRole>();
    private CoOrganization organization;
    private String creator;
    private CoUsers user;

    public AbstractCoRoleOrganization() {
    }

    public AbstractCoRoleOrganization(Set<CoRole> roles, CoOrganization organization) {
        this.roles = roles;
        this.organization = organization;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ROLEORGANIZATIONSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    @ManyToMany(cascade = {},fetch = FetchType.EAGER)
    @OrderBy
    @JoinTable(
            name = "CO_ROLEORG_ROLE",
            joinColumns = {@JoinColumn(name = "ROLEORG_ID")},foreignKey = @ForeignKey(name = "FK_ROLE_ORGANIZATION_ID"),
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID")},inverseForeignKey =@ForeignKey(name = "FK_ROLE_ID")
    )
    public Set<CoRole> getRoles() {
        return roles;
    }
    public void setRoles(Set<CoRole> roles) {
        this.roles = roles;
    }

    @Column(name = "creator", length = 128)
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    public CoUsers getUser() {
        return user;
    }
    public void setUser(CoUsers user) {
        this.user = user;
    }

    @PrePersist
    public void prePersist(){
        //this check is for the application, when it creates default admin user in the startup
       // if((SecurityUtils.getSubject()!=null)&&(SecurityUtils.getSubject().getPrincipal()!=null))
         //   setCreator(SecurityUtils.getSubject().getPrincipal().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCoRoleOrganization)) return false;

        AbstractCoRoleOrganization that = (AbstractCoRoleOrganization) o;

        if (roles != null ? !roles.equals(that.roles) : that.roles != null) return false;
        return organization != null ? organization.equals(that.organization) : that.organization == null;
    }

    @Override
    public int hashCode() {
        int result = roles != null ? roles.hashCode() : 0;
        result = 31 * result + (organization != null ? organization.hashCode() : 0);
        return result;
    }
}
