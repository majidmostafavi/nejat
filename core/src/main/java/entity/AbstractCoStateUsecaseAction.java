package entity;

import javax.persistence.*;

/**
 * Created by majid on 12/3/16.
 */
@MappedSuperclass
public abstract class AbstractCoStateUsecaseAction  extends BaseEntity{
    private Long id;
    private CoStateAction stateAction;
    private CoUsecaseAction usecaseAction;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "STATEUSECASEACTIONSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "STATE_ACTION_ID",foreignKey =@ForeignKey(name = "FK_STATE_ACTION"))
    public CoStateAction getStateAction() {
        return stateAction;
    }
    public void setStateAction(CoStateAction stateAction) {
        this.stateAction = stateAction;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "USECASE_ACTION_id",foreignKey =@ForeignKey(name = "FK_USECASE_ACTION"))
    public CoUsecaseAction getUsecaseAction() {
        return usecaseAction;
    }
    public void setUsecaseAction(CoUsecaseAction usecaseAction) {
        this.usecaseAction = usecaseAction;
    }
}
