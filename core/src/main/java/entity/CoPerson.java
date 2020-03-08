package entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "CO_PERSON")
@TableGenerator(name = "personSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_PERSON" )
public class CoPerson extends AbstractCoPerson {
}
