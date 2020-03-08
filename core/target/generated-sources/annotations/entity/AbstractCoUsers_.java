package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoUsers.class)
public abstract class AbstractCoUsers_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoUsers, String> password;
	public static volatile SingularAttribute<AbstractCoUsers, String> creator;
	public static volatile SingularAttribute<AbstractCoUsers, Date> createdDate;
	public static volatile SingularAttribute<AbstractCoUsers, CoPerson> person;
	public static volatile SetAttribute<AbstractCoUsers, CoRoleOrganization> roleOrganizations;
	public static volatile SingularAttribute<AbstractCoUsers, Long> id;
	public static volatile SingularAttribute<AbstractCoUsers, String> userName;

	public static final String PASSWORD = "password";
	public static final String CREATOR = "creator";
	public static final String CREATED_DATE = "createdDate";
	public static final String PERSON = "person";
	public static final String ROLE_ORGANIZATIONS = "roleOrganizations";
	public static final String ID = "id";
	public static final String USER_NAME = "userName";

}

