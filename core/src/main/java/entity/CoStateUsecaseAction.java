package entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * Created by majid on 12/3/16.
 */
@Entity
@Table(name = "CO_STATE_USECASE_ACTION")
@TableGenerator(name = "STATEUSECASEACTIONSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_STATE_USECASE_ACTION" )
public class CoStateUsecaseAction extends AbstractCoStateUsecaseAction{
    public CoStateUsecaseAction() {
    }
}
