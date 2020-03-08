package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum BudgetPermissions {
    BudgetMenu("budget:BudgetMenu","message.permission.budget.BudgetMenu"),
    BudgetBasicInfo("budget:basicInfo","message.permission.budget.basicInfoMenu"),
    BudgetProcess("budget:process","message.permission.budget.processMenu"),
    BudgetReport("budget:report","message.permission.budget.reportMenu"),
    BudgetAccounting("budget:accounting","message.permission.budget.accountingMenu"),

    // accountingMenu
        //basicInfo
    BudgetType("budget:budgetType", "message.permission.budget.budgetType"),
    Budget("budget:budget", "message.permission.budget.budget"),
    AllocationPeriod("budget:allocationPeriod","message.permission.budget.allocationPeriod"),
    SpecialReportType("budget:SpecialReportType","message.permission.budget.specialReportType"),
    revenueDeduction("budget:revenueDeduction","message.permission.budget.revenueDeduction"),
        //process
    Bill("budget:bill" , "message.permission.budget.bill"),
    ApprovedBudget("budget:approvedBudget", "message.permission.budget.approvedBudget"),
    Signify("budget:signify" , "message.permission.budget.signify"),
    InternalAgreementBudget("budget:internalAgreementBudget" , "message.permission.budget.internalAgreementBudget"),
    AllocationBudget("budget:allocationBudget" , "message.permission.budget.allocationBudget"),
    AutoAllocationBudget("budget:autoAllocationBudget" , "message.permission.budget.autoAllocationBudget"),
    AutoInternalAgreement("budget:autoInternalAgreement" , "message.permission.budget.autoInternalAgreement"),
    RevenueAllocation("budget:revenueAllocation" , "message.permission.budget.revenueAllocation"),
    Allotment("budget:allotment" , "message.permission.budget.allotment"),
    BudgetCredit("budget:budgetCredit" , "message.permission.budget.budgetCredit"),
        //report
    ApprovedReport("budget:approvedReport","message.permission.budget.approvedReport"),
    AgreementReport("budget:agreementReport","message.permission.budget.agreementReport"),
    ApprovedChart("budget:approvedChart","message.permission.budget.approvedChart"),
    AgreementChart("budget:agreementChart","message.permission.budget.agreementChart"),
    SpecialReport("budget:SpecialReport","message.permission.budget.specialReport"),

        //accounting
    BudgetDocumentTemplate("budget:budgetDocumentTemplate" , "message.permission.budget.budgetDocumentTemplate"),

    // budgetAction
        //budgetType
    budgetTypeCreate("budget:budgetTypeCreate","message.permission.budget.budgetTypeCreate"),
    budgetTypeEdit("budget:budgetTypeEdit","message.permission.budget.budgetTypeEdit"),
    budgetTypeDelete("budget:budgetTypeDelete","message.permission.budget.budgetTypeDelete"),
    budgetTypeDisable("budget:budgetTypeDisable","message.permission.budget.budgetTypeDisable"),
    budgetTypeEnable("budget:budgetTypeEnable","message.permission.budget.budgetTypeEnable"),

        //budget
    budgetCreate("budget:budgetCreate","message.permission.budget.budgetCreate"),
    budgetEdit("budget:budgetEdit","message.permission.budget.budgetEdit"),
    budgetDelete("budget:budgetDelete","message.permission.budget.budgetDelete"),
    budgetDisable("budget:budgetDisable","message.permission.budget.budgetDisable"),
    budgetEnable("budget:budgetEnable","message.permission.budget.budgetEnable"),
    
        //allocationPeriod
    allocationPeriodCreate("budget:allocationPeriodCreate","message.permission.budget.allocationPeriodCreate"),
    allocationPeriodEdit("budget:allocationPeriodEdit","message.permission.budget.allocationPeriodEdit"),
    allocationPeriodDelete("budget:allocationPeriodDelete","message.permission.budget.allocationPeriodDelete"),
    allocationPeriodDisable("budget:allocationPeriodDisable","message.permission.budget.allocationPeriodDisable"),
    allocationPeriodEnable("budget:allocationPeriodEnable","message.permission.budget.allocationPeriodEnable"),
    
        //SpecialReportType
    SpecialReportTypeCreate("budget:BudgetSpecialReportTypeCreate","message.permission.budget.specialReportType.create"),
    SpecialReportTypeEdit("budget:BudgetSpecialReportTypeEdit","message.permission.budget.specialReportType.edit"),
    SpecialReportTypeDelete("budget:BudgetSpecialReportTypeDelete","message.permission.budget.specialReportType.Delete"),
    SpecialReportTypeDisable("budget:SpecialReportTypeDisable","message.permission.budget.SpecialReportTypeDisable"),
    SpecialReportTypeEnable("budget:SpecialReportTypeEnable","message.permission.budget.SpecialReportTypeEnable"),
    
        //revenueDeduction
    revenueDeductionCreate("budget:revenueDeductionCreate","message.permission.budget.revenueDeductionCreate"),
    revenueDeductionEdit("budget:revenueDeductionEdit","message.permission.budget.revenueDeductionEdit"),
    revenueDeductionDelete("budget:revenueDeductionDelete","message.permission.budget.revenueDeductionDelete"),

        //specialReport
    specialReportCreate("budget:specialReportCreate","message.permission.budget.specialReportCreate"),
    specialReportEdit("budget:specialReportEdit","message.permission.budget.specialReportEdit"),
    specialReportDelete("budget:specialReportDelete","message.permission.budget.specialReportDelete"),
    SpecialReportCreateGeneral("budget:SpecialReportCreateGeneral","message.permission.budget.specialReport.create.general"),

        //bill
    BillCreate("budget:billCreate","message.permission.budget.billCreate"),
    BillEdit("budget:billEdit","message.permission.budget.billEdit"),
    BillDelete("budget:billDelete","message.permission.budget.billDelete"),

        //approvedBudget
    ApprovedBudgetCreate("budget:approvedBudgetCreate","message.permission.budget.approvedBudgetCreate"),
    ApprovedBudgetEdit("budget:approvedBudgetEdit","message.permission.budget.approvedBudgetEdit"),
    ApprovedBudgetDelete("budget:approvedBudgetDelete","message.permission.budget.approvedBudgetDelete"),
    ApprovedBudgetCopy("budget:approvedBudgetCopy","message.permission.budget.approvedBudgetCopy"),
    ApprovedBudgetDocumentCreate("budget:approvedBudgetDocumentCreate","message.permission.budget.approvedBudgetDocumentCreate"),
    ApprovedBudgetDocumentPreview("budget:approvedBudgetDocumentPreview","message.permission.budget.approvedBudgetDocumentPreview"),

        //signify
    signifyCreate("budget:signifyCreate","message.permission.budget.signifyCreate"),
    SignifyEdit("budget:signifyEdit","message.permission.budget.signifyEdit"),
    SignifyDelete("budget:signifyDelete","message.permission.budget.signifyDelete"),

        //internalAgreementBudget
    InternalAgreementBudgetCreate("budget:internalAgreementBudgetCreate","message.permission.budget.internalAgreementBudgetCreate"),
    InternalAgreementBudgetEdit("budget:internalAgreementBudgetEdit","message.permission.budget.internalAgreementBudgetEdit"),
    InternalAgreementBudgetCopy("budget:internalAgreementBudgetCopy","message.permission.budget.internalAgreementBudgetCopy"),
    InternalAgreementBudgetDelete("budget:internalAgreementBudgetDelete","message.permission.budget.internalAgreementBudgetDelete"),
    InternalAgreementBudgetDocumentCreate("budget:internalAgreementBudgetDocumentCreate","message.permission.budget.internalAgreementBudgetDocumentCreate"),
    InternalAgreementBudgetDocumentPreview("budget:internalAgreementBudgetDocumentPreview","message.permission.budget.internalAgreementBudgetDocumentPreview"),

        //allocationBudget
    AllocationBudgetCreate("budget:allocationBudgetCreate","message.permission.budget.allocationBudgetCreate"),
    AllocationBudgetEdit("budget:allocationBudgetEdit","message.permission.budget.allocationBudgetEdit"),
    AllocationBudgetDelete("budget:allocationBudgetDelete","message.permission.budget.allocationBudgetDelete"),
    AllocationBudgetDocumentCreate("budget:allocationBudgetDocumentCreate","message.permission.budget.allocationBudgetDocumentCreate"),
    AllocationBudgetDocumentPreview("budget:allocationBudgetDocumentPreview","message.permission.budget.allocationBudgetDocumentPreview"),

        //autoAllocationBudget
    AutoAllocationBudgetCreate("budget:autoAllocationBudgetCreate","message.permission.budget.autoAllocationBudgetCreate"),
    AutoAllocationBudgetCopy("budget:autoAllocationBudgetCopy","message.permission.budget.autoAllocationBudgetCopy"),
    AutoAllocationBudgetEdit("budget:autoAllocationBudgetEdit","message.permission.budget.autoAllocationBudgetEdit"),
    AutoAllocationBudgetDelete("budget:autoAllocationBudgetDelete","message.permission.budget.autoAllocationBudgetDelete"),
    AutoAllocationAllocationDelete("budget:autoAllocationAllocationDelete","message.permission.budget.autoAllocationAllocationDelete"),
    AutoAllocationAllocationCreate("budget:autoAllocationAllocationCreate","message.permission.budget.autoAllocationAllocationCreate"),

        //autoInternalAgreement
    AutoInternalAgreementCreate("budget:autoInternalAgreementCreate","message.permission.budget.autoInternalAgreementCreate"),
    AutoInternalAgreementCopy("budget:autoInternalAgreementCopy","message.permission.budget.autoInternalAgreementCopy"),
    AutoInternalAgreementEdit("budget:autoInternalAgreementEdit","message.permission.budget.autoInternalAgreementEdit"),
    AutoInternalAgreementDelete("budget:autoInternalAgreementDelete","message.permission.budget.autoInternalAgreementDelete"),
    AutoInternalAgreementAgreementDelete("budget:AutoInternalAgreementAgreementDelete","message.permission.budget.autoInternalAgreementAgreementDelete"),
    AutoInternalAgreementAgreementCreate("budget:AutoInternalAgreementAgreementCreate","message.permission.budget.autoInternalAgreementAgreementCreate"),

    //revenueAllocation
    RevenueAllocationCreate("budget:revenueAllocationCreate","message.permission.budget.revenueAllocationCreate"),

    //budgetDocumentTemplate
    budgetDocumentTemplateCreate("budget:budgetDocumentTemplateCreate","message.permission.budget.budgetDocumentTemplateCreate"),
    budgetDocumentTemplateEdit("budget:budgetDocumentTemplateEdit","message.permission.budget.budgetDocumentTemplateEdit"),
    budgetDocumentTemplateDelete("budget:budgetDocumentTemplateDelete","message.permission.budget.budgetDocumentTemplateDelete"),
    budgetDocumentTemplateCopy("budget:budgetDocumentTemplateCopy","message.permission.budget.budgetDocumentTemplateCopy"),

    //allotment
    allotmentCreate("budget:allotmentCreate","message.permission.budget.allotmentCreate"),
    allotmentEdit("budget:allotmentEdit","message.permission.budget.allotmentEdit"),
    allotmentDelete("budget:allotmentDelete","message.permission.budget.allotmentDelete"),

    //budgetCredit
    budgetCreditCreate("budget:budgetCreditCreate","message.permission.budget.budgetCreditCreate"),
    budgetCreditEdit("budget:budgetCreditEdit","message.permission.budget.budgetCreditEdit"),
    budgetCreditDelete("budget:budgetCreditDelete","message.permission.budget.budgetCreditDelete");

    private final String label;

    private final String key;

    private BudgetPermissions(String key, String label) {
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
