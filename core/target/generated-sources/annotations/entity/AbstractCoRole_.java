package entity;

import enumeration.AccessTypeEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoRole.class)
public abstract class AbstractCoRole_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoRole, String> roleTitle;
	public static volatile SetAttribute<AbstractCoRole, CoPermission> permissions;
	public static volatile SingularAttribute<AbstractCoRole, Long> id;
	public static volatile SingularAttribute<AbstractCoRole, AccessTypeEnum> accessTypeEnum;

	public static final String ROLE_TITLE = "roleTitle";
	public static final String PERMISSIONS = "permissions";
	public static final String ID = "id";
	public static final String ACCESS_TYPE_ENUM = "accessTypeEnum";

}

