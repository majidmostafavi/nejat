package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum DashboardPermissions {
    DashboardMenu("dashboard:DashboardMenu","message.permission.dashboard.menu"),
    ///Budget//
    Budget("dashboard:Budget","message.permission.dashboard.budget"),
    BillTittle("dashboard:BillTittle","message.permission.dashboard.budget.billTittle"),
    AllocationBudget("dashboard:allocationBudget","message.permission.dashboard.budget.allocationBudge"),
    AgreementBudget("dashboard:agreementBudget","message.permission.dashboard.budget.agreementBudget"),

    //Credit//
    Credit("dashboard:Credit","message.permission.dashboard.credit"),
    CreditPayment("dashboard:CreditPayment","message.permission.dashboard.creditPayment"),
    creditSalaryManagerConfirmed("dashboard:creditSalaryManagerConfirmed","message.permission.dashboard.creditSalaryManagerConfirmed"),
    creditSalaryManagerReject("dashboard:creditSalaryManagerReject","message.permission.dashboard.creditSalaryManagerReject"),
    creditSalaryConfirmed("dashboard:creditSalaryConfirmed","message.permission.dashboard.creditSalaryConfirmed"),
    creditSalaryReject("dashboard:creditSalaryReject","message.permission.dashboard.creditSalaryReject"),
    creditSalaryAcceptProtestation("dashboard:creditSalaryAcceptProtestation","message.permission.dashboard.creditSalaryAcceptProtestation"),

    //creditPayment
    creditPaymentCreditConfirmed("dashboard:creditPaymentCreditConfirmed","message.permission.dashboard.creditPaymentCreditConfirmed"),
    creditPaymentBossConfirmed("dashboard:creditPaymentBossConfirmed","message.permission.dashboard.creditPaymentBossConfirmed"),
    creditPaymentCreditCancel("dashboard:creditPaymentCreditCancel","message.permission.dashboard.creditPaymentCreditCancel"),
    creditPaymentBossCancel("dashboard:creditPaymentBossCancel","message.permission.dashboard.creditPaymentBossCancel"),

    //Accounting//
    Accounting("dashboard:Accounting","message.permission.dashboard.accounting"),
    Document("dashboard:Document","message.permission.dashboard.accounting.document"),
    DocumentCheck("dashboard:DocumentCheck","message.permission.dashboard.accounting.document.check"),
    DocumentProtestation("dashboard:DocumentProtestation","message.permission.dashboard.accounting.document.protestation"),
    DocumentAudit("dashboard:DocumentAudit","message.permission.dashboard.accounting.document.audit"),
    DocumentFinal("dashboard:DocumentFinal","message.permission.dashboard.accounting.document.final"),
    DocumentCancelCheck("dashboard:DocumentCancelCheck","message.permission.dashboard.accounting.document.cancelCheck"),
    DocumentCancelProtestation("dashboard:DocumentCancelProtestation","message.permission.dashboard.accounting.document.cancelProtestation"),
    DocumentCancelAudit("dashboard:DocumentCancelAudit","message.permission.dashboard.accounting.document.cancelAudit"),
    DocumentCancelFinal("dashboard:DocumentCancelFinal","message.permission.dashboard.accounting.document.cancelFinal"),
    DocumentCancelConfirmed("dashboard:DocumentCancelConfirmed","message.permission.dashboard.accounting.document.CancelConfirmed"),
    DocumentAcceptProtestation("dashboard:DocumentAcceptProtestation","message.permission.dashboard.accounting.document.acceptProtestation"),

    //Treasury//
    Treasury("dashboard:Treasury","message.permission.dashboard.treasury"),
    Notification("dashboard:notification","message.permission.dashboard.treasury.notification"),
    Cheque("dashboard:cheque","message.permission.dashboard.treasury.cheque"),


    //Inventory//
    //Inventory DashboardAction
      // Request
    RequestBossConfirm("request:bossConfirmed", "message.permission.inventory.GoodsRequestBossConfirm"),
    RequestBossReject("request:bossReject", "message.permission.inventory.GoodsRequestBossReject"),
    RequestManagerConfirmTechnicalConfirmNeeded("request:managerConditionalConfirmed", "message.permission.inventory.GoodsRequestManagerConfirmTechnicalNeeded"),
    RequestExpertConfirm("request:expertConfirmed", "message.permission.inventory.GoodsRequestTechnicalConfirm"),
    RequestManagerConfirm("request:managerConfirmed", "message.permission.inventory.GoodsRequestManagerConfirmTechnicalNotNeeded"),
    RequestManagerReject("request:managerReject", "message.permission.inventory.GoodsRequestManagerReject"),
    // BuyRequest
    BuyRequestBossConfirm("buyRequest:bossConfirm", "message.permission.inventory.GoodsBuyBossConfirm"),
    BuyRequestBossReject("buyRequest:bossReject", "message.permission.inventory.GoodsBuyBossReject"),
    BuyRequestSupplierBossConfirm("buyRequest:supplierbossconfirmed", "message.permission.inventory.supplierBossConfirmed"),
    BuyRequestSupplierConfirm("buyRequest:supplierconfirmed", "message.permission.inventory.supplierConfirmed"),
    BuyRequestManagerConfirm("buyRequest:managerConfirm", "message.permission.inventory.GoodsBuyManagerConfirm"),
    BuyRequestManagerReject("buyRequest:managerReject", "message.permission.inventory.GoodsBuyManagerReject"),
    BuyRequestCreditConfirm("buyRequest:creditConfirmed", "message.permission.inventory.BuyRequestCreditConfirmed"),
    BuyRequestChiefConfirm("buyRequest:buyRequestChiefConfirm", "message.permission.inventory.buyRequestChiefConfirm"),
    BuyRequestChiefReject("buyRequest:buyRequestChiefReject", "message.permission.inventory.buyRequestChiefReject"),
    //Receipt
    ReceiptExpertConfirm("receipt:expertConfirm", "message.permission.inventory.receiptExpertConfirm"),
    ReceiptExpertReject("receipt:expertReject", "message.permission.inventory.receiptExpertReject"),
    ReceiptBossConfirm("receipt:bossConfirm", "message.permission.inventory.receiptBossConfirm"),
    ReceiptBossReject("receipt:bossReject", "message.permission.inventory.receiptBossReject"),
    ReceiptManagerConfirm("receipt:managerConfirm","message.permission.inventory.receiptManagerConfirm"),
    ReceipttManagerReject("receipt:managerReject", "message.permission.inventory.receiptManagerReject"),
    ReceiptAssetConfirm("receipt:assetConfirm", "message.permission.inventory.receiptAssetConfirm"),
    ReceiptAssetReject("receipt:assetReject", "message.permission.inventory.receiptAssetReject"),
    ReceiptAccountingConfirm("receipt:accountingConfirm", "message.permission.inventory.receiptAccountingConfirm"),
    ReceiptAccountingReject("receipt:accountingReject", "message.permission.inventory.receiptAccountingReject"),
    ReceiptChiefConfirm("receipt:receiptChiefConfirm", "message.permission.inventory.receiptChiefConfirm"),
    ReceiptChiefReject("receipt:receiptChiefReject", "message.permission.inventory.receiptChiefReject"),

    //Draft
    DraftExpertConfirm("draft:draftExpertConfirm", "message.permission.inventory.draftExpertConfirm"),
    DraftBossConfirm("draft:draftBossConfirm", "message.permission.inventory.draftBossConfirm"),
    DraftBossReject("draft:draftBossReject", "message.permission.inventory.draftBossReject"),
    DraftManagerConfirm("draft:draftManagerConfirm", "message.permission.inventory.draftManagerConfirm"),
    DraftManagerReject("draft:draftManagerReject", "message.permission.inventory.draftManagerReject"),
    DraftAccountingConfirm("draft:draftAccountingConfirm", "message.permission.inventory.draftAccountingConfirm"),
    DraftAccountingReject("draft:draftAccountingReject", "message.permission.inventory.draftAccountingReject"),
    DraftAssetConfirm("draft:draftAssetConfirm", "message.permission.inventory.draftAssetConfirm"),
    DraftAssetReject("draft:draftAssetReject", "message.permission.inventory.draftAssetReject"),
    DraftChiefConfirm("draft:draftChiefConfirm", "message.permission.inventory.draftChiefConfirm"),
    DraftChiefReject("draft:draftChiefReject", "message.permission.inventory.draftChiefReject"),




    //Invoice
    InvoiceSupplierBossConfirm("invoice:invoiceSupplierBossConfirm", "message.permission.inventory.invoiceSupplierBossConfirm"),


    //Asset//
    // assetDashboardAction
        /*ChangeStatus*/
    ChangeStatusBossConfirm("asset:csBossConfirm","message.permission.asset.changeStatus.bossConfirm"),
    ChangeStatusBossReject("asset:csBossReject","message.permission.asset.changeStatus.bossReject"),
    ChangeStatusManagerConfirm("asset:csManagerConfirm","message.permission.asset.changeStatus.managerConfirm"),
    ChangeStatusManagerReject("asset:csManagerReject","message.permission.asset.changeStatus.managerReject"),
    ChangeStatusAssetKeeperAccepted("asset:csAssetKeeperAccepted","message.permission.asset.changeStatus.assetKeeperAccepted"),
    ChangeStatusAssetKeeperRejected("asset:csAssetKeeperRejected","message.permission.asset.changeStatus.assetKeeperRejected"),
    ChangeStatusAssetAccountingAccepted("asset:csAssetAccountingAccepted","message.permission.asset.changeStatus.accountingAccepted"),
    ChangeStatusAssetAccountingRejected("asset:csAssetAccountingRejected","message.permission.asset.changeStatus.accountingRejected"),
    ChangeStatusVicePresidentConfirm("asset:csVicePresidentConfirm","message.permission.asset.changeStatus.vicePresidentConfirm"),
    ChangeStatusVicePresidentReject("asset:csVicePresidentReject","message.permission.asset.changeStatus.vicePresidentReject"),
    /*Movement*/
    MovementBossConfirm("asset:mBossConfirm","message.permission.asset.movement.bossConfirm"),
    MovementBossReject("asset:mBossReject","message.permission.asset.movement.bossReject"),
    MovementAssetKeeperAccepted("asset:mAssetKeeperAccepted","message.permission.asset.movement.assetKeeperAccepted"),
    MovementAssetKeeperRejected("asset:mAssetKeeperRejected","message.permission.asset.movement.assetKeeperRejected"),
    MovementManagerConfirm("asset:mManagerConfirm","message.permission.asset.movement.managerConfirm"),

    /*Repricing*/
    RepricingManagerConfirm("asset:rManagerConfirm","message.permission.asset.repricing.managerConfirm"),
    RepricingManagerReject("asset:rsManagerReject","message.permission.asset.repricing.managerReject"),
    RepricingVicePresidentConfirm("asset:rVicePresidentConfirm","message.permission.asset.repricing.vicePresidentConfirm"),
    RepricingVicePresidentReject("asset:rVicePresidentReject","message.permission.asset.repricing.vicePresidentReject"),
    /*Transfer*/
    TransferManagerConfirm("asset:tManagerConfirm","message.permission.asset.transfer.managerConfirm"),
    TransferManagerReject("asset:tManagerReject","message.permission.asset.transfer.managerReject"),
    TransferAssetKeeperAccepted("asset:tAssetKeeperAccepted","message.permission.asset.transfer.assetKeeperAccepted"),
    TransferAssetKeeperRejected("asset:tAssetKeeperRejected","message.permission.asset.transfer.assetKeeperRejected"),
    TransferVicePresidentConfirm("asset:tVicePresidentConfirm","message.permission.asset.transfer.vicePresidentConfirm"),
    TransferVicePresidentReject("asset:tVicePresidentReject","message.permission.asset.transfer.vicePresidentReject"),
    TransferAccountingConfirm("asset:tAccountingConfirm","message.permission.asset.transfer.accountingConfirm"),
    TransferAccountingReject("asset:tAccountingReject","message.permission.asset.transfer.accountingReject"),


    //Tender//
    Tender("dashboard:tender","message.permission.dashboard.tender"),
    TenderMaster("dashboard:TenderMaster","message.permission.dashboard.tender.tenderMaster"),
    TenderApproved("tender : approved","message.permission.dashboard.tender.TenderApproved"),
    TenderRunning("tender : running","message.permission.dashboard.tender.TenderRunning"),
    TenderCommission("tender : commission","message.permission.dashboard.tender.TenderCommission"),
    TenderCommittee("tender : committee","message.permission.dashboard.tender.TenderCommittee"),
    TenderFinished("tender : finished","message.permission.dashboard.tender.TenderFinished"),

    //Revenue//
    Revenue("dashboard:Revenue","message.permission.dashboard.revenue"),
    RevenueMaster("dashboard:RevenueMaster","message.permission.dashboard.revenueMaster"),
    RevenueCollection("dashboard:RevenueCollection","message.permission.dashboard.revenueCollection"),
    RevenueRequest("dashboard:RevenueRequest","message.permission.dashboard.revenueRequest"),
    RevenueAgreement("dashboard:RevenueAgreement","message.permission.dashboard.revenueAgreement"),
    RevenueAgreementExpertConfirmed("dashboard:revenueAgreementExpertConfirmed","message.permission.dashboard.revenueAgreement.revenueAgreementExpertConfirmed"),
    RevenueAgreementExpertRejected("dashboard:revenueAgreementExpertRejected","message.permission.dashboard.revenueAgreement.revenueAgreementExpertRejected"),
    RevenueAgreementManagerConfirmed("dashboard:revenueAgreementManagerConfirmed","message.permission.dashboard.revenueAgreement.revenueAgreementManagerConfirmed"),
    RevenueAgreementManagerRejected("dashboard:revenueAgreementManagerRejected","message.permission.dashboard.revenueAgreement.revenueAgreementManagerRejected"),
    RevenueAgreementBudgetExpertConfirmed("dashboard:revenueAgreementBudgetExpertConfirmed","message.permission.dashboard.revenueAgreement.revenueAgreementBudgetExpertConfirmed"),
    RevenueAgreementBudgetExpertRejected("dashboard:revenueAgreementBudgetExpertRejected","message.permission.dashboard.revenueAgreement.revenueAgreementBudgetExpertRejected"),
    RevenueAgreementBudgetManagerConfirmed("dashboard:revenueAgreementBudgetManagerConfirmed","message.permission.dashboard.revenueAgreement.revenueAgreementBudgetManagerConfirmed"),
    RevenueAgreementBudgetManagerRejected("dashboard:revenueAgreementBudgetManagerRejected","message.permission.dashboard.revenueAgreement.revenueAgreementBudgetManagerRejected"),
    RevenueAgreementConfirmed("dashboard:revenueAgreementConfirmed","message.permission.dashboard.revenueAgreement.revenueAgreementConfirmed"),
    RevenueAgreementRejected("dashboard:revenueAgreementRejected","message.permission.dashboard.revenueAgreement.revenueAgreementRejected"),

    //Warranty//
    Warranty("dashboard:Warranty","message.permission.dashboard.warranty"),
    WarrantyMaster("dashboard:WarrantyMaster","message.permission.dashboard.warranty.warrantyMaster"),
    WarrantyMasterConfirm("dashboard:WarrantyMasterConfirm","message.permission.dashboard.warranty.warrantyMaster.confirm"),
    WarrantyMasterCancelConfirm("dashboard:WarrantyMasterCancelConfirm","message.permission.dashboard.warranty.warrantyMaster.cancel.confirm"),


    //Contract//
    Contract("dashboard:contract","message.permission.dashboard.contract"),
    ContractExpertConfirmed("contract:contractExpertConfirmed","message.permission.dashboard.contract.contractExpertConfirmed"),
    ContractManagerConfirmed("contract:contractManagerConfirmed","message.permission.dashboard.contract.contractManagerConfirmed"),
    ContractCreditConfirmed("contract:contractCreditConfirmed","message.permission.dashboard.contract.contractCreditConfirmed"),
    ContractExpertRejected("contract:contractExpertRejected","message.permission.dashboard.contract.contractExpertRejected"),
    ContractManagerRejected("contract:contractManagerRejected","message.permission.dashboard.contract.contractManagerRejected"),
    ContractCreditRejected("contract:contractCreditRejected","message.permission.dashboard.contract.contractCreditRejected"),
//    Dashboard("dashboard:dashboard","message.permission.dashboard.inventory.dashboard"),//    assetExit("dashboard:exit","message.permission.dashboard.asset.exit"),
//    AssetMovement("dashboard:movement","message.permission.dashboard.asset.movement"),
//    AssetChangeStatus("dashboard:changeStatus","message.permission.dashboard.asset.changeStatus"),
//    AssetComeBack("dashboard:comeback","message.permission.dashboard.asset.comeback"),
//    AssetTransfer("dashboard:transfer","message.permission.dashboard.asset.transfer"),
//    Income("dashboard:income","message.permission.dashboard.income"),
//    AccountingDoc("dashboard:document","message.permission.dashboard.accounting.doc"),
//    RequestMoney("dashboard:requestMoney","message.permission.dashboard.credit.requestMoney"),
//    Tender("dashboard:tender","message.permission.dashboard.credit.tender")

    //Facility//
    Facility("dashboard:facility","message.permission.dashboard.facility"),
    FacilityRequestDashboard("dashboard:facilityRequestDashboard","message.permission.dashboard.facilityRequestDashboard"),
    FacilityRequestManagerConfirmed("dashboard:facilityRequestManagerConfirmed","message.permission.dashboard.facilityRequestManagerConfirmed"),

    //Transportation//
    Transportation("dashboard:transportation","message.permission.dashboard.transportation"),
    transportationRequestDashboard("dashboard:transportationRequestDashboard","message.permission.dashboard.transportationRequestDashboard"),
    TransportationRequestBossConfirm("dashboard:TransportationRequestBossConfirm","message.permission.dashboard.transportationRequestBossConfirm"),
    TransportationRequestManagerConfirm("dashboard:TransportationRequestManagerConfirm","message.permission.dashboard.transportationRequestManagerConfirm"),
    TransportationRequestTransportationConfirm("dashboard:TransportationRequestTransportationConfirm","message.permission.dashboard.transportationRequestTransportationConfirm")
    ;

    private String key;
    private String label;

    DashboardPermissions(String key, String label) {
        this.key = key;
        this.label = label;
    }


    public String getKey() {
        return key;
    }


    public String getLabel() {
        return label;
    }

}
