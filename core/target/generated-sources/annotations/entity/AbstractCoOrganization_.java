package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoOrganization.class)
public abstract class AbstractCoOrganization_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoOrganization, CoOrganizationType> organizationType;
	public static volatile SingularAttribute<AbstractCoOrganization, Long> codeDigit;
	public static volatile SingularAttribute<AbstractCoOrganization, CoOrganization> parent;
	public static volatile SetAttribute<AbstractCoOrganization, CoOrganization> children;
	public static volatile SingularAttribute<AbstractCoOrganization, String> name;
	public static volatile SingularAttribute<AbstractCoOrganization, String> description;
	public static volatile SingularAttribute<AbstractCoOrganization, String> pathCode;
	public static volatile SingularAttribute<AbstractCoOrganization, Long> id;
	public static volatile SingularAttribute<AbstractCoOrganization, String> pathId;
	public static volatile SingularAttribute<AbstractCoOrganization, Boolean> leaf;
	public static volatile SingularAttribute<AbstractCoOrganization, Long> parentId;

	public static final String ORGANIZATION_TYPE = "organizationType";
	public static final String CODE_DIGIT = "codeDigit";
	public static final String PARENT = "parent";
	public static final String CHILDREN = "children";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String PATH_CODE = "pathCode";
	public static final String ID = "id";
	public static final String PATH_ID = "pathId";
	public static final String LEAF = "leaf";
	public static final String PARENT_ID = "parentId";

}

