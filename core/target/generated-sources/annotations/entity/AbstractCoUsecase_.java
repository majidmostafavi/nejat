package entity;

import enumeration.SubSystem;
import enumeration.UsecaseType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoUsecase.class)
public abstract class AbstractCoUsecase_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoUsecase, SubSystem> subSystem;
	public static volatile SetAttribute<AbstractCoUsecase, CoUsecaseAction> usecaseActions;
	public static volatile SingularAttribute<AbstractCoUsecase, String> name;
	public static volatile SingularAttribute<AbstractCoUsecase, UsecaseType> usecaseType;
	public static volatile SingularAttribute<AbstractCoUsecase, Long> id;
	public static volatile SingularAttribute<AbstractCoUsecase, Class> clazz;

	public static final String SUB_SYSTEM = "subSystem";
	public static final String USECASE_ACTIONS = "usecaseActions";
	public static final String NAME = "name";
	public static final String USECASE_TYPE = "usecaseType";
	public static final String ID = "id";
	public static final String CLAZZ = "clazz";

}

