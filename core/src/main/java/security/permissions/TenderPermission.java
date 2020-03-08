package security.permissions;

/**
 * Created by hossein on 2/1/17.
 */
public enum TenderPermission {

    TenderMenu("tender:TenderMenu","message.permission.tender.tenderMenu"),
//    TenderSubject("tender:tenderSubject","message.permission.tender.tenderSubject"),
//    TenderMaster("tender:tenderMaster","message.permission.tender.tenderMaster"),
    TenderBasicInfo("tender:basicInfo","message.permission.tender.basicInfoMenu"),
    TenderProcess("tender:process","message.permission.tender.processMenu"),
    TenderReport("tender:report","message.permission.tender.reportMenu"),

    //TenderMenu
    TenderTransactionAmount("Tender:TenderTransactionAmount","message.permission.Tender.TenderTransactionAmount"),
    TenderNewspaper("Tender:TenderNewspaper","message.permission.Tender.TenderNewspaper"),
    TenderScheduleItem("Tender:TenderScheduleItem","message.permission.Tender.tenderScheduleItem"),
    TenderDocument("Tender:TenderDocument","message.permission.Tender.TenderDocument"),
    TenderNotifyDomain("Tender:TenderNotifyDomain","message.permission.Tender.TenderNotifyDomain"),
    TenderSubject("Tender:TenderSubject","message.permission.Tender.TenderSubject"),
    TenderAssessment("Tender:TenderAssessment","message.permission.Tender.TenderAssessment"),
    TenderOption("Tender:TenderOption","message.permission.Tender.TenderOption"),
    TenderDepositEstimate("Tender:TenderDepositEstimate","message.permission.Tender.TenderDepositEstimate"),
    TenderMaster("Tender:TenderMaster","message.permission.Tender.TenderMaster"),
    RunningTenderMaster("Tender:RunningTenderMaster","message.permission.Tender.RunningTenderMaster"),
    VStatisticalReport("Tender:VStatisticalReport","message.permission.Tender.VStatisticalReport"),

    //TenderAction
          //TenderTransactionAmount
    TenderTransactionAmountCreate("Tender:TenderTransactionAmountCreate","message.permission.Tender.TenderTransactionAmountCreate"),
    TenderTransactionAmountEdit("Tender:TenderTransactionAmountEdit","message.permission.Tender.TenderTransactionAmountEdit"),
    TenderTransactionAmountDelete("Tender:TenderTransactionAmountDelete","message.permission.Tender.TenderTransactionAmountDelete"),
          //TenderNewspaper
    TenderNewspaperCreate("Tender:TenderNewspaperCreate","message.permission.Tender.TenderNewspaperCreate"),
    TenderNewspaperEdit("Tender:TenderNewspaperEdit","message.permission.Tender.TenderNewspaperEdit"),
    TenderNewspaperDelete("Tender:TenderNewspaperDelete","message.permission.Tender.TenderNewspaperDelete"),
          //TenderScheduleItem
    TenderScheduleItemCreate("Tender:TenderScheduleItemCreate","message.permission.Tender.TenderScheduleItemCreate"),
    TenderScheduleItemEdit("Tender:TenderScheduleItemEdit","message.permission.Tender.TenderScheduleItemEdit"),
    TenderScheduleItemDelete("Tender:TenderScheduleItemDelete","message.permission.Tender.TenderScheduleItemDelete"),
          //TenderDocument
    TenderDocumentCreate("Tender:TenderDocumentCreate","message.permission.Tender.TenderDocumentCreate"),
    TenderDocumentEdit("Tender:TenderDocumentEdit","message.permission.Tender.TenderDocumentEdit"),
    TenderDocumentDelete("Tender:TenderDocumentDelete","message.permission.Tender.TenderDocumentDelete"),
          //TenderNotifyDomain
    TenderNotifyDomainCreate("Tender:TenderNotifyDomainCreate","message.permission.Tender.TenderNotifyDomainCreate"),
    TenderNotifyDomainEdit("Tender:TenderNotifyDomainEdit","message.permission.Tender.TenderNotifyDomainEdit"),
    TenderNotifyDomainDelete("Tender:TenderNotifyDomainDelete","message.permission.Tender.TenderNotifyDomainDelete"),
          //TenderSubject
    TenderSubjectCreate("Tender:TenderSubjectCreate","message.permission.Tender.TenderSubjectCreate"),
    TenderSubjectEdit("Tender:TenderSubjectEdit","message.permission.Tender.TenderSubjectEdit"),
    TenderSubjectDelete("Tender:TenderSubjectDelete","message.permission.Tender.TenderSubjectDelete"),
          //TenderAssessment
    TenderAssessmentCreate("Tender:TenderAssessmentCreate","message.permission.Tender.TenderAssessmentCreate"),
    TenderAssessmentEdit("Tender:TenderAssessmentEdit","message.permission.Tender.TenderAssessmentEdit"),
    TenderAssessmentDelete("Tender:TenderAssessmentDelete","message.permission.Tender.TenderAssessmentDelete"),
          //TenderOption
    TenderOptionCreate("Tender:TenderOptionCreate","message.permission.Tender.TenderOptionCreate"),
    TenderOptionEdit("Tender:TenderOptionEdit","message.permission.Tender.TenderOptionEdit"),
    TenderOptionDelete("Tender:TenderOptionDelete","message.permission.Tender.TenderOptionDelete"),
          //TenderDepositEstimate
    TenderDepositEstimateCreate("Tender:TenderDepositEstimateCreate","message.permission.Tender.TenderDepositEstimateCreate"),
    TenderDepositEstimateEdit("Tender:TenderDepositEstimateEdit","message.permission.Tender.TenderDepositEstimateEdit"),
    TenderDepositEstimateDelete("Tender:TenderDepositEstimateDelete","message.permission.Tender.TenderDepositEstimateDelete"),
          //TenderMaster
    TenderMasterCreate("Tender:TenderMasterCreate","message.permission.Tender.TenderMasterCreate"),
    TenderMasterEdit("Tender:TenderMasterEdit","message.permission.Tender.TenderMasterEdit"),
    TenderMasterDelete("Tender:TenderMasterDelete","message.permission.Tender.TenderMasterDelete"),
    TenderMasterCopy("Tender:TenderMasterCopy","message.permission.Tender.TenderMasterCopy"),
    TenderMasterTenderSuppliers("Tender:TenderMasterTenderSuppliers","message.permission.Tender.TenderMasterTenderSuppliers"),
    TenderMasterTenderScore("Tender:TenderMasterTenderScore","message.permission.Tender.TenderMasterTenderScore");

    private String key;
    private String label;

    TenderPermission(String key, String title) {
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
