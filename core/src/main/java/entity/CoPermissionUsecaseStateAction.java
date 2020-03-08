package entity;

import enumeration.SubSystem;
import enumeration.UsecaseType;
import utils.UsecaseSupport;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * Created by majid on 12/10/16.
 */
@Entity
@Table(name = "CO_PERMISSION_USCS_ST_ACTN")
@TableGenerator(name = "PUSASequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_PERMISSION_USCS_ST_ACTN" )
public class CoPermissionUsecaseStateAction extends AbstractCoPermissionUsecaseStateAction{
    public CoPermissionUsecaseStateAction() {
    }
}
