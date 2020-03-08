package enumeration;

/**
 * Created by majid on 11/30/16.
 */
public enum  StateType {
    State("State", "message.general.usecaseType.State"),
    NonState("NonState", "message.general.usecaseType.NonState");

    String key;
    String label;

    private StateType(String key, String label) {
        this.key = key;
        this.label = label;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public static StateType get(String key) {
        if(key!=null){
            if(key.equals(State.getKey())){
                return State;
            }else if(key.equals(NonState.getKey())){
                return NonState;
            }
        }
        return null;
    }
}
