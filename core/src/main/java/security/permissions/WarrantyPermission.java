package security.permissions;

/**
 * Created by hossein on 2/28/17.
 */
public enum WarrantyPermission {

    WarrantyMenu("warranty:warrantyMenu","message.permission.warranty.warrantyMenu"),
    WarrantyBasicInfo("warranty:basicInfo","message.permission.warranty.basicInfoMenu"),
    WarrantyProcess("warranty:process","message.permission.warranty.processMenu"),
    WarrantyReport("warranty:report","message.permission.warranty.reportMenu"),
    WarrantyAccounting("warranty:accounting","message.permission.warranty.accountingMenu"),

    // WarrantyMenu
    WarrantySubject("warranty:WarrantySubject","message.permission.warranty.warrantySubject"),
    WarrantyType("warranty:WarrantyType","message.permission.warranty.warrantyType"),
    WarrantyMaster("warranty:WarrantyMaster","message.permission.warranty.warrantyMaster"),
    WarrantyDocumentTemplate("warranty:WarrantyDocumentTemplate","message.permission.warranty.warrantyDocumentTemplate"),
    WarrantyAlarm("warranty:WarrantyAlarm","message.permission.warranty.warrantyAlarm"),
    WarrantyNotifySetting("warranty:WarrantyNotifySetting","message.permission.warranty.warrantyNotifySetting"),
    WarrantyAction("warranty:WarrantyAction","message.permission.warranty.warrantyAction"),
    WarrantyOptions("warranty:WarrantyOptions","message.permission.warranty.WarrantyOptions"),

    // WarrantyAction
         //WarrantySubject
    WarrantySubjectCreate("warranty:WarrantySubjectCreate","message.permission.warranty.warrantySubjectCreate"),
    WarrantySubjectEdit("warranty:WarrantySubjectEdit","message.permission.warranty.warrantySubjectEdit"),
    WarrantySubjectDelete("warranty:WarrantySubjectDelete","message.permission.warranty.warrantySubjectDelete"),
    WarrantySubjectDisable("warranty:WarrantySubjectDisable","message.permission.warranty.warrantySubjectDisable"),
    WarrantySubjectEnable("warranty:WarrantySubjectEnable","message.permission.warranty.warrantySubjectEnable"),
         //WarrantyType
    WarrantyTypeCreate("warranty:WarrantyTypeCreate","message.permission.warranty.warrantyTypeCreate"),
    WarrantyTypeEdit("warranty:WarrantyTypeEdit","message.permission.warranty.warrantyTypeEdit"),
    WarrantyTypeDelete("warranty:WarrantyTypeDelete","message.permission.warranty.warrantyTypeDelete"),
    WarrantyTypeDisable("warranty:WarrantyTypeDisable","message.permission.warranty.warrantyTypeDisable"),
    WarrantyTypeEnable("warranty:WarrantyTypeEnable","message.permission.warranty.warrantyTypeEnable"),
         //WarrantyNotifySetting
    WarrantyNotifySettingCreate("warranty:WarrantyNotifySettingCreate","message.permission.warranty.WarrantyNotifySettingCreate"),
    WarrantyNotifySettingEdit("warranty:WarrantyNotifySettingEdit","message.permission.warranty.WarrantyNotifySettingEdit"),
    WarrantyNotifySettingDelete("warranty:WarrantyNotifySettingDelete","message.permission.warranty.WarrantyNotifySettingDelete"),
         //WarrantyMaster
    WarrantyMasterCreate("warranty:WarrantyMasterCreate","message.permission.warranty.WarrantyMasterCreate"),
    WarrantyMasterEdit("warranty:WarrantyMasterEdit","message.permission.warranty.WarrantyMasterEdit"),
    WarrantyMasterDelete("warranty:WarrantyMasterDelete","message.permission.warranty.WarrantyMasterDelete"),
         //WarrantyAction
    WarrantyActionAction("warranty:WarrantyActionAction","message.permission.warranty.WarrantyActionAction"),
    WarrantyActionEdit("warranty:WarrantyActionEdit","message.permission.warranty.WarrantyActionEdit"),
    WarrantyActionDelete("warranty:WarrantyActionDelete","message.permission.warranty.WarrantyActionDelete"),
    WarrantyActionWarrantyDocumentCreate("warranty:WarrantyActionWarrantyDocumentCreate","message.permission.warranty.warrantyActions.warrantyDocument.create"),
         //WarrantyAlarm
    WarrantyAlarmAction("warranty:WarrantyAlarmAction","message.permission.warranty.warrantyAlarmAction"),
         //WarrantyDocumentTemplate
    WarrantyDocumentTemplateCreate("warranty:WarrantyDocumentTemplateCreate","message.permission.warranty.WarrantyDocumentTemplateCreate"),
    WarrantyDocumentTemplateEdit("warranty:WarrantyDocumentTemplateEdit","message.permission.warranty.WarrantyDocumentTemplateEdit"),
    WarrantyDocumentTemplateDelete("warranty:WarrantyDocumentTemplateDelete","message.permission.warranty.WarrantyDocumentTemplateDelete"),
        //Options
    WarrantyOptionsCreate("warranty:WarrantyOptionsCreate","message.permission.warranty.WarrantyOptionsCreate");



    private String key;
    private String label;

    WarrantyPermission(String key, String title) {
        this.key = key;
        this.label = title;
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

}
