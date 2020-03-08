package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoStateUsecaseAction.class)
public abstract class AbstractCoStateUsecaseAction_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoStateUsecaseAction, CoUsecaseAction> usecaseAction;
	public static volatile SingularAttribute<AbstractCoStateUsecaseAction, CoStateAction> stateAction;
	public static volatile SingularAttribute<AbstractCoStateUsecaseAction, Long> id;

	public static final String USECASE_ACTION = "usecaseAction";
	public static final String STATE_ACTION = "stateAction";
	public static final String ID = "id";

}

