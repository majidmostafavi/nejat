package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoUsecaseAction.class)
public abstract class AbstractCoUsecaseAction_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoUsecaseAction, CoUsecase> usecase;
	public static volatile SingularAttribute<AbstractCoUsecaseAction, CoAction> action;
	public static volatile SingularAttribute<AbstractCoUsecaseAction, Long> id;

	public static final String USECASE = "usecase";
	public static final String ACTION = "action";
	public static final String ID = "id";

}

