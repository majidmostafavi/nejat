package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoPermissionUsecaseStateAction.class)
public abstract class AbstractCoPermissionUsecaseStateAction_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoPermissionUsecaseStateAction, CoPermission> permission;
	public static volatile SingularAttribute<AbstractCoPermissionUsecaseStateAction, Long> id;
	public static volatile SingularAttribute<AbstractCoPermissionUsecaseStateAction, CoStateUsecaseAction> stateUsecaseAction;

	public static final String PERMISSION = "permission";
	public static final String ID = "id";
	public static final String STATE_USECASE_ACTION = "stateUsecaseAction";

}

