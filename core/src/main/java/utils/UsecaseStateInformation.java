package utils;

import entity.CoStateAction;
import entity.CoUsecase;

import java.util.List;

/**
 * Created by majid on 12/6/16.
 */
public class UsecaseStateInformation {

    Class<?> className;
    CoUsecase usecase;
    List<CoStateAction> stateActions;

    public UsecaseStateInformation(Class<?> className, CoUsecase usecase, List<CoStateAction> stateActions) {
        this.className = className;
        this.usecase = usecase;
        this.stateActions = stateActions;
    }

    public Class<?> getClassName() {
        return className;
    }
    public void setClassName(Class<?> className) {
        this.className = className;
    }

    public CoUsecase getUsecase() {
        return usecase;
    }
    public void setUsecase(CoUsecase usecase) {
        this.usecase = usecase;
    }

    public List<CoStateAction> getStateActions() {
        return stateActions;
    }
    public void setStateActions(List<CoStateAction> stateActions) {
        this.stateActions = stateActions;
    }
}
