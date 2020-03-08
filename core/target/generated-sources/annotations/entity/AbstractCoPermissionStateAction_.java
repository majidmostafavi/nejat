package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoPermissionStateAction.class)
public abstract class AbstractCoPermissionStateAction_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoPermissionStateAction, CoStateAction> stateAction;
	public static volatile SingularAttribute<AbstractCoPermissionStateAction, CoPermission> permission;
	public static volatile SingularAttribute<AbstractCoPermissionStateAction, Long> id;

	public static final String STATE_ACTION = "stateAction";
	public static final String PERMISSION = "permission";
	public static final String ID = "id";

}

