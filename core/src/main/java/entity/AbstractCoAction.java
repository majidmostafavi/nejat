package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by majid on 11/30/16.
 */
@MappedSuperclass
public abstract class AbstractCoAction  extends BaseEntity{
    private Long id;
    private String name;
    private String methodName;
    private Set<CoUsecaseAction> usecaseActions= new HashSet<CoUsecaseAction>(0);

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ActionSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "METHOD_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
    public String getMethodName() {
        return methodName;
    }
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "action")
    public Set<CoUsecaseAction> getUsecaseActions() {
        return usecaseActions;
    }
    public void setUsecaseActions(Set<CoUsecaseAction> usecaseActions) {
        this.usecaseActions = usecaseActions;
    }
}
