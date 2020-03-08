package entity;

import javax.persistence.*;

@Entity
@Table(name = "CO_ORGANIZATION_TYPE")
@TableGenerator(name = "organizationTypeSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_ORGANIZATION_TYPE" )
@NamedQueries({
        @NamedQuery(name = "findOrganizationTypeByKey",query = "select organizationType from CoOrganizationType organizationType where organizationType.key like :typeKey")
})

public class CoOrganizationType extends AbstractCoOrganizationType {
}
