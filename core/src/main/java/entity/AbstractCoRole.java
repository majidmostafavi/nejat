package entity;

import enumeration.AccessTypeEnum;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by majid on 6/25/16.
 */
@MappedSuperclass
public abstract class AbstractCoRole extends BaseEntity implements Comparable<AbstractCoRole> {


    private Long id;
    private String roleTitle;
    private Set<CoPermission> permissions = new HashSet<CoPermission>();
    private AccessTypeEnum accessTypeEnum;

    public AbstractCoRole() {
    }

    public AbstractCoRole(String roleTitle, Set<CoPermission> permissions) {
        this.roleTitle= roleTitle;
        this.permissions = permissions;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ROLESequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "role_title",nullable = false,unique = true)
    public String getRoleTitle() {
        return roleTitle;
    }
    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "CO_ROLE_PERMISSION",
            joinColumns = {@JoinColumn(name = "ROLE_ID",referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "PERMISSION_ID",referencedColumnName = "id")})
    public Set<CoPermission> getPermissions() {
        return permissions;
    }
    public void setPermissions(Set<CoPermission> permissions) {
        this.permissions = permissions;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ACCESS_TYPE")
    public AccessTypeEnum getAccessTypeEnum() {
        return accessTypeEnum;
    }
    public void setAccessTypeEnum(AccessTypeEnum accessTypeEnum) {
        this.accessTypeEnum = accessTypeEnum;
    }

    @Override
    public String toString() {
        return "[name=" + roleTitle + "]";
    }


    public int compareTo(AbstractCoRole role) {
        if(role.getRoleTitle()!=null){
            return roleTitle.compareTo(role.roleTitle);
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCoRole that = (AbstractCoRole) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(roleTitle, that.roleTitle) &&
                Objects.equals(permissions, that.permissions) &&
                accessTypeEnum == that.accessTypeEnum;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, roleTitle, permissions, accessTypeEnum);
    }
}