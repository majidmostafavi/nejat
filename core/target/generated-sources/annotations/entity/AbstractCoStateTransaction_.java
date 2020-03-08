package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoStateTransaction.class)
public abstract class AbstractCoStateTransaction_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoStateTransaction, Date> date;
	public static volatile SingularAttribute<AbstractCoStateTransaction, CoStateAction> stateAction;
	public static volatile SingularAttribute<AbstractCoStateTransaction, CoPerson> person;
	public static volatile SingularAttribute<AbstractCoStateTransaction, Long> record;
	public static volatile SingularAttribute<AbstractCoStateTransaction, Long> id;
	public static volatile SingularAttribute<AbstractCoStateTransaction, String> message;
	public static volatile SingularAttribute<AbstractCoStateTransaction, Class> clazz;

	public static final String DATE = "date";
	public static final String STATE_ACTION = "stateAction";
	public static final String PERSON = "person";
	public static final String RECORD = "record";
	public static final String ID = "id";
	public static final String MESSAGE = "message";
	public static final String CLAZZ = "clazz";

}

