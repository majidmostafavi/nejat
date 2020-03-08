package security.permissions;

/**
 * Created by hossein on 1/31/17.
 */
public enum RevenuePermission {

    RevenueMenu("revenue:revenueMenu","message.permission.revenue.revenueMenu"),
    Revenue("revenue:revenue","message.permission.revenue.revenue"),
    RevenueType("revenue:revenueType","message.permission.revenue.revenueType"),
    //ManualRevenue("revenue:manualRevenue","message.permission.revenue.manualRevenue"),
    RevenueTypeChart("revenue:revenueTypeChart","message.permission.revenue.revenueTypeChart"),

    RevenueBasicInfo("revenue:basicInfo","message.permission.revenue.basicInfoMenu"),
    RevenueProcess("revenue:process","message.permission.revenue.processMenu"),
    RevenueReport("revenue:report","message.permission.revenue.reportMenu"),
    RevenueAccounting("revenue:accounting","message.permission.revenue.accountingMenu"),

    // RevenueMenu
    revenueSubject("revenue:revenueSubject","message.permission.revenue.revenueSubject"),
    revenueGetType("revenue:revenueGetType","message.permission.revenue.revenueGetType"),
    receive("revenue:receive","message.permission.revenue.receive"),
    revenueRequest("revenue:revenueRequest","message.permission.revenue.revenueRequest"),
    revenueAgreement("revenue:revenueAgreement","message.permission.revenue.revenueAgreement"),
    identifyDocumentTemplate("revenue:identifyDocumentTemplate", "message.permission.revenue.identifyDocumentTemplate"),
    receiveDocumentTemplate("revenue:receiveDocumentTemplate", "message.permission.revenue.receiveDocumentTemplate"),
    revenueFinancialOperationType("revenue:financialOperationType","message.permission.revenue.financialOperationType"),
    revenueRequestType("revenue:revenueRequestType","message.permission.revenue.revenueRequestType"),

    //revenueSubject
    revenueSubjectCreate("revenue:revenueSubjectCreate","message.permission.revenue.revenueSubjectCreate"),
    revenueSubjectEdit("revenue:revenueSubjectEdit","message.permission.revenue.revenueSubjectEdit"),
    revenueSubjectDelete("revenue:revenueSubjectDelete","message.permission.revenue.revenueSubjectDelete"),
    revenueSubjectEnable("revenue:revenueSubjectEnable","message.permission.revenue.revenueSubjectEnable"),
    revenueSubjectDisable("revenue:revenueSubjectDisable","message.permission.revenue.revenueSubjectDisable"),

    //revenueType
    revenueTypeCreate("revenue:revenueTypeCreate","message.permission.revenue.revenueTypeCreate"),
    revenueTypeEdit("revenue:revenueTypeEdit","message.permission.revenue.revenueTypeEdit"),
    revenueTypeDelete("revenue:revenueTypeDelete","message.permission.revenue.revenueTypeDelete"),
    revenueTypeEnable("revenue:revenueTypeEnable","message.permission.revenue.revenueTypeEnable"),
    revenueTypeDisable("revenue:revenueTypeDisable","message.permission.revenue.revenueTypeDisable"),

    //revenueGetType
    revenueGetTypeCreate("revenue:revenueGetTypeCreate","message.permission.revenue.revenueGetTypeCreate"),
    revenueGetTypeEdit("revenue:revenueGetTypeEdit","message.permission.revenue.revenueGetTypeEdit"),
    revenueGetTypeDelete("revenue:revenueGetTypeDelete","message.permission.revenue.revenueGetTypeDelete"),

    //receive
    receiveCreate("revenue:receiveCreate","message.permission.revenue.receiveCreate"),
    receiveEdit("revenue:receiveEdit","message.permission.revenue.receiveEdit"),
    receiveDelete("revenue:receiveDelete","message.permission.revenue.receiveDelete"),

    //revenueRequest
    revenueRequestCreate("revenue:revenueRequestCreate","message.permission.revenue.revenueRequestCreate"),
    revenueRequestEdit("revenue:revenueRequestEdit","message.permission.revenue.revenueRequestEdit"),
    revenueRequestDelete("revenue:revenueRequestDelete","message.permission.revenue.revenueRequestDelete"),

    //revenueAgreement
    revenueAgreementCreate("revenue:revenueAgreementCreate","message.permission.revenue.revenueAgreementCreate"),
    revenueAgreementEdit("revenue:revenueAgreementEdit","message.permission.revenue.revenueAgreementEdit"),
    revenueAgreementDelete("revenue:revenueAgreementDelete","message.permission.revenue.revenueAgreementDelete"),

    //Revenue
    revenueCreate("revenue:revenueCreate","message.permission.revenue.revenueCreate"),
    revenueEdit("revenue:revenueEdit","message.permission.revenue.revenueEdit"),
    revenueDelete("revenue:revenueDelete","message.permission.revenue.revenueDelete"),
    revenueRevenueCollection("revenue:revenueRevenueCollection","message.permission.revenue.revenueRevenueCollection"),

    //identifyDocumentTemplate
    identifyDocumentTemplateCreate("revenue:identifyDocumentTemplateCreate", "message.permission.revenue.identifyDocumentTemplateCreate"),
    identifyDocumentTemplateEdit("revenue:identifyDocumentTemplateEdit", "message.permission.revenue.identifyDocumentTemplateEdit"),
    identifyDocumentTemplateDelete("revenue:identifyDocumentTemplateDelete", "message.permission.revenue.identifyDocumentTemplateDelete"),

    //receiveDocumentTemplate
    receiveDocumentTemplateCreate("revenue:receiveDocumentTemplateCreate", "message.permission.revenue.receiveDocumentTemplateCreate"),
    receiveDocumentTemplateEdit("revenue:receiveDocumentTemplateEdit", "message.permission.revenue.receiveDocumentTemplateEdit"),
    receiveDocumentTemplateDelete("revenue:receiveDocumentTemplateDelete", "message.permission.revenue.receiveDocumentTemplateDelete"),

    //financialOperationType
    financialOperationTypeCreate("revenue:financialOperationTypeCreate","message.permission.revenue.financialOperationTypeCreate"),
    financialOperationTypeEdit("revenue:financialOperationTypeEdit","message.permission.revenue.financialOperationTypeEdit"),
    financialOperationTypeDelete("revenue:financialOperationTypeDelete","message.permission.revenue.financialOperationTypeDelete"),
    financialOperationTypeEnable("revenue:financialOperationTypeEnable","message.permission.revenue.financialOperationTypeEnable"),
    financialOperationTypeDisable("revenue:financialOperationTypeDisable","message.permission.revenue.financialOperationTypeDisable"),

    //financialOperationType
    revenueRequestTypeCreate("revenue:revenueRequestTypeCreate","message.permission.revenue.revenueRequestTypeCreate"),
    revenueRequestTypeEdit("revenue:revenueRequestTypeEdit","message.permission.revenue.revenueRequestTypeEdit"),
    revenueRequestTypeDelete("revenue:revenueRequestTypeDelete","message.permission.revenue.revenueRequestTypeDelete"),
    revenueRequestTypeEnable("revenue:revenueRequestTypeEnable","message.permission.revenue.revenueRequestTypeEnable"),
    revenueRequestTypeeDisable("revenue:revenueRequestTypeeDisable","message.permission.revenue.revenueRequestTypeDisable");



    private final String label;

    private final String key;

    private RevenuePermission(String key, String label) {
        this.label = label;
        this.key = key;
    }

    public String getLabel() {
        return this.label;
    }

    public String getKey() {
        return key;
    }
}
