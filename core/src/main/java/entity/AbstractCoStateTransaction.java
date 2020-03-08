package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by majid on 1/4/17.
 */
@MappedSuperclass
public abstract class AbstractCoStateTransaction extends BaseEntity{
    private Long id;
    private Long record;
    private CoStateAction stateAction;
    private Class clazz;
    private CoPerson person;
    private Date date;
    private String message;
    //private CoUsecase usecase;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "STATETRANSACTIONSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "RECORD_ID", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getRecord() {
        return record;
    }
    public void setRecord(Long record) {
        this.record = record;
    }

    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    @JoinColumn(name = "CO_STATE_ACTION_ID", unique = false, nullable = false, insertable = true, updatable = true)
    public CoStateAction getStateAction() {
        return stateAction;
    }
    public void setStateAction(CoStateAction stateAction) {
        this.stateAction = stateAction;
    }

    @Column(name = "CLASS", unique = false, nullable = false, insertable = true, updatable = true, length = 2000)
    public Class getClazz() {
        return clazz;
    }
    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ACTION_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 7)
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "message", unique = false, nullable = true, insertable = true, updatable = true, length = 2000)
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @ManyToOne(cascade = {}, fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID", unique = false, nullable = false, insertable = true, updatable = true)
    public CoPerson getPerson() {
        return person;
    }

    public void setPerson(CoPerson person) {
        this.person = person;
    }
}
