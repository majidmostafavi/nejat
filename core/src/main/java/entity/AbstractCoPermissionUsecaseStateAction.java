package entity;

import javax.persistence.*;

/**
 * Created by majid on 12/10/16.
 */
@MappedSuperclass
public abstract class AbstractCoPermissionUsecaseStateAction extends BaseEntity  {

    private Long id;
    private CoPermission permission;
    private CoStateUsecaseAction stateUsecaseAction;



    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "PUSASequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "PERMISSION_ID",foreignKey =@ForeignKey(name = "FK_PRMSSNUSEACTNST_PERMISSION"),unique = false, nullable = false, insertable = true, updatable = true)
    public CoPermission getPermission() {
        return permission;
    }
    public void setPermission(CoPermission permission) {
        this.permission = permission;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "STATE_USECASE_ACTION_ID",foreignKey =@ForeignKey(name = "FK_PRMSSNUSEACST_USCSACTNST"), unique = false, nullable = false, insertable = true, updatable = true)
    public CoStateUsecaseAction getStateUsecaseAction() {
        return stateUsecaseAction;
    }
    public void setStateUsecaseAction(CoStateUsecaseAction stateUsecaseAction) {
        this.stateUsecaseAction = stateUsecaseAction;
    }
}
