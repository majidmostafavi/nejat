package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum CreditPermissions {

    CreditMenu("credit:creditMenu","message.permission.credit.creditMenu"),
    CreditBasicInfo("credit:basicInfo","message.permission.credit.basicInfoMenu"),
    CreditProcess("credit:process","message.permission.credit.processMenu"),
    CreditReport("credit:report","message.permission.credit.reportMenu"),
    CreditAccounting("credit:accounting","message.permission.credit.accountingMenu"),

    // CreditMenu
    CreditCategory("credit:creditCategory","message.permission.credit.creditCategory"),
    CreditBuyRequest("credit:creditBuyRequest","message.permission.credit.creditBuyRequest"),
    CreditSalary("credit:creditSalary","message.permission.credit.creditSalary"),
    CreditContract("credit:creditContract","message.permission.credit.creditContract"),
    CreditDocumentTemplate("credit:creditDocumentTemplate","message.permission.credit.creditDocumentTemplate"),
    SalaryPaymentDocument("credit:salaryPaymentDocument","message.permission.credit.salaryPaymentDocument"),
    SalaryPaymentControl("credit:salaryPaymentControl","message.permission.credit.salaryPaymentControl"),
    groupCreditIdentify("credit:groupCreditIdentify","message.permission.credit.groupCreditIdentify"),
    CreditBillPayment("credit:creditBillPayment","message.permission.credit.creditBillPayment"),
    paymentSubject("credit:paymentSubject","message.permission.credit.paymentSubject"),
    CreditSalaryConditional("credit:creditSalaryConditional","message.permission.credit.creditSalaryConditional"),

    // CreditAction
        //CreditCategory
    CreditCategoryCreate("credit:creditCategoryCreate", "message.permission.credit.creditCategoryCreate"),
    CreditCategoryEdit("credit:creditCategoryEdit", "message.permission.credit.creditCategoryEdit"),
    CreditCategoryDelete("credit:creditCategoryDelete", "message.permission.credit.creditCategoryDelete"),
        //CreditBuyRequest
    CreditBuyRequestCreate("credit:creditBuyRequestCreate", "message.permission.credit.creditBuyRequestCreate"),
    CreditBuyRequestEdit("credit:creditBuyRequestEdit", "message.permission.credit.creditBuyRequestEdit"),
    CreditBuyRequestDelete("credit:creditBuyRequestDelete", "message.permission.credit.creditBuyRequestDelete"),
    //CreditSalary
    CreditSalaryCreate("credit:creditSalaryCreate", "message.permission.credit.creditSalaryCreate"),
    CreditSalaryEdit("credit:creditSalaryEdit", "message.permission.credit.creditSalaryEdit"),
    CreditSalaryDelete("credit:creditSalaryDelete", "message.permission.credit.creditSalaryDelete"),
    CreditSalaryChangeOrganization("credit:creditSalaryChangeOrganization", "message.permission.credit.creditSalaryChangeOrganization"),
    //CreditContract
    CreditContractCreate("credit:creditContractCreate","message.permission.credit.creditContractCreate"),
    CreditContractEdit("credit:creditContractEdit","message.permission.credit.creditContractEdit"),
    CreditContractDelete("credit:creditContractDelete","message.permission.credit.creditContractDelete"),
    //CreditBillPayment
    CreditBillPaymentCreate("credit:creditBillPaymentCreate","message.permission.credit.creditBillPaymentCreate"),
    CreditBillPaymentEdit("credit:creditBillPaymentEdit","message.permission.credit.creditBillPaymentEdit"),
    CreditBillPaymentDelete("credit:creditBillPaymentDelete","message.permission.credit.creditBillPaymentDelete"),
    //CreditSalaryConditional
    CreditSalaryConditionalCreate("credit:creditSalaryConditionalCreate", "message.permission.credit.creditSalaryConditionalCreate"),
    CreditSalaryConditionalEdit("credit:creditSalaryConditionalEdit", "message.permission.credit.creditSalaryConditionalEdit"),
    CreditSalaryConditionalDelete("credit:creditSalaryConditionalDelete", "message.permission.credit.creditSalaryConditionalDelete");



//    CreateReqMoney("credit:createReqMoney", "message.permission.credit.createReqMoney"),
//    ManagerConfirm("credit:managerConfirm", "message.permission.credit.managerConfirm"),
//    AccountingConfirm("credit:accountingConfirm", "message.permission.credit.accountingConfirm");

    private String key;
    private String label;

    CreditPermissions(String key, String label) {
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

}
