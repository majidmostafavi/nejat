package entity;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by majid on 6/21/16.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    private boolean active;
    private Long createdBy;
    private Date created;
    private Long UpdatedBy;
    private Date updated;

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getUpdatedBy() {
        return UpdatedBy;
    }
    public void setUpdatedBy(Long updatedBy) {
        UpdatedBy = updatedBy;
    }

    public Date getUpdated() {
        return updated;
    }
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @PrePersist
    public void onPrePersist() {
        setCreated(new Date());
        setUpdated(new Date());
        setActive(true);
    }

    @PreUpdate
    public void onPreUpdate() {
        setUpdated(new Date());
    }

}
