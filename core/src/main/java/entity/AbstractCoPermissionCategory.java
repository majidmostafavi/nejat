package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by majid on 6/25/16.
 */
@MappedSuperclass
public abstract class AbstractCoPermissionCategory extends BaseEntity {


    private Long id;
    private Long code;
    private String categoryName;
    private Set<CoPermission> permissions = new HashSet<CoPermission>();

    public AbstractCoPermissionCategory() {
    }

    public AbstractCoPermissionCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public AbstractCoPermissionCategory(String categoryName, HashSet<CoPermission> permissions) {
        this.categoryName = categoryName;
        this.permissions = permissions;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "PERMISSIONCATEGORYSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CODE",unique = true)
    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }

    @Column(name="category_name",unique = true,nullable = false)
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "category")
    public Set<CoPermission> getPermissions() {
        return permissions;
    }
    public void setPermissions(Set<CoPermission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCoPermissionCategory)) return false;

        AbstractCoPermissionCategory that = (AbstractCoPermissionCategory) o;

        return id != null ? id.equals(that.id) : that.id == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }

    
}