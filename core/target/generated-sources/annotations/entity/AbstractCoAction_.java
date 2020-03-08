package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoAction.class)
public abstract class AbstractCoAction_ extends entity.BaseEntity_ {

	public static volatile SetAttribute<AbstractCoAction, CoUsecaseAction> usecaseActions;
	public static volatile SingularAttribute<AbstractCoAction, String> name;
	public static volatile SingularAttribute<AbstractCoAction, String> methodName;
	public static volatile SingularAttribute<AbstractCoAction, Long> id;

	public static final String USECASE_ACTIONS = "usecaseActions";
	public static final String NAME = "name";
	public static final String METHOD_NAME = "methodName";
	public static final String ID = "id";

}

