package entity;

import interfaces.OrganizationSupport;
import javax.persistence.*;

/**
 * Created by majid on 9/14/16.
 */
@MappedSuperclass
public abstract class BaseOrganizationEntity extends BaseEntity implements OrganizationSupport {

    private CoOrganization organization;

    @Override
    public void setCoOrganization(CoOrganization organization) {
        this.organization = organization;
    }

    @Override
    @ManyToOne
    @JoinColumn(name = "CO_ORGANIZATION_ID", unique = false, nullable = false, insertable = true, updatable = true)
    public CoOrganization getCoOrganization() {
        return organization;
    }

}
