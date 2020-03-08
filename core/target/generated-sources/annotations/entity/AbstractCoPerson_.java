package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractCoPerson.class)
public abstract class AbstractCoPerson_ extends entity.BaseEntity_ {

	public static volatile SingularAttribute<AbstractCoPerson, String> firstName;
	public static volatile SingularAttribute<AbstractCoPerson, String> lastName;
	public static volatile SingularAttribute<AbstractCoPerson, String> fatherName;
	public static volatile SingularAttribute<AbstractCoPerson, String> nationalCode;
	public static volatile SingularAttribute<AbstractCoPerson, String> economicCode;
	public static volatile SingularAttribute<AbstractCoPerson, String> address;
	public static volatile SingularAttribute<AbstractCoPerson, String> mobile;
	public static volatile SingularAttribute<AbstractCoPerson, String> telephone;
	public static volatile SingularAttribute<AbstractCoPerson, Long> id;
	public static volatile SingularAttribute<AbstractCoPerson, String> email;
	public static volatile SingularAttribute<AbstractCoPerson, String> nomineeCode;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String FATHER_NAME = "fatherName";
	public static final String NATIONAL_CODE = "nationalCode";
	public static final String ECONOMIC_CODE = "economicCode";
	public static final String ADDRESS = "address";
	public static final String MOBILE = "mobile";
	public static final String TELEPHONE = "telephone";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String NOMINEE_CODE = "nomineeCode";

}

