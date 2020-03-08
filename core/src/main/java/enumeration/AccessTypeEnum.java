package enumeration;

import utils.Enumable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shaghayegh on 1/13/18.
 */
public enum AccessTypeEnum implements Enumable {

    system("system","message.common.accessType.system",false),
    supplier("supplier","message.common.accessType.supplier",true),
    domain("domain","message.common.accessType.domain",true);

    private final String key;
    private final String label;
    private final Boolean selectable;

    AccessTypeEnum(String key, String name, Boolean selectable) {
        this.label = name;
        this.key = key;
        this.selectable = selectable;
    }

    public String getKey() {
        return key;
    }
    public String getLabel() {
        return label;
    }
    public Boolean getSelectable() {
        return selectable;
    }

    public static AccessTypeEnum getValue (String key){
        if (key!=null){
            if (key.equals(system.getKey())){
                return system;
            }else if (key.equals(supplier.getKey())){
                return supplier;
            }else if (key.equals(domain.getKey())){
                return domain;
            }
        }
        return null;
    }

    public static List<AccessTypeEnum> findAll(){ return Arrays.asList(values());}

    public static List<AccessTypeEnum> findSelectables(){
        List<AccessTypeEnum> accessTypeEnums = new ArrayList<>(0);
        for(AccessTypeEnum accessTypeEnum : values()){
            if(accessTypeEnum.getSelectable()){
                accessTypeEnums.add(accessTypeEnum);
            }
        }
        return accessTypeEnums;
    }

}
