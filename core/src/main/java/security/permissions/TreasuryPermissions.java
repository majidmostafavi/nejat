package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum TreasuryPermissions {

    TreasuryMenu("treasury:treasuryMenu","message.permission.treasury.treasuryMenu"),
    TreasuryBasicInfo("Treasury:basicInfo","message.permission.treasury.basicInfoMenu"),
    TreasuryProcess("Treasury:process","message.permission.treasury.processMenu"),
    TreasuryReport("Treasury:report","message.permission.treasury.reportMenu"),
    TreasuryAccounting("Treasury:accounting","message.permission.treasury.accountingMenu"),

    // TreasuryMenu
    Bank("treasury:bank", "message.permission.treasury.bank"),
    BankAccount("treasury:bankAccount", "message.permission.treasury.bankAccount"),
    BankBranch("treasury:bankBranch","message.permission.treasury.bankBranch"),
    BankAccountType("treasury:bankAccountType","message.permission.treasury.bankAccountType"),
    BankIdentifyCode("treasury:bankIdentifyCode", "message.permission.treasury.bankIdentifyCode"),
    Check("treasury:check", "message.permission.treasury.check"),
    CheckBook("treasury:checkBook", "message.permission.treasury.checkBook"),
    DrawCheck("treasury:drawCheque","message.permission.treasury.drawCheque"),
    CreateBankAccountTransaction("treasury:createBankAccountTransaction","message.permission.treasury.createBankAccountTransaction"),
    BankAccountTransaction("treasury:bankAccountTransaction","message.permission.treasury.bankAccountTransaction"),
    bankAccountTransactionNonHarvesting("treasury:bankAccountTransactionNonHarvesting","message.permission.treasury.bankAccountTransactionNonHarvesting"),
    DeleteBankAccountTransaction("treasury:deleteBankAccountTransaction","message.permission.treasury.deleteBankAccountTransaction"),
    Contradiction("treasury:contradiction","message.permission.treasury.contradiction"),
    CreateContradiction("treasury:createContradiction","message.permission.treasury.createContradiction"),
    Notification("treasury:notification","message.permission.treasury.notification"),
    StatementWebService("treasury:statementWebService", "message.permission.treasury.statementWebService"),
    treasuryDocumentTemplate("treasury:treasuryDocumentTemplate", "message.permission.treasury.treasuryDocumentTemplate"),



    //TreasuryAction
       //bank
    BankCreate("treasury:bankCreate","message.permission.treasury.bankCreate"),
    BankEdit("treasury:bankEdit","message.permission.treasury.bankEdit"),
    BankDelete("treasury:bankDelete","message.permission.treasury.bankDelete")  ,

        //bankBranch
    bankBranchCreate("treasury:bankBranchCreate","message.permission.treasury.bankBranchCreate"),
    bankBranchEdit("treasury:bankBranchEdit","message.permission.treasury.bankBranchEdit"),
    bankBranchDelete("treasury:bankBranchDelete","message.permission.treasury.bankBranchDelete")  ,

        //bankAccountType
    bankAccountTypeCreate("treasury:bankAccountTypeCreate","message.permission.treasury.bankAccountTypeCreate"),
    bankAccountTypeEdit("treasury:bankAccountTypeEdit","message.permission.treasury.bankAccountTypeEdit"),
    bankAccountTypeDelete("treasury:bankAccountTypeDelete","message.permission.treasury.bankAccountTypeDelete"),

        //bankIdentifyCode
    bankIdentifyCodeCreate("treasury:bankIdentifyCodeCreate","message.permission.treasury.bankIdentifyCodeCreate"),
    bankIdentifyCodeEdit("treasury:bankIdentifyCodeEdit","message.permission.treasury.bankIdentifyCodeEdit"),
    bankIdentifyCodeDelete("treasury:bankIdentifyCodeDelete","message.permission.treasury.bankIdentifyCodeDelete"),
    bankIdentifyCodeDisable("treasury:bankIdentifyCodeDisable","message.permission.treasury.bankIdentifyCodeDisable"),
    bankIdentifyCodeEnable("treasury:bankIdentifyCodeEnable","message.permission.treasury.bankIdentifyCodeEnable"),

        //bankAccount
    bankAccountCreate("treasury:bankAccountCreate","message.permission.treasury.bankAccountCreate"),
    bankAccountEdit("treasury:bankAccountEdit","message.permission.treasury.bankAccountEdit"),
    bankAccountDelete("treasury:bankAccountDelete","message.permission.treasury.bankAccountDelete"),
    bankAccountClose("treasury:bankAccountClose","message.permission.treasury.bankAccountClose"),
    bankAccountOpen("treasury:bankAccountOpen","message.permission.treasury.bankAccountOpen"),

       //drawCheque
    ChangeChequeDate("treasury:ChangeChequeDate","message.permission.treasury.ChangeChequeDate"),

       //treasuryDocumentTemplate
    treasuryDocumentTemplateCreate("treasury:treasuryDocumentTemplateCreate","message.permission.treasury.treasuryDocumentTemplateCreate"),
    treasuryDocumentTemplateEdit("treasury:treasuryDocumentTemplateEdit","message.permission.treasury.treasuryDocumentTemplateEdit"),
    treasuryDocumentTemplateDelete("treasury:treasuryDocumentTemplateDelete","message.permission.treasury.treasuryDocumentTemplateDelete"),







    BankAccountUser("treasury:bankAccountUser", "message.permission.treasury.bankAccountUser"),
    CheckControl("treasury:checkControl", "message.permission.treasury.checkControl"),
    ImportBillingFile("treasury:importBillingFile", "message.permission.treasury.importBillingFile"),
    CheckPrintTemplate("treasury:checkPrintTemplate", "message.permission.treasury.checkPrintTemplate"),
    BankOtherness("treasury:bankOtherness", "message.permission.treasury.bankOtherness"),
    BankAccountRelation("treasury:bankAccountRelation", "message.permission.treasury.bankAccountRelation"),
    CheckIssue("treasury:checkIssue", "message.permission.treasury.checkIssue"),
    NotifyIssue("treasury:notifyIssue", "message.permission.treasury.notifyIssue"),
    NotifyDelete("treasury:notifyDelete", "message.permission.treasury.notifyDelete"),
    NotifyDraft("treasury:notifyDraft", "message.permission.treasury.notifyDraft"),
    NotifyConfirm("treasury:notifyConfirm", "message.permission.treasury.notifyConfirm"),
    NotifyPostedToBank("treasury:notifyPostedToBank", "message.permission.treasury.notifyPostedToBank"),
    NotifyPostedToUnit("treasury:notifyPostedToUnit", "message.permission.treasury.notifyPostedToUnit"),
    NotifyConfirmInDestination("treasury:notifyConfirmInDestination", "message.permission.treasury.notifyConfirmInDestination"),
    Cash("treasury:cash", "message.permission.treasury.cash"),
   ;

    private final String label;

    private final String key;

    private TreasuryPermissions(String key, String label) {
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
