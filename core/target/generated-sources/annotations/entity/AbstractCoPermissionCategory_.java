package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoPermissionCategory.class)
public abstract class AbstractCoPermissionCategory_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoPermissionCategory, Long> code;
	public static volatile SetAttribute<AbstractCoPermissionCategory, CoPermission> permissions;
	public static volatile SingularAttribute<AbstractCoPermissionCategory, Long> id;
	public static volatile SingularAttribute<AbstractCoPermissionCategory, String> categoryName;

	public static final String CODE = "code";
	public static final String PERMISSIONS = "permissions";
	public static final String ID = "id";
	public static final String CATEGORY_NAME = "categoryName";

}

