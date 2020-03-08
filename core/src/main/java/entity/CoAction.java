package entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * Created by majid on 11/30/16.
 */
@Entity
@Cacheable
@TableGenerator(name = "ActionSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_ACTION" )
@Table(name = "CO_ACTION")
public class CoAction extends AbstractCoAction {
    public CoAction() {
    }
}
