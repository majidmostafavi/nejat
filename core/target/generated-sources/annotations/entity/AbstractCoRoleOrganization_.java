package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoRoleOrganization.class)
public abstract class AbstractCoRoleOrganization_ extends entity.BaseOrganizationEntity_ {

	public static volatile SingularAttribute<AbstractCoRoleOrganization, String> creator;
	public static volatile SetAttribute<AbstractCoRoleOrganization, CoRole> roles;
	public static volatile SingularAttribute<AbstractCoRoleOrganization, Long> id;
	public static volatile SingularAttribute<AbstractCoRoleOrganization, CoUsers> user;

	public static final String CREATOR = "creator";
	public static final String ROLES = "roles";
	public static final String ID = "id";
	public static final String USER = "user";

}

