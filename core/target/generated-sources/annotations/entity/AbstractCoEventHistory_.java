package entity;

import enumeration.EventType;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoEventHistory.class)
public abstract class AbstractCoEventHistory_ {

	public static volatile SingularAttribute<AbstractCoEventHistory, Long> personnelID;
	public static volatile SingularAttribute<AbstractCoEventHistory, Long> record;
	public static volatile SingularAttribute<AbstractCoEventHistory, Long> id;
	public static volatile SingularAttribute<AbstractCoEventHistory, EventType> eventType;
	public static volatile SingularAttribute<AbstractCoEventHistory, Class> clazz;
	public static volatile SingularAttribute<AbstractCoEventHistory, LocalDate> eventDate;

	public static final String PERSONNEL_ID = "personnelID";
	public static final String RECORD = "record";
	public static final String ID = "id";
	public static final String EVENT_TYPE = "eventType";
	public static final String CLAZZ = "clazz";
	public static final String EVENT_DATE = "eventDate";

}

