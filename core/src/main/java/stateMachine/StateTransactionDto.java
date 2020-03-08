package stateMachine;

import java.util.Date;

/**
 * Created by majid on 7/24/17.
 */
public class StateTransactionDto implements Comparable<StateTransactionDto> {
    private Long personnelId;
    private String firstName;
    private String lastName;
    private String message;
    private Date actionDate;
    private Long stateActionId;
    private String stateActionName;


    /* Constructor  */

    public StateTransactionDto(Long personnelId, String firstName, String lastName, String message, Date actionDate, Long stateActionId, String stateActionName) {
        this.personnelId = personnelId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
        this.actionDate = actionDate;
        this.stateActionId = stateActionId;
        this.stateActionName = stateActionName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Date getActionDate() {
        return actionDate;
    }
    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public Long getPersonnelId() {
        return personnelId;
    }
    public void setPersonnelId(Long personnelId) {
        this.personnelId = personnelId;
    }

    public Long getStateActionId() {
        return stateActionId;
    }
    public void setStateActionId(Long stateActionId) {
        this.stateActionId = stateActionId;
    }

    public String getStateActionName() {
        return stateActionName;
    }
    public void setStateActionName(String stateActionName) {
        this.stateActionName = stateActionName;
    }

    @Override
    public int compareTo(StateTransactionDto o) {
        return this.getActionDate().compareTo(o.getActionDate());
    }
}
