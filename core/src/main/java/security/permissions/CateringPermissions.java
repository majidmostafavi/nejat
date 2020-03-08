package security.permissions;

/**
 * Created by qazale on 12/18/2017.
 */
public enum CateringPermissions {
    CateringMenu("catering:CateringMenu","message.permission.catering.cateringMenu"),
    CateringBasicInfo("Catering:basicInfo","message.permission.catering.basicInfoMenu"),
    CateringProcess("Catering:process","message.permission.catering.processMenu"),
    CateringReport("Catering:report","message.permission.catering.reportMenu");


    private final String key;
    private final String label;

    private CateringPermissions(String key, String label) {
        this.label = label;
        this.key = key;
    }




    public String getKey() {
        return key;
    }
    public String getLabel() {
        return this.label;
    }


}

