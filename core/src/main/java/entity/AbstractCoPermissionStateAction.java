package entity;

import javax.persistence.*;

/**
 * Created by majid on 7/24/17.
 */
@MappedSuperclass
public abstract class AbstractCoPermissionStateAction extends BaseEntity {
    private Long id;
    private CoStateAction stateAction;
    private CoPermission permission;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "PSASequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "STATE_USECASE_ACTION_ID",foreignKey =@ForeignKey(name = "FK_PRMSSNSTACTION_STACTION"), unique = false, nullable = false, insertable = true, updatable = true)
    public CoStateAction getStateAction() {
        return stateAction;
    }
    public void setStateAction(CoStateAction stateAction) {
        this.stateAction = stateAction;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "PERMISSION_ID",foreignKey =@ForeignKey(name = "FK_PRMSSNSTACTION_PERMISSION"),unique = false, nullable = false, insertable = true, updatable = true)
    public CoPermission getPermission() {
        return permission;
    }
    public void setPermission(CoPermission permission) {
        this.permission = permission;
    }

}
