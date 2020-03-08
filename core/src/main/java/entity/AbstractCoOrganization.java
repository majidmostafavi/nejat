package entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@MappedSuperclass
public abstract class AbstractCoOrganization  extends BaseEntity implements Comparable<AbstractCoOrganization> {

    private Long id;
    private Long codeDigit;
    private String name;
    private CoOrganization parent;
    private CoOrganizationType organizationType;
    private Set<CoOrganization> children = new HashSet<CoOrganization>(0);
    private String pathCode;
    private String pathId;
    private Long parentId;
    private boolean leaf;
    private String description;

    // Constructors
    /** default constructor */
    public AbstractCoOrganization() {
        leaf = true;
    }

    // Property accessors
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "OrganizationSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "CODE", unique = true, nullable = false, insertable = true, updatable = true, length = 20)
    public Long getCodeDigit() {
        return codeDigit;
    }
    public void setCodeDigit(Long code) {
        this.codeDigit = code;
    }

    @NotNull
    @Column(name = "NAME", unique = false, nullable = false, insertable = true, updatable = true, length = 200)
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "DESCRIPTION", unique = false, nullable = true, insertable = true, updatable = true)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "PATH_CODE")
    public String getPathCode() {
        return pathCode;
    }
    public void setPathCode(String pathCode) {
        this.pathCode = pathCode;
    }

    @Column(name = "PATH_ID")
    public String getPathId() {
        return pathId;
    }
    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    @ManyToOne
    @JoinColumn(name = "PARENT_ID", foreignKey = @ForeignKey(name = "FK_PARENT_ORGANIZATION_ID"),unique = false, nullable = true, insertable = true, updatable = true)
    public CoOrganization getParent() {
        return parent;
    }
    public void setParent(CoOrganization parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent", cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    public Set<CoOrganization> getChildren() {
        return children;
    }
    public void setChildren(Set<CoOrganization> children) {
        this.children = children;
    }

    @NotNull
    @ManyToOne (cascade = {})
    @JoinColumn(name = "organization_type_id",foreignKey = @ForeignKey(name = "FK_ORGANIZATION_TYPE_ID"),unique = false,nullable = true)
    public CoOrganizationType getOrganizationType() {
        return organizationType;
    }
    public void setOrganizationType(CoOrganizationType organizationType) {
        this.organizationType = organizationType;
    }

    @Column(name = "PARENT_ID", insertable = false, updatable = false)
    public Long getParentId() {
        return parentId;
    }
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @NotNull
    @Column(name = "LEAF",nullable = false)
    public boolean isLeaf() {
        return leaf;
    }
    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }


    @Override
    public String toString() {
        if (getCodeDigit().toString() != null && getName() != null)
            return "(" + getCodeDigit().toString()  + ") "+ getName();
        else if (getCodeDigit().toString()  != null)
            return "(" + getCodeDigit().toString()  + ")";
        else if (getName() != null)
            return getName();
        else return "";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCoOrganization)) return false;
        AbstractCoOrganization that = (AbstractCoOrganization) o;
        return leaf == that.leaf &&
                Objects.equals(id, that.id) &&
                Objects.equals(codeDigit, that.codeDigit) &&
                Objects.equals(name, that.name) &&
                Objects.equals(parent, that.parent) &&
                Objects.equals(pathCode, that.pathCode) &&
                Objects.equals(pathId, that.pathId) &&
                Objects.equals(parentId, that.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codeDigit, name, parent, pathCode, pathId, parentId, leaf);
    }

    @Override
    @NotNull
    public int compareTo(AbstractCoOrganization organization) {
        if (this.getId()!=null) {
            return this.getCodeDigit().compareTo(organization.getCodeDigit());
        }else {
            return 0 ;
        }
    }

}
