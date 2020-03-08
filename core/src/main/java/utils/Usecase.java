package utils;

import entity.CoUsecaseAction;

import java.util.List;

/**
 * Created by majid on 12/6/16.
 */
public class Usecase {

    /*Fields*/
    private long usecaseId;
    private long systemId;
    private String name;
    private Class beanClass;
    private Class persistentClass;
    private List<CoUsecaseAction> actionList;

    /* constructor */
    public Usecase(long usecaseId, long systemId, String name, Class beanClass, Class persistentClass, List<CoUsecaseAction> actionList) {
        this.usecaseId = usecaseId;
        this.systemId = systemId;
        this.name = name;
        this.beanClass = beanClass;
        this.persistentClass = persistentClass;
        this.actionList = actionList;
    }


    /*    Setter And Getter Methods*/
    public long getUsecaseId() {
        return usecaseId;
    }
    public void setUsecaseId(long usecaseId) {
        this.usecaseId = usecaseId;
    }

    public long getSystemId() {
        return systemId;
    }
    public void setSystemId(long systemId) {
        this.systemId = systemId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Class getBeanClass() {
        return beanClass;
    }
    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getPersistentClass() {
        return persistentClass;
    }
    public void setPersistentClass(Class persistentClass) {
        this.persistentClass = persistentClass;
    }

    public List<CoUsecaseAction> getActionList() {
        return actionList;
    }
    public void setActionList(List<CoUsecaseAction> actionList) {
        this.actionList = actionList;
    }
}
