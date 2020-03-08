package enumeration;

import utils.Enumable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by majid on 5/22/17.
 */
public enum SubSystem implements Enumable {
    Accounting("Accounting", "message.general.usecaseType.Accounting"),
    Research("Research","message.general.usecaseType.Research"),
    Inventory("Inventory", "message.general.usecaseType.Inventory"),
    Treasury("Treasury", "message.general.usecaseType.Treasury"),
    Salary("Salary", "message.general.usecaseType.Salary"),
    Asset("Asset", "message.general.usecaseType.Asset"),
    Warranty("Warranty","message.general.usecaseType.Warranty"),
    Budget("Budget", "message.general.usecaseType.Budget"),
    Credit("Credit", "message.general.usecaseType.Credit"),
    Revenue("Revenue", "message.general.usecaseType.Revenue"),
    Tender("Tender", "message.general.usecaseType.Tender"),
    Contract("Contract", "message.general.usecaseType.Contract"),
    HumanResource("HumanResource", "message.general.usecaseType.HumanResource"),
    Catering("Catering","message.general.usecaseType.Catering"),
    Documentation("Documentation","message.general.usecaseType.Documentation"),
    Common("Common","message.general.usecaseType.common"),
    Facility("Facility","message.general.usecaseType.facility"),
    Transportation("Transportation","message.general.usecaseType.transportation");

    String key;
    String label;

    private SubSystem(String key, String label) {
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

    @Override
    public int getOrdinal(String s) {
        return 0;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static SubSystem getValue(String key){
        if(key!=null){
            if (key.equals(Accounting.getKey())){
                return  Accounting;
            }else if(key.equals(Asset.getKey())){
                return Asset;
            }else if(key.equals(Budget.getKey())){
                return Budget;
            }else if(key.equals(Contract.getKey())){
                return Contract;
            }else if(key.equals(Credit.getKey())){
                return Credit;
            }else if(key.equals(Documentation.getKey())){
                return Documentation;
            }else if(key.equals(HumanResource.getKey())){
                return HumanResource;
            }else if(key.equals(Inventory.getKey())){
                return Inventory;
            }else if(key.equals(Revenue.getKey())){
                return Revenue;
            }else if(key.equals(Salary.getKey())){
                return Salary;
            }else if(key.equals(Tender.getKey())){
                return Tender;
            }else if(key.equals(Treasury.getKey())){
                return Treasury;
            }else if(key.equals(Warranty.getKey())){
                return Warranty;
            }else if(key.equals(Research.getKey())){
                return Research;
            }else if(key.equals(Common.getKey())){
                return Common;
            }else if(key.equals(Facility.getKey())){
                return Facility;
            }else if(key.equals(Transportation.getKey())){
                return Transportation;
            }
        }
        return null;
    }


    public static List<SubSystem> getAllSubSystem(){
        return Arrays.asList(values());
    }
}
