package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoStateAction.class)
public abstract class AbstractCoStateAction_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoStateAction, Boolean> lockAble;
	public static volatile SingularAttribute<AbstractCoStateAction, Boolean> skipAble;
	public static volatile SingularAttribute<AbstractCoStateAction, CoState> fromState;
	public static volatile SingularAttribute<AbstractCoStateAction, CoState> toState;
	public static volatile SingularAttribute<AbstractCoStateAction, Boolean> rollBack;
	public static volatile SingularAttribute<AbstractCoStateAction, String> stateName;
	public static volatile SingularAttribute<AbstractCoStateAction, Boolean> finalize;
	public static volatile SingularAttribute<AbstractCoStateAction, Long> id;
	public static volatile SingularAttribute<AbstractCoStateAction, Long> type;
	public static volatile SingularAttribute<AbstractCoStateAction, Integer> version;

	public static final String LOCK_ABLE = "lockAble";
	public static final String SKIP_ABLE = "skipAble";
	public static final String FROM_STATE = "fromState";
	public static final String TO_STATE = "toState";
	public static final String ROLL_BACK = "rollBack";
	public static final String STATE_NAME = "stateName";
	public static final String FINALIZE = "finalize";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String VERSION = "version";

}

