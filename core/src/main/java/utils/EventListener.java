package utils;

import entity.CoStateAction;
import utils.exception.DuplicateDataException;
import utils.exception.RelationDataException;
import utils.exception.SaveRecordException;

/**
 * Created by majid on 12/4/16.
 */

public interface EventListener {

    default boolean beforeProcessStarted(CoStateAction stateAction){
        return false;
    }
    default boolean afterProcessStarted(CoStateAction stateAction){
        return false;
    }
    default boolean beforeProcessCompleted(CoStateAction stateAction){
        return false;
    }
    default boolean afterProcessCompleted(CoStateAction stateAction) throws RelationDataException,SaveRecordException,DuplicateDataException {
        return false;
    }
    default boolean beforeApproved(CoStateAction stateAction) throws DuplicateDataException, SaveRecordException, RelationDataException {
        return false;
    }
    default boolean afterApproved(CoStateAction stateAction) throws Exception {
        return false;
    }
    default boolean beforeNonApproved(CoStateAction stateAction){
        return false;
    }
    default boolean afterNonApproved(CoStateAction stateAction){
        return false;
    }
    default boolean beforeVariableChanged(CoStateAction stateAction){
        return false;
    }
    default boolean afterVariableChanged(CoStateAction stateAction){
        return false;
    }
}
