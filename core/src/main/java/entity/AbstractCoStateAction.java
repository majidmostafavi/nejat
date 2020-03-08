package entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by majid on 11/30/16.
 */
@MappedSuperclass
public abstract class AbstractCoStateAction extends BaseEntity {

    private Long id;
    private String stateName;
    private CoState fromState;
    private CoState toState;
    private boolean lockAble;
    private boolean skipAble;
    private boolean rollBack;
    private boolean finalize;
    private Long type;
    private int version;

    public AbstractCoStateAction() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "STATEACTIONSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "STATE_NAME", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "STATE_FROM",foreignKey =@ForeignKey(name = "FK_ACTION_STATE_FROM"), unique = false, nullable = false, insertable = true, updatable = true)
    public CoState getFromState() {
        return fromState;
    }
    public void setFromState(CoState fromState) {
        this.fromState = fromState;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "STATE_TO",foreignKey =@ForeignKey(name = "FK_ACTION_STATE_TO"), unique = false, nullable = false, insertable = true, updatable = true)
    public CoState getToState() {
        return toState;
    }
    public void setToState(CoState toState) {
        this.toState = toState;
    }

    @Column(name = "Lock_Able", unique = false, nullable = false, insertable = true, updatable = true, precision = 1, scale = 0)
    public boolean isLockAble() {
        return lockAble;
    }
    public void setLockAble(boolean lockAble) {
        this.lockAble = lockAble;
    }

    @Column(name = "SKIP_ABLE", unique = false, nullable = false, insertable = true, updatable = true, precision = 1, scale = 0)
    public boolean isSkipAble() {
        return skipAble;
    }
    public void setSkipAble(boolean skipAble) {
        this.skipAble = skipAble;
    }

    @Column(name = "ROLLBACK", unique = false, nullable = false, insertable = true, updatable = true, precision = 1, scale = 0)
    public boolean isRollBack() {
        return rollBack;
    }
    public void setRollBack(boolean rollBack) {
        this.rollBack = rollBack;
    }

    @Column(name = "TYPE",unique = false,nullable = true,precision = 1,scale = 0)
    public Long getType() {
        return type;
    }
    public void setType(Long type) {
        this.type = type;
    }

    @NotNull
    @Column(name = "FINALIZE", unique = false, nullable = false, insertable = true, updatable = true, precision = 1, scale = 0)
    public boolean isFinalize() {
        return finalize;
    }
    public void setFinalize(boolean finalize) {
        this.finalize = finalize;
    }

    @Version
    @Column(name = "VERSION")
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCoStateAction)) return false;

        AbstractCoStateAction that = (AbstractCoStateAction) o;

        if (lockAble != that.lockAble) return false;
        if (skipAble != that.skipAble) return false;
        if (rollBack != that.rollBack) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (stateName != null ? !stateName.equals(that.stateName) : that.stateName != null) return false;
        if (fromState != null ? !fromState.equals(that.fromState) : that.fromState != null) return false;
        if (toState != null ? !toState.equals(that.toState) : that.toState != null) return false;
        return type != null ? type.equals(that.type) : that.type == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (stateName != null ? stateName.hashCode() : 0);
        result = 31 * result + (fromState != null ? fromState.hashCode() : 0);
        result = 31 * result + (toState != null ? toState.hashCode() : 0);
        result = 31 * result + (lockAble ? 1 : 0);
        result = 31 * result + (skipAble ? 1 : 0);
        result = 31 * result + (rollBack ? 1 : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
