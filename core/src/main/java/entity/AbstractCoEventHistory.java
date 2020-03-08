package entity;

import enumeration.EventType;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public abstract class AbstractCoEventHistory {

    private Long id;
    private LocalDate eventDate;
    private EventType eventType;
    private Long personnelID;
    private Long record;
    private Class clazz;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "CoEventHistorySequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EVENT_DATE", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    public LocalDate getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "EVENT_TYPE", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    public EventType getEventType() {
        return eventType;
    }
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @Column(name = "PERSONNEL_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    public Long getPersonnelID() {
        return personnelID;
    }
    public void setPersonnelID(Long personnelID) {
        this.personnelID = personnelID;
    }

    @Column(name = "RECORD_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    public Long getRecord() {
        return record;
    }
    public void setRecord(Long record) {
        this.record = record;
    }

    @Column(name = "CLASS", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    public Class getClazz() {
        return clazz;
    }
    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
