package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoPermission.class)
public abstract class AbstractCoPermission_ extends entity.BaseEntity_ {

	public static volatile SetAttribute<AbstractCoPermission, CoRole> roles;
	public static volatile SingularAttribute<AbstractCoPermission, Long> id;
	public static volatile SingularAttribute<AbstractCoPermission, String> persianTitle;
	public static volatile SingularAttribute<AbstractCoPermission, String> title;
	public static volatile SingularAttribute<AbstractCoPermission, CoPermissionCategory> category;
	public static volatile SingularAttribute<AbstractCoPermission, String> key;

	public static final String ROLES = "roles";
	public static final String ID = "id";
	public static final String PERSIAN_TITLE = "persianTitle";
	public static final String TITLE = "title";
	public static final String CATEGORY = "category";
	public static final String KEY = "key";

}

