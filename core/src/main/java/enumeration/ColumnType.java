package enumeration;

import utils.Enumable;

/**
 * Created by majid on 4/20/17.
 */
public  enum ColumnType implements Enumable {
    Predicate("Predicate", "message.general.columnType.predicate"),
    Formula("Formula", "message.general.columnType.formula");

    String key;
    String label;

    private ColumnType(String key, String label) {
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

    public static ColumnType get(String key) {
        if(key!=null){
            if(key.equals(Predicate.getKey())){
                return Predicate;
            }else if(key.equals(Formula.getKey())){
                return Formula;
            }
        }
        return null;
    }

}
