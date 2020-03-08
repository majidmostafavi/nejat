package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoState.class)
public abstract class AbstractCoState_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoState, String> color;
	public static volatile SingularAttribute<AbstractCoState, Boolean> rejected;
	public static volatile SingularAttribute<AbstractCoState, Boolean> signature;
	public static volatile SingularAttribute<AbstractCoState, Boolean> editable;
	public static volatile SingularAttribute<AbstractCoState, Boolean> start;
	public static volatile SingularAttribute<AbstractCoState, Boolean> deletable;
	public static volatile SetAttribute<AbstractCoState, CoStateAction> toStateActions;
	public static volatile SingularAttribute<AbstractCoState, Boolean> accounting;
	public static volatile SingularAttribute<AbstractCoState, Boolean> printable;
	public static volatile SingularAttribute<AbstractCoState, Boolean> general;
	public static volatile SetAttribute<AbstractCoState, CoStateAction> fromStateActions;
	public static volatile SingularAttribute<AbstractCoState, Boolean> stable;
	public static volatile SingularAttribute<AbstractCoState, Boolean> draft;
	public static volatile SingularAttribute<AbstractCoState, String> name;
	public static volatile SingularAttribute<AbstractCoState, Boolean> autoGeneration;
	public static volatile SingularAttribute<AbstractCoState, Boolean> end;
	public static volatile SingularAttribute<AbstractCoState, Long> id;
	public static volatile SingularAttribute<AbstractCoState, Class> clazz;
	public static volatile SingularAttribute<AbstractCoState, String> key;
	public static volatile SingularAttribute<AbstractCoState, Boolean> validation;

	public static final String COLOR = "color";
	public static final String REJECTED = "rejected";
	public static final String SIGNATURE = "signature";
	public static final String EDITABLE = "editable";
	public static final String START = "start";
	public static final String DELETABLE = "deletable";
	public static final String TO_STATE_ACTIONS = "toStateActions";
	public static final String ACCOUNTING = "accounting";
	public static final String PRINTABLE = "printable";
	public static final String GENERAL = "general";
	public static final String FROM_STATE_ACTIONS = "fromStateActions";
	public static final String STABLE = "stable";
	public static final String DRAFT = "draft";
	public static final String NAME = "name";
	public static final String AUTO_GENERATION = "autoGeneration";
	public static final String END = "end";
	public static final String ID = "id";
	public static final String CLAZZ = "clazz";
	public static final String KEY = "key";
	public static final String VALIDATION = "validation";

}

