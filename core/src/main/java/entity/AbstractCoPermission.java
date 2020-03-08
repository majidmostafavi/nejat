package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by majid on 6/25/16.
 */
@MappedSuperclass
public abstract class AbstractCoPermission extends BaseEntity implements Comparable<AbstractCoPermission> {


    private Long id;
    private String key;
    private String title;
    private String persianTitle;
    private CoPermissionCategory category;
    private Set<CoRole> roles = new HashSet<CoRole>(0);

    // Constructors
    /** default constructor */
    public AbstractCoPermission() {
    }

    public AbstractCoPermission(String key, String title) {
        this.key = key;
        this.title=title;
    }
    public AbstractCoPermission(String key, String title, String persianTitle) {
        this.key = key;
        this.title=title;
        this.persianTitle=persianTitle;
    }
    // Property accessors
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "PERMISSIONSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "permission_key",nullable = false,unique = true)
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    @Column(name = "permission_title",nullable = false,unique = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "permission_persian_title",nullable = false,unique = false)
    public String getPersianTitle() {
        return persianTitle;
    }
    public void setPersianTitle(String persianTitle) {
        this.persianTitle = persianTitle;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "permission_category_id",foreignKey =@ForeignKey(name = "FK_permission_category"))
    public CoPermissionCategory getCategory() {
        return category;
    }
    public void setCategory(CoPermissionCategory category) {
        this.category = category;
    }

    @ManyToMany(mappedBy = "permissions",cascade = {})
    public Set<CoRole> getRoles() {
        return roles;
    }
    public void setRoles(Set<CoRole> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCoPermission)) return false;

        AbstractCoPermission that = (AbstractCoPermission) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return key != null ? key.equals(that.key) : that.key == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        return result;
    }

    public int compareTo(AbstractCoPermission o) {
        return title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return title;
    }
}
