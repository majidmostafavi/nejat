package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum InventoryPermissions {

    InventoryMenu("inventory:inventoryMenu","message.permission.inventory.inventoryMenu"),
    InventoryBasicInfo("inventory:basicInfo","message.permission.inventory.basicInfoMenu"),
    InventoryProcess("inventory:process","message.permission.inventory.processMenu"),
    InventoryReport("inventory:report","message.permission.inventory.reportMenu"),
    InventoryAccounting("inventory:accounting","message.permission.inventory.accountingMenu"),

    ReviewGoodSubMenu("inventory:reviewGoodSubMenu","message.permission.inventory.reviewGoodSubMenu"),
    goodDeliverySubMenu("inventory:goodDeliverySubMenu","message.permission.inventory.goodDeliverySubMenu"),
    inventorySubMenu("inventory:inventorySubMenu","message.permission.inventory.inventorySubMenu"),
    consumeReportSubMenu("inventory:consumeReportSubMenu","message.permission.inventory.consumeReportSubMenu"),
    supplierReportSubMenu("inventory:supplierReportSubMenu","message.permission.inventory.supplierReportSubMenu"),

    //InventoryMenu
    Inventory("inventory:inventory", "message.permission.inventory.inventory"),
    InventoryType("inventory:inventoryType", "message.permission.inventory.inventoryType"),
    InventoryThreshold("inventory:threshold", "message.permission.inventory.threshold"),
    InventoryLocation("inventory:inventoryLocation","message.permission.inventory.inventoryLocation"),
    InventoryLocationGoods ("inventory:inventoryLocationGoods","message.permission.inventory.inventoryLocationGoods"),
    InvoiceFactor("inventory:invoiceFactor","message.permission.inventory.invoiceFactor"),
    Basket("inventory:basket","message.permission.inventory.basket"),
    GoodsRequest("inventory:goodsRequest", "message.permission.inventory.goodsRequest"),
    BuyRequest("inventory:buyRequest", "message.permission.inventory.buyRequest"),
    RequestControl("inventory:requestControl","message.permission.inventory.requestControl"),
    Invoice("inventory:invoice","message.permission.inventory.invoice"),
    GoodsReceipt("inventory:goodsReceipt","message.permission.inventory.goodsReceipt"),
    GoodsDraft("inventory:goodsDraft","message.permission.inventory.goodsDraft"),
    ReceiptDraftTransitional("inventory:receiptDraftTransitional","message.permission.inventory.receiptDraftTransitional"),
    InventoryDocumentTemplate("inventory:inventoryDocumentTemplate","message.permission.inventory.inventoryDocumentTemplate"),
    InventoryChecking("inventory:inventoryChecking","message.permission.inventory.inventoryChecking"),
    DraftCostCenterReport("inventory:draftCostCenterReport","message.permission.inventory.draftCostCenterReport"),
    ReviewInventoryReport("inventory:reviewInventoryReport","message.permission.inventory.reviewInventoryReport"),
    KardexReport("inventory:kardexReport","message.permission.inventory.kardexReport"),
    reviewGoodsRemain("inventory:reviewGoodsRemain","message.permission.inventory.reviewGoodsRemain"),
    ReviewGoodsReport("inventory:reviewGoodsReport","message.permission.inventory.reviewGoodsReport"),
    BasketReport("inventory:basketReportReport","message.permission.inventory.basketReportReport"),
    reviewGoodsGroup("inventory:reviewGoodsGroup" ,"message.permission.inventory.reviewGoodsGroup" ),
    expiredAlarmReport("inventory:expiredAlarmReport" , "message.permission.inventory.expiredAlarmReport"),
    thresholdReport("inventory:thresholdReport" , "message.permission.inventory.thresholdReport" ),
    personnelReport("inventory:personnelReport", "message.permission.inventory.personnelReport"),
    supplierReport("inventory:supplierReport" ,"message.permission.inventory.supplierReport"),
    activityReport("inventory:ActivityReport" , "message.permission.inventory.ActivityReport"),
    inventoryActivityReport("inventory:inventoryActivityReport" , "message.permission.inventory.inventoryActivityReport"),
    inventoryStatisticalReport("inventory:inventoryStatisticalReport" , "message.permission.inventory.inventoryStatisticalReport"),
    buyRequestProvider("inventory:buyRequestProvider","message.permission.inventory.buyRequestProvider"),
    goodsCountLocation("inventory:goodsCountLocation","message.permission.inventory.goodsCountLocation"),
    consumeReportOrganization("inventory:consumeReportOrganization","message.permission.inventory.consumeReportOrganization"),
    consumeReportRequester("inventory:consumeReportRequester","message.permission.inventory.consumeReportRequester"),
    supplierAndGoodsReport("inventory:supplierAndGoodsReport","message.permission.inventory.supplierAndGoodsReport"),
    supplierAndInvoiceReport("inventory:supplierAndInvoiceReport","message.permission.inventory.supplierAndInvoiceReport"),
    providerActivityReport("inventory:providerActivityReport" , "message.permission.inventory.providerActivityReport" ),
    receiptReportByPersonnel("inventory:receiptReportByPersonnel","message.permission.inventory.receiptReportByPersonnel"),
    receiptReportByPersonnelAndGoods("inventory:receiptReportByPersonnelAndGoods","message.permission.inventory.receiptReportByPersonnelAndGoods"),
    receiptReportByPersonnelAndReceipt("inventory:receiptReportByPersonnelAndReceipt","message.permission.inventory.receiptReportByPersonnelAndReceipt"),
    draftDocument("inventory:draftDocument","message.permission.inventory.draftDocument"),
    receiptDocument("inventory:receiptDocument","message.permission.inventory.receiptDocument"),
    receiptDraftDistributive("inventory:receiptDraftDistributive","message.permission.inventory.receiptDraftDistributive"),
    inventoryReportOrganization("inventory:inventoryReportOrganization","message.permission.inventory.inventoryReportOrganization"),
    inventoryReportGoodsGroup("inventory:inventoryReportGoodsGroup","message.permission.inventory.inventoryReportGoodsGroup"),
    inventoryReportGoods("inventory:inventoryReportGoods","message.permission.inventory.inventoryReportGoods"),

    //InventoryAction
         //Inventory
    InventoryCreate("inventory:inventoryCreate","message.permission.inventory.inventoryCreate"),
    InventoryEdit("inventory:inventoryEdit","message.permission.inventory.inventoryEdit"),
    InventoryDelete("inventory:inventoryDelete","message.permission.inventory.inventoryDelete"),
    InventoryPrint("inventory:inventoryPrint","message.permission.inventory.inventoryPrint"),
    InventoryCopy("inventory:inventoryCopy","message.permission.inventory.inventoryCopy"),
        //InventoryType
    InventoryTypeCreate("inventory:inventoryTypeCreate","message.permission.inventory.inventoryTypeCreate"),
    InventoryTypeEdit("inventory:inventoryTypeEdit","message.permission.inventory.inventoryTypeEdit"),
    InventoryTypeDelete("inventory:inventoryTypeDelete","message.permission.inventory.inventoryTypeDelete"),
    InventoryTypeEnable("inventory:inventoryTypeEnable","message.permission.inventory.inventoryTypeEnable"),
        //threshold
    ThresholdCreate("inventory:thresholdCreate","message.permission.inventory.thresholdCreate"),
    ThresholdEdit("inventory:thresholdEdit","message.permission.inventory.thresholdEdit"),
    ThresholdDelete("inventory:thresholdDelete","message.permission.inventory.thresholdDelete"),
        //inventoryLocation
    InventoryLocationCreate("inventory:inventoryLocationCreate","message.permission.inventory.inventoryLocationCreate"),
    InventoryLocationEdit("inventory:inventoryLocationEdit","message.permission.inventory.inventoryLocationEdit"),
    InventoryLocationDelete("inventory:inventoryLocationDelete","message.permission.inventory.inventoryLocationDelete"),
        //inventoryLocationGoods
        //invoiceFactor
    InvoiceFactorCreate("inventory:invoiceFactorCreate","message.permission.inventory.invoiceFactorCreate"),
    InvoiceFactorEdit("inventory:invoiceFactorEdit","message.permission.inventory.invoiceFactorEdit"),
    InvoiceFactorDelete("inventory:invoiceFactorDelete","message.permission.inventory.invoiceFactorDelete"),
        //basket
    BasketCreate("inventory:basketCreate","message.permission.inventory.basketCreate"),
    BasketEdit("inventory:basketEdit","message.permission.inventory.basketEdit"),
    BasketDelete("inventory:basketDelete","message.permission.inventory.basketDelete"),
        //Request
    RequestCreate("inventory:GoodsRequestCreate", "message.permission.inventory.GoodsRequestCreate"),
    RequestCopy("inventory:GoodsRequestCopy", "message.permission.inventory.GoodsRequestCopy"),
    RequestEdit("inventory:GoodsRequestEdit", "message.permission.inventory.GoodsRequestEdit"),
    RequestDelete("inventory:GoodsRequestDelete", "message.permission.inventory.GoodsRequestDelete"),
    RequestPrint("inventory:GoodsRequestPrint","message.permission.inventory.GoodsRequestPrint"),
    RequestChange("inventory:RequestChange" , "message.permission.inventory.RequestChange"),
    RequestDateChange("inventory:RequestDateChange" , "message.permission.inventory.RequestDateChange"),
    RequestSelectExpertConfirmed("inventory:selectExpertConfirmed" , "message.permission.inventory.selectExpertConfirmed"),
       //RequestControl
    RequestControlRequested("inventory:requestControlRequested","message.permission.inventory.requestControlRequested"),
    RequestControlDrafted("inventory:requestControlDrafted","message.permission.inventory.requestControlDrafted"),
       //BuyRequest
    BuyRequestCreate("inventory:GoodsBuyCreate", "message.permission.inventory.GoodsBuyCreate"),
    BuyRequestEdit("inventory:GoodsBuyEdit", "message.permission.inventory.GoodsBuyEdit"),
    BuyRequestDelete("inventory:GoodsBuyDelete", "message.permission.inventory.GoodsBuyDelete"),
    BuyRequestPrint("inventory:GoodsBuyPrint","message.permission.inventory.GoodsBuyPrint"),
    BuyRequestAmountChange("inventory:BuyRequestAmountChange" , "message.permission.inventory.buyRequestAmountChange"),
    BuyRequestPriceChange("inventory:BuyRequestPriceChange" , "message.permission.inventory.buyRequestPriceChange"),
       //Invoice
    InvoiceCreate("inventory:invoiceCreate","message.permission.inventory.invoiceCreate"),
    InvoiceCreateByMaster("inventory:invoiceCreateByMaster","message.permission.inventory.invoiceCreateByMaster"),
    InvoiceEdit("inventory:invoiceEdit","message.permission.inventory.invoiceEdit"),
    InvoiceDelete("inventory:invoiceDelete","message.permission.inventory.invoiceDelete"),
    InvoicePrint("inventory:invoicePrint","message.permission.inventory.invoicePrint"),
    InvoiceDocument("inventory:invoiceDocument","message.permission.inventory.invoiceDocument"),
    InvoicePayment("inventory:invoicePayment","message.permission.inventory.invoicePayment"),
    InvoiceCreditPaymentSave("inventory:invoiceCreditPaymentSave","message.permission.inventory.invoiceCreditPaymentSave"),
    invoiceCreatePayment("inventory:invoiceCreatePayment","message.permission.inventory.invoiceCreatePayment"),
    invoiceEditPayment("inventory:invoiceEditPayment","message.permission.inventory.invoiceEditPayment"),
    invoiceDeletePayment("inventory:invoiceDeletePayment","message.permission.inventory.invoiceDeletePayment"),
      //Receipt
    ReceiptCreate("inventory:receiptCreate", "message.permission.inventory.receiptCreate"),
    ReceiptCreateWithInvoice("inventory:receiptCreateWithInvoice","message.permission.inventory.receiptCreateWithInvoice"),
    ReceiptEdit("inventory:receiptEdit", "message.permission.inventory.receiptEdit"),
    ReceiptDelete("inventory:receiptDelete", "message.permission.inventory.receiptDelete"),
    ReceiptPrint("inventory:receiptPrint","message.permission.inventory.receiptPrint"),
      //Draft
    DraftCreate("inventory:draftCreate", "message.permission.inventory.draftCreate"),
    DraftCreateWithoutRequest("inventory:draftCreateWithoutRequest","message.permission.inventory.draftCreateWithoutRequest"),
    DraftEdit("inventory:draftEdit", "message.permission.inventory.draftEdit"),
    DraftDelete("inventory:draftDelete", "message.permission.inventory.draftDelete"),
    DraftPrint("inventory:draftPrint", "message.permission.inventory.draftPrint"),
    DraftDelivery("inventory:draftDelivery", "message.permission.inventory.draftDelivery"),
       //ReceiptDraftTransitional
    CreateReceiptOfDraft("inventory:createReceiptOfDraft","message.permission.inventory.CreateReceiptOfDraft"),
    CreateReceiptOfInvoice("inventory:createReceiptOfInvoice","message.permission.inventory.CreateReceiptOfInvoice"),
       //InventoryChecking
    InventoryCheckingCreate("inventory:inventoryCheckingCreate","message.permission.inventory.inventoryCheckingCreate"),
    InventoryCheckingEdit("inventory:inventoryCheckingEdit","message.permission.inventory.inventoryCheckingEdit"),
    InventoryCheckingDelete("inventory:inventoryCheckingDelete","message.permission.inventory.inventoryCheckingDelete"),
    InventoryCheckingPrint("inventory:inventoryCheckingPrint","message.permission.inventory.inventoryCheckingPrint"),
        //inventoryDocumentTemplate
    InventoryDocumentTemplateCreate("inventory:inventoryDocumentTemplateCreate","message.permission.inventory.inventoryDocumentTemplateCreate"),
    InventoryDocumentTemplateEdit("inventory:inventoryDocumentTemplateEdit","message.permission.inventory.inventoryDocumentTemplateEdit"),
    InventoryDocumentTemplateDelete("inventory:inventoryDocumentTemplateDelete","message.permission.inventory.inventoryDocumentTemplateDelete"),
    InventoryDocumentTemplateCopy("inventory:inventoryDocumentTemplateCopy","message.permission.inventory.inventoryDocumentTemplateCopy"),

    //invoiceDocument
    InvoiceDocumentCreate("inventory:invoiceDocumentCreate","message.permission.inventory.invoiceDocumentCreate"),
    InvoiceDocumentShow("inventory:invoiceDocumentShow","message.permission.inventory.invoiceDocumentShow"),

       //Special
    DefineSupplier("inventory:defineSupplier","message.permission.inventory.defineSupplier"),
    RequestRegister("inventory:requestRegister","message.permission.inventory.requestRegister"),
    Boss("inventory:boss","message.permission.inventory.boss"),
    Manager("inventory:manager","message.permission.inventory.manager"),
    Provider("inventory:provider","message.permission.inventory.provider"),
    StoreKeeper("inventory:storeKeeper","message.permission.inventory.storeKeeper"),
    StoreManager("inventory:storeManager","message.permission.inventory.storeManager"),
    inventoryReport("inventory:inventoryReport","message.permission.inventory.inventoryReport"),
       // InventoryDashboardMenue
    InventoryDashboard("dashboard:Inventory","message.permission.dashboard.inventory"),
    GoodsDraftDashboard("dashboard:draft","message.permission.dashboard.inventory.draft"),
    GoodsReceiptDashboard("dashboard:receipt","message.permission.dashboard.inventory.receipt"),
    GoodsBuyServiceDashboard("dashboard:buyService","message.permission.dashboard.inventory.buyService"),
    GoodsBuyRequestDashboard("dashboard:buyRequest","message.permission.dashboard.inventory.buyReq"),
    GoodsRequestDashboard("dashboard:goodsRequest","message.permission.dashboard.inventory.GoodsReq"),
    InvoiceDashboard("dashboard:Invoice","message.permission.dashboard.inventory.Invoice");





    private final String label;

    private final String key;

    private InventoryPermissions(String key, String label) {
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