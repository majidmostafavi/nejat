package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BaseEntity.class)
public abstract class BaseEntity_ {

	public static volatile SingularAttribute<BaseEntity, Long> updatedBy;
	public static volatile SingularAttribute<BaseEntity, Long> createdBy;
	public static volatile SingularAttribute<BaseEntity, Date> created;
	public static volatile SingularAttribute<BaseEntity, Boolean> active;
	public static volatile SingularAttribute<BaseEntity, Date> updated;

	public static final String UPDATED_BY = "updatedBy";
	public static final String CREATED_BY = "createdBy";
	public static final String CREATED = "created";
	public static final String ACTIVE = "active";
	public static final String UPDATED = "updated";

}

