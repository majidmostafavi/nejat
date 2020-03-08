package entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * Created by majid on 11/30/16.
 */
@Entity
@Table(name = "CO_USECASE_ACTION")
@TableGenerator(name = "USECASEACTIONSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_USECASE_ACTION" )
public class CoUsecaseAction extends AbstractCoUsecaseAction {
    public CoUsecaseAction() {
    }
}
