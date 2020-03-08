package entity;

import enumeration.SubSystem;
import enumeration.UsecaseType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by majid on 11/30/16.
 */
@MappedSuperclass
public abstract class AbstractCoUsecase extends BaseEntity {
    private Long id;
    private String name;
    private Class clazz;
    private SubSystem subSystem;
    private UsecaseType usecaseType;
    private Set<CoUsecaseAction> usecaseActions = new HashSet<CoUsecaseAction>(0);

    // Constructors

    /** default constructor */
    public AbstractCoUsecase() {
    }

    /** minimal constructor */
    public AbstractCoUsecase(Class clazz, Long id) {
        this.clazz = clazz;
        this.id = id;
    }

    /** full constructor */
    public AbstractCoUsecase(Long id, String name, Class clazz, SubSystem subSystem) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
        this.subSystem = subSystem;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "USECASESequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "CLASS")
    public Class getClazz() {
        return clazz;
    }
    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name="SUBSYSTEM_ID")
    public SubSystem getSubSystem() {
        return subSystem;
    }
    public void setSubSystem(SubSystem subSystem) {
        this.subSystem = subSystem;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name="USECASE_TYPE_ID")
    public UsecaseType getUsecaseType() {
        return usecaseType;
    }
    public void setUsecaseType(UsecaseType usecaseType) {
        this.usecaseType = usecaseType;
    }

    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "usecase")
    public Set<CoUsecaseAction> getUsecaseActions() {
        return usecaseActions;
    }
    public void setUsecaseActions(Set<CoUsecaseAction> usecaseActions) {
        this.usecaseActions = usecaseActions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractCoUsecase that = (AbstractCoUsecase) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (clazz != null ? !clazz.equals(that.clazz) : that.clazz != null) return false;
        return  (subSystem != null ? subSystem.equals(that.subSystem) : that.subSystem == null);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (clazz != null ? clazz.hashCode() : 0);
        result = 31 * result + (subSystem != null ? subSystem.hashCode() : 0);
        return result;
    }
}
