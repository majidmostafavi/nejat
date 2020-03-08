package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum ContractPermissions {
    ContractMenu("contract:contractMenu","message.permission.contract.contractMenu"),
    ContractBasicInfo("contract:basicInfo","message.permission.contract.basicInfoMenu"),
    ContractProcess("contract:process","message.permission.contract.processMenu"),
    ContractReport("contract:report","message.permission.contract.reportMenu"),
    ContractAccounting("contract:accounting","message.permission.contract.accountingMenu"),
    ContractSubject("contract:contractSubject", "message.permission.contract.contractSubject"),
    ContractType("contract:contractType","message.permission.contract.ContractType"),
    ContractPhase("contract:contractPhase","message.permission.contract.ContractPhase"),
    Deduction("contract:Deduction","message.permission.contract.Deduction"),
    Contract("contract:contract","message.permission.contract.contract"),
    ContractPayment("contract:ContractPayment", "message.permission.contract.ContractPayment"),
    IdentifyDocument("contract:identifyDocument", "message.permission.contract.identifyDocument"),
    ContractDocumentTemplate("contract:ContractDocumentTemplate", "message.permission.contract.ContractDocumentTemplate"),

    DeductionDocumentTemplate("contract:DeductionDocumentTemplate", "message.permission.contract.DeductionDocumentTemplate"),
    ContractMethod("contract:contractMethod", "message.permission.contract.contractMethod"),

    ContractDeduction("contract:contractDeduction","message.permission.contract.contractDeduction"),
    ContractLevel("contract:contractLevel","message.permission.contract.contractLevel"),

    //ContractAction
        //contractSubject
    ContractSubjectCreate("contract:contractSubjectCreate","message.permission.contract.contractSubjectCreate"),
    ContractSubjectEdit("contract:contractSubjectEdit","message.permission.contract.contractSubjectEdit"),
    ContractSubjectDelete("contract:contractSubjectDelete","message.permission.contract.contractSubjectDelete"),
    ContractSubjectDisable("contract:contractSubjectDisable","message.permission.contract.contractSubjectDisable"),
    ContractSubjectEnable("contract:contractSubjectEnable","message.permission.contract.contractSubjectEnable"),

        //ContractTyp
    ContractTypeCreate("contract:contractTypeCreate","message.permission.contract.contractTypeCreate"),
    ContractTypeEdit("contract:contractTypeEdit","message.permission.contract.contractTypeEdit"),
    ContractTypeDelete("contract:contractTypeDelete","message.permission.contract.contractTypeDelete"),
    ContractTypeDisable("contract:contractTypeDisable","message.permission.contract.contractTypeDisable"),
    ContractTypeEnable("contract:contractTypeEnable","message.permission.contract.contractTypeEnable"),

        //ContractPhase
    ContractPhaseCreate("contract:contractPhaseCreate","message.permission.contract.contractPhaseCreate"),
    ContractPhaseEdit("contract:contractPhaseEdit","message.permission.contract.contractPhaseEdit"),
    ContractPhaseDelete("contract:contractPhaseDelete","message.permission.contract.contractPhaseDelete"),
    ContractPhaseDisable("contract:contractPhaseDisable","message.permission.contract.contractPhaseDisable"),
    ContractPhaseEnable("contract:contractPhaseEnable","message.permission.contract.contractPhaseEnable"),

        //Deduction
    DeductionCreate("contract:deductionCreate","message.permission.contract.deductionCreate"),
    DeductionEdit("contract:deductionEdit","message.permission.contract.deductionEdit"),
    DeductionDelete("contract:deductionDelete","message.permission.contract.deductionDelete"),
    DeductionDisable("contract:deductionDisable","message.permission.contract.deductionDisable"),
    DeductionEnable("contract:deductionEnable","message.permission.contract.deductionEnable"),

        //Contract
    ContractCreate("contract:contractCreate","message.permission.contract.contractCreate"),
    ContractStatement("contract:contractStatement","message.permission.contract.contractStatement"),
    Operation("contract:operation","message.permission.contract.operation"),
    ContractEdit("contract:contractEdit","message.permission.contract.contractEdit"),
    ContractDelete("contract:contractDelete","message.permission.contract.contractDelete"),

        //ContractDocumentTemplate
    ContractDocumentTemplateCreate("contract:contractDocumentTemplateCreate","message.permission.contract.contractDocumentTemplateCreate"),
    ContractDocumentTemplateEdit("contract:contractDocumentTemplateEdit","message.permission.contract.contractDocumentTemplateEdit"),
    ContractDocumentTemplateDelete("contract:contractDocumentTemplateDelete","message.permission.contract.contractDocumentTemplateDelete"),
    ContractDocumentTemplateCopy("contract:contractDocumentTemplateCopy","message.permission.contract.contractDocumentTemplateCopy"),

        //identifyDocument

    IdentifyDocumentCreate("contract:identifyDocumentCreate","message.permission.contract.identifyDocumentCreate"),



//    Specification("contract:specification", "message.permission.contract.specification"),
//    Tender("contract:tender", "message.permission.contract.tender"),
//    TenderDelete("contract:tenderDelete", "message.permission.contract.tender"),
//    TenderManagerConfirm("contract:tenderManagerConfirm", "message.permission.contract.tenderManagerConfirm"),
//    TenderManagerAdvertising("contract:tenderAdvertisingConfirm", "message.permission.contract.tenderManagerAdvertising"),
//    TenderManagerParticipants("contract:tenderParticipantsConfirm", "message.permission.contract.tenderManagerParticipanting"),
//    TenderNotifyToWinner("contract:notifyToWinner", "message.permission.contract.tenderNotifyToWinner"),
//    TenderNotifiedToWinner("contract:notifiedToWinner", "message.permission.contract.tenderNotifiedToWinner"),
//    TenderFinalConfirm("contract:tenderFinalConfirm", "message.permission.contract.tenderFinalConfirm")
    ;

    private String key;
    private String label;

    ContractPermissions(String key, String title) {
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
