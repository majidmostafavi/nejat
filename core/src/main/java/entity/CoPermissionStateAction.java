package entity;

import javax.persistence.*;

/**
 * Created by majid on 7/24/17.
 */
@Entity
@Table(name = "CO_PERMISSON_STATE_ACTION")
@TableGenerator(name = "PSASequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_PERMISSON_STATE_ACTION" )
@NamedQueries({
        @NamedQuery(name = "findPermissionStateActionByPermissions", query = "select perm.stateAction from CoPermissionStateAction perm  where perm.permission in (:permissions)"),
        @NamedQuery(name = "findPermissionStateActionByPermission", query = "select perm.stateAction from CoPermissionStateAction perm  where perm.permission =:permission"),
        @NamedQuery(name = "findStateByPermission",query = "select psa.stateAction.fromState from CoPermissionStateAction psa where  psa.permission in (:permissions) ")
})
public class CoPermissionStateAction extends AbstractCoPermissionStateAction {
    public CoPermissionStateAction() {
    }
}
