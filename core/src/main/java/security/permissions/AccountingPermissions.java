package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum AccountingPermissions {
    AccountingMenu("accounting:accountingMenu","message.permission.accounting.accountingMenu"),
    AccountingBasicInfo("accounting:basicInfo","message.permission.accounting.basicInfoMenu"),
    AccountingProcess("accounting:process","message.permission.accounting.processMenu"),
    AccountingReport("accounting:report","message.permission.accounting.reportMenu"),
    AccountingInterchangeControllerOrgan("accounting:interchangeControllerOrgan","message.permission.accounting.interchangeControllerOrganMenu"),

    // accountingSubMenu
    ReportSubMenu("accounting:reportSubMenu","message.permission.accounting.reportSubMenu"),
    DocumentSubMenu("accounting:documentSubMenu","message.permission.accounting.documentSubMenu"),
    IndependentAccountSubMenu("accounting:independentAccountSubMenu","message.permission.accounting.independentAccountSubMenu"),
    AccountSubMenu("accounting:accountSubMenu","message.permission.accounting.accountSubMenu"),
    AccountingTypeSubMenu("accounting:accountingTypeSubMenu","message.permission.accounting.accountingTypeSubMenu"),
    SettingSubMenu("accounting:settingSubMenu","message.permission.accounting.settingSubMenu"),
    NumberingDocuments("accounting:numberingDocuments","message.permission.accounting.numberingDocuments"),
    DocumentControl("accounting:documentControl","message.permission.accounting.documentControl"),
    DocumentClosureSetting("accounting:documentClosureSetting","message.permission.accounting.documentClosureSetting"),
    DocumentOpeningSetting("accounting:documentOpeningSetting","message.permission.accounting.documentOpeningSetting"),
    DocumentClosure("accounting:documentClosure","message.permission.accounting.documentClosure"),
    DocumentOpening("accounting:documentOpening","message.permission.accounting.documentOpening"),

    // accountingMenu
    AccountingType("accounting:accountingType","message.permission.accounting.accountingType"),
    AccountType("accounting:accountType", "message.permission.accounting.accountType"),
    AccountLevel("accounting:accountLevel", "message.permission.accounting.accountLevel"),
    Account("accounting:account", "message.permission.accounting.account"),
    DocSubject("accounting:docSubject", "message.permission.accounting.docSubject"),
    IndependentRelationAccount("accounting:independentRelationAccount","message.permission.accounting.accountIndependentRelation"),
    SubjectIndependentRAccount("accounting:subjectIndependentRAccount", "message.permission.accounting.subjectIndependentRAccount"),
    AccountingTypeOrganization("accounting:accountingTypeOrganization","message.permission.accounting.accountingTypeOrganization"),
    JournalReport("accounting:journalReport","message.permission.accounting.journalReport"),
    NotebookDocumentReport("accounting:notebookDocumentReport","message.permission.accounting.notebookDocumentReport"),
    BalanceReport("accounting:balanceReport","message.permission.accounting.balanceReport"),
    reviewAccount("accounting:reviewAccount","message.permission.accounting.reviewAccount"),
    Document("accounting:Document","message.permission.accounting.Document"),
    DocumentDesc("accounting:documentDesc","message.permission.accounting.documentDesc"),
    SpecialReportType("accounting:SpecialReportType","message.permission.accounting.specialReportType"),
    AccountReplace("accounting:accountReplace","message.permission.accounting.accountReplace"),
    Option("accounting:Option","message.permission.accounting.option"),
    UnlockDocument("accounting:unlockDocument","message.permission.accounting.unlockDocument"),
    AccountIndependentItem("accounting:accountIndependentItem","message.permission.accounting.accountIndependentItem"),
    Create_GroupSubjectIndependentRAccount("accounting:Create_GroupSubjectIndependentRAccount","message.permission.accounting.create_groupSubjectIndependentRAccount"),
    Create_GroupDetailIndependentRAccount("accounting:Create_GroupDetailIndependentRAccount","message.permission.accounting.create_groupDetailIndependentRAccount"),
    SpecialReport("accounting:SpecialReport","message.permission.accounting.specialReport"),
    SanamaOption("accounting:SanamaOption","message.permission.accounting.sanamaOption"),
    SanamaAccount("accounting:SanamaAccount","message.permission.accounting.sanamaAccount"),
    SanamaAccountRelation("accounting:SanamaAccountRelation","message.permission.accounting.sanamaAccountRelation"),
    AccountingActivityReport("accounting:accountingActivityReport","message.permission.accounting.accountingActivityReport"),
    StairReviewAccount("accounting:stairReviewAccount","message.permission.accounting.stairReviewAccount"),



    // accountingAction
       // accountingType
    AccountingTypeCreate("accounting:AccountingTypeCreate","message.permission.accounting.accountingType.create"),
    AccountingTypeEdit("accounting:AccountingTypeEdit","message.permission.accounting.accountingType.edit"),
    AccountingTypeDelete("accounting:AccountingTypeDelete","message.permission.accounting.accountingType.Delete"),
       //accountType
    AccountTypeCreate("accounting:AccountTypeCreate","message.permission.accounting.accountType.create"),
    AccountTypeEdit("accounting:AccountTypeEdit","message.permission.accounting.accountType.edit"),
    AccountTypeDelete("accounting:AccountTypeDelete","message.permission.accounting.accountType.Delete"),
       //accountLevel
    AccountLevelCreate("accounting:AccountLevelCreate","message.permission.accounting.accountLevel.create"),
    AccountLevelEdit("accounting:AccountLevelEdit","message.permission.accounting.accountLevel.edit"),
    AccountLevelDelete("accounting:AccountLevelDelete","message.permission.accounting.accountLevel.Delete"),
       //account
    AccountCreate("accounting:AccountCreate","message.permission.accounting.account.create"),
    AccountEdit("accounting:AccountEdit","message.permission.accounting.account.edit"),
    AccountCodeEdit("accounting:AccountCodeEdit","message.permission.accounting.account.code.edit"),
    AccountDelete("accounting:AccountDelete","message.permission.accounting.account.Delete"),
       //AccountingTypeOrganization
    AccountingTypeOrganizationCreate("accounting:AccountingTypeOrganizationCreate","message.permission.accounting.accountingTypeOrganization.create"),
    AccountingTypeOrganizationEdit("accounting:AccountingTypeOrganizationEdit","message.permission.accounting.accountingTypeOrganization.edit"),
    AccountingTypeOrganizationDelete("accounting:AccountingTypeOrganizationDelete","message.permission.accounting.accountingTypeOrganization.Delete"),
       //DocumentDesc
    DocumentDescCreate("accounting:DocumentDescCreate","message.permission.accounting.documentDesc.create"),
    DocumentDescEdit("accounting:DocumentDescEdit","message.permission.accounting.documentDesc.edit"),
    DocumentDescDelete("accounting:DocumentDescDelete","message.permission.accounting.documentDesc.Delete"),
       //Option
    OptionCreate("accounting:OptionCreate","message.permission.accounting.option.create"),
    OptionEdit("accounting:OptionEdit","message.permission.accounting.option.edit"),
    OptionDelete("accounting:OptionDelete","message.permission.accounting.option.Delete"),
       //SpecialReportType
    SpecialReportTypeCreate("accounting:SpecialReportTypeCreate","message.permission.accounting.specialReportType.create"),
    SpecialReportTypeEdit("accounting:SpecialReportTypeEdit","message.permission.accounting.specialReportType.edit"),
    SpecialReportTypeDelete("accounting:SpecialReportTypeDelete","message.permission.accounting.specialReportType.Delete"),
       //DocSubject
    DocSubjectCreate("accounting:DocSubjectCreate","message.permission.accounting.docSubject.create"),
    DocSubjectEdit("accounting:DocSubjectEdit","message.permission.accounting.docSubject.edit"),
    DocSubjectDelete("accounting:DocSubjectDelete","message.permission.accounting.docSubject.Delete"),
    DocSubjectEnable("accounting:DocSubjectEnable","message.permission.accounting.docSubject.enable"),
    DocSubjectDisable("accounting:DocSubjectDisable","message.permission.accounting.docSubject.disable"),
       //Document
    DocumentCreate("accounting:DocumentCreate","message.permission.accounting.document.create"),
    DocumentEdit("accounting:DocumentEdit","message.permission.accounting.document.edit"),
    DocumentDelete("accounting:DocumentDelete","message.permission.accounting.document.delete"),
    DocumentPrint("accounting:DocumentPrint","message.permission.accounting.document.print"),
    DocumentCreateNotification("accounting:DocumentCreteNotification","message.permission.accounting.document.notification.create"),
    DocumentAttachment("accounting:DocumentAttachment","message.permission.accounting.document.attachment"),
    DocumentCopy("accounting:DocumentCopy","message.permission.accounting.document.copy"),
    DocumentSaveValidation("accounting:DocumentSaveValidation","message.permission.accounting.document.save.validation"),
    DocumentCreateChangeDocumentDate("accounting:DocumentCreateChangeDocumentDate","message.permission.accounting.document.createChangeDocumentDate"),
       //IndependentRAccount
    SubjectIndependentRAccountEdit("accounting:SubjectIndependentRAccountEdit","message.permission.accounting.subjectIndependentRAccount.edit"),
    DetailIndependentRAccountCreate("accounting:DetailIndependentRAccountCreate","message.permission.accounting.detailIndependentRAccount.create"),
    DetailIndependentRAccountDelete("accounting:DetailIndependentRAccountDelete","message.permission.accounting.detailIndependentRAccount.delete"),
       //SpecialReport
    SpecialReportDetail("accounting:SpecialReportDetail","message.permission.accounting.specialReport.detail"),
    SpecialReportCreate("accounting:SpecialReportCreate","message.permission.accounting.specialReport.create"),
    SpecialReportCreateGeneral("accounting:SpecialReportCreateGeneral","message.permission.accounting.specialReport.create.general"),
    SpecialReportEdit("accounting:SpecialReportEdit","message.permission.accounting.specialReport.edit"),
    SpecialReportDelete("accounting:SpecialReportDelete","message.permission.accounting.specialReport.delete"),
    SpecialReportCopy("accounting:SpecialReportCopy","message.permission.accounting.specialReport.copy"),
        //SpecialReportScope
    SpecialReportScope("accounting:SpecialReportScope","message.permission.accounting.SpecialReportScope"),
       //SanamaOption
    SanamaOptionCreate("accounting:SanamaOptionCreate","message.permission.accounting.sanamaOption.create"),
    SanamaOptionEdit("accounting:SanamaOptionEdit","message.permission.accounting.sanamaOption.edit"),
    SanamaOptionDelete("accounting:SanamaOptionDelete","message.permission.accounting.sanamaOption.delete"),
       //SanamaAccount
    SanamaAccountCreate("accounting:SanamaAccountCreate","message.permission.accounting.sanamaAccount.create"),
    SanamaAccountEdit("accounting:SanamaAccountEdit","message.permission.accounting.sanamaAccount.edit"),
    SanamaAccountDelete("accounting:SanamaAccountDelete","message.permission.accounting.sanamaAccount.delete"),
       //SanamaAccountRelation
    SanamaAccountRelationCreate("accounting:SanamaAccountRelationCreate","message.permission.accounting.sanamaAccountRelation.create"),
    SanamaAccountRelationEdit("accounting:SanamaAccountRelationEdit","message.permission.accounting.sanamaAccountRelation.edit"),
    SanamaAccountRelationDelete("accounting:SanamaAccountRelationDelete","message.permission.accounting.sanamaAccountRelation.delete"),

    Accountant("accounting:accountant","message.permission.accounting.accountant"),
    LimitedToAccountingTypes("accounting:limitedToAccountingTypes","message.permission.accounting.limitedToAccountingTypes");

//    IndependentAccount("accounting:independentAccount", "message.permission.accounting.independentAccount"),
//
//    AccountReview("accounting:accountReview", "message.permission.accounting.accountReview"),
//    AccountDoc("accounting:accountDoc", "message.permission.accounting.accountDoc"),
//
//    DocDescription("accounting:docDescription", "message.permission.accounting.docDescription"),
//    AccountEdit("accounting:edit", "message.permission.accounting.edit"),
//    AccountDelete("accounting:delete", "message.permission.accounting.delete"),
//    AccountComposite("accounting:composite", "message.permission.accounting.composite"),
//    AccountCancel("accounting:cancel", "message.permission.accounting.cancel"),
//    AccountTemp("accounting:temp", "message.permission.accounting.temp"),
//    AccountCheck("accounting:check", "message.permission.accounting.check"),
//    AccountProtestation("accounting:protestation", "message.permission.accounting.protestation"),
//    AccountAudit("accounting:audit", "message.permission.accounting.audit"),
//    AccountFinal("accounting:final", "message.permission.accounting.final"),
//    AccountClosingConditions("accounting:closingConditions", "message.permission.accounting.closing.conditions"),
//    AccountClosing("accounting:accountClosing", "message.permission.accounting.closing"),
//    AccountInventoryRelation("accounting:accountingInventoryRelation", "message.permission.account.inventory.relation"),
//    GeneralInventoryAccountRelation("accounting:generalInventoryAccountRelation", "message.permission.account.inventory.general.relation");


    private final String key;
    private final String label;

    private AccountingPermissions(String key, String label) {
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