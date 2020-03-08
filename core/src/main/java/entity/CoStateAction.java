package entity;

import javax.persistence.*;

/**
 * Created by majid on 11/30/16.
 */
@Entity
@Cacheable
@Table(name = "CO_STATE_ACTION")
@TableGenerator(name = "STATEACTIONSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_STATE_ACTION" )
@NamedQueries({
        @NamedQuery(name = "findStateActionByClass", query = "select stateAction from CoStateAction stateAction where stateAction.active=true and stateAction.fromState.clazz=:class and stateAction.toState.clazz=:class"),
        @NamedQuery(name = "countStateActionByNameAndFromAndToState", query = "select count(stateAction) from CoStateAction stateAction where stateAction.active=true and stateAction.stateName=:stateName and stateAction.fromState=:fromState and stateAction.toState=:toState"),
        @NamedQuery(name = "countStateActionByNameAndFromAndToStateForEdit", query = "select count(stateAction) from CoStateAction stateAction where  stateAction.active=true and stateAction.id not in :id and stateAction.stateName=:stateName and stateAction.fromState=:fromState and stateAction.toState=:toState")

})
public class CoStateAction extends AbstractCoStateAction {
    public CoStateAction() {
    }
}
