package utils;

/**
 * Created by majid on 6/25/16.
 */
public class Constants {
    public static final String USERNAME_ATTR = "username";
    public static final String USER_ATTR = "user";
    public static final String CURRENT_FISCAL_YEAR_ATTR = "currentFiscalYear";
    public static final String ROLE_ORG_ATTR = "roleOrganization";
    public static final String CURRENT_PERSONNEL_ATTR = "personnel";
    public static final String ORGANIZATION="organization";
    public static final String SUPPLIER="supplier";


    public static final String INVENTORY_REPORT_DIRECTORY = "/WEB-INF/report/tums/inventory/";
    public static final String ASSET_REPORT_DIRECTORY = "/WEB-INF/report/tums/asset/";
    public static final String ACCOUNTING_REPORT_DIRECTORY = "/WEB-INF/report/tums/accounting/";
    public static final String TREASURY_REPORT_DIRECTORY = "/WEB-INF/report/tums/treasury/";
    public static final String WARRANTY_REPORT_DIRECTORY = "/WEB-INF/report/tums/warranty/";
    public static final String TENDER_REPORT_DIRECTORY = "/WEB-INF/report/tums/tender/";
    public static final String HUMAN_RESOURCE_REPORT_DIRECTORY = "/WEB-INF/report/tums/humanResource/";
    public static final String COMMON_REPORT_DIRECTORY = "/WEB-INF/report/tums/common/";



    //// reports name
    public static final String REPORT_NAME_INVENTORY_CONTROL="In_Rp_InventoryTag";
    public static final String REPORT_NAME_GOODS_STATISTICS ="statistics";
    public static final String REPORT_NAME_GOODS_REQUEST ="GoodsRequest";
    public static final String REPORT_NAME_GOODS_BUY_REQUEST ="BuyRequest";
    public static final String REPORT_NAME_GOODS_BUY_SERVICE ="buyService";
    public static final String REPORT_NAME_RECEIPT="Receipt";
    public static final String REPORT_NAME_DRAFT="DraftReport";
    public static final String REPORT_NAME_MONETARY_VALUE="MonetaryValue";
    public static final String REPORT_NAME_MERCHAN_GROUP_MONETARY_VALUE="MerchanGroupMonetaryValue";
    public static final String REPORT_NAME_STOCK_REMAINING="RemainingStock";
    public static final String REPORT_NAME_STOCK_REPORT="StockReport";
    public static final String REPORT_NAME_INVENTORY_MONETARY_VALUE="monetaryValueOfInventory";
    public static final String REPORT_NAME_Delivery="Delivery";
    public static final String REPORT_NAME_CONSUME="Consume";
    public static final String REPORT_NAME_DRAFT_REPORT="draftReport";
    public static final String REPORT_NAME_INVENTORY_ACTIVITY="InventoryActivity";
    public static final String REPORT_NAME_SUPPLIER="supplierReport";
    public static final String REPORT_NAME_ASSET_LIST="assetList";
    public static final String REPORT_NAME_ASSET_MOVEMENT="assetMovement";
    public static final String REPORT_NAME_ASSET_EXIT="assetExit";
    public static final String REPORT_NAME_ASSET_CHANGE_STATE="assetChangeStatus";
    public static final String REPORT_NAME_ASSET_CHANGE_STATE_LICENSE="ChangeStatusWithlicense";
    public static final String REPORT_NAME_ASSET_TRANSFER="assetTransfer";
    public static final String REPORT_NAME_ASSET_CARD="AssetCard";
    public static final String REPORT_NAME_ASSET_GOODS_GROUP_REPORT ="assetGoodsGroupReport";
    public static final String REPORT_NAME_ASSET_DEPRECIATION="DepreciationReport";
    public static final String REPORT_NAME_ASSET_MONETARY_VALUE="AssetMonetaryValue";
    public static final String REPORT_NAME_DEPRECIATION="Depreciation";
    public static final String REPORT_NAME_SUPPLIER_REPORT="supplierReport";
    public static final String REPORT_NAME_ACCDOCUMENT_REPORT="AccDocumentReport";
    public static final String REPORT_NAME_ACNOTEBOOKDOCUMENT_REPORT="AcNotebookDocumentReport";
    public static final String REPORT_NAME_ACNOTEBOOKDOCUMENT_REPORT_PERACCOUNT="AcNotebookDocumentReportPerAccount";
    public static final String REPORT_NAME_JournalOfficeReport_REPORT="JournalOfficeReport";
    public static final String REPORT_NAME_ACCBALANCEREPORT_REPORT="AccBalanceReport";
    public static final String REPORT_NAME_BALANCEREPORT_REPORT="balancePrintReportFourCol";
    public static final String REPORT_NAME_BALANCEREPORT_REPORT_twoCol="balancePrintReportTwoCol";
    public static final String REPORT_NAME_BALANCEREPORT_REPORT_eight="balancePrintReportEightCol";
    public static final String REPORT_NAME_BALANCEREPORT_REPORT_ten="balancePrintReportTenCol";
    public static final String REPORT_NAME_reviewAccount_REPORT_fourCol="reviewAccountFourCol";
    public static final String REPORT_NAME_reviewAccount_REPORT_eightCol="reviewAccountEightCol";
    public static final String REPORT_NAME_reviewAccount_REPORT_TenCol="reviewAccountTenCol";
    public static final String REPORT_NAME_TREASURY_REPORT="TrNotifyReport";
    public static final String REPORT_NAME_TRCHEQUE_REPORT = "TrChequeReport";
    public static final String REPORT_NAME_CONTRADICTION_DETAIL_REPORT="contradictionDetailPrint";
    public static final String REPORT_NAME_CONTRADICTION_bankAccount_REPORT="contradictionBankAccountTransaction";
    public static final String REPORT_NAME_CONTRADICTION_REPORT="contradictionBankAccountTransaction";

    public static final String REPORT_NAME_MERCHANDISE_REQUEST = "merchandiseRequest";
    public static final String REQUEST ="Request";
    public static final String BUY_REQUEST ="BuyRequestReport";
    public static final String INVOICE ="invoice";
    public static final String SERVICE ="service";
    public static final String RECEIPT ="Receipt";
    public static final String ASSET  = "assetReport";
    public static final String ASSET_EXCEL  = "assetReport_excel";
    public static final String ASSET_DEPRECIATION = "assetDepriciationReport";


    //accounting reports
    public static final String REPORT_ACCOUNT_DOC="accountDocument";
    public static final String REPORT_JOURNAL_REPORT="journalReport";

    /////treasury reports
    public static final String REPORT_RECEIPT_CHECK="checkReceipt";
    public static final String REPORT_CONFIRM_CHECK="checkConfirm";
    public static final String REPORT_PAYMENT_ORDER="paymentOrder";

    // test print in build
    public static final String test_print = "testPrint";

    // asset print report
    public static final String asset_Request_Print= "assetRequestPrint";
    public static final String change_Status_Print ="changeStatusPrint";
    public static final String repricing_Request_Print ="repricingRequestPrint";
    public static final String movement_Request_Print ="movementRequestPrint";
    public static final String asset_Location_Report_Print ="assetLocationReportPrint";
    public static final String EXIT_NOTE_REPORT ="exitNoteReport";
    public static final String asset_Monetary_Value_Print = "assetMonetaryValuePrint";
    public static final String depreciation_Report = "depreciationReport";
    public static final String organization_asset_report = "organizationAssetReport";
    public static final String Bill_Payment_Report_Print ="billPaymentReportPrint";
    public static final String Bill_Payment_Print ="billPaymentPrint";
    public static final String REPRICING_REQUEST_REPORT ="repricingRequestReport";

    // warranty Print
    public static final String extending_print = "extending";
    public static final String revoked_print = "revoked";
    public static final String violating_print = "violating";
    public static final String reducing_print = "reducing";
    public static final String warranty_Action_print = "warrantyAction";
    public static final String warranty_Receipt_print = "warrantyReceipt";

    //inventory print
    public static final String inventory_print = "inventory";
    public static final String review_Inventory_print = "reviewInventory";
    public static final String INVENTORY_CARDEX_BRIEF="cardexBrief";
    public static final String VCARDEX="vCardexReport";
    public static final String STATEMENT="STATEMENT";
    public static final String SecondVCARDEX="secondVCardexReport";
    public static final String cost_Center_Report = "costCenterReport";
    public static final String basket_Report = "basketReport";
    public static final String consume_Print = "consumeReport";
    public static final String receipt_Report_By_Personnel = "receiptReportByPersonnel";
    public static final String receipt_Report_By_Supplier = "receiptReportBySupplier";
    public static final String receipt_Report_By_Personnel_And_Goods = "receiptReportByPersonnelAndGoods";
    public static final String receipt_Report_ByPersonnel_And_Receipt = "receiptReportByPersonnelAndReceipt";
    public static final String supplier_Report = "supplierReport";
    public static final String Threshold_report = "thresholdReport";
    public static final String Threshold = "threshold";

    // tender print
    public static final String tender_Master_print = "tenderMaster";

    //common print
    public static final String organization_CostCenter_print = "orgCostCenterReport";

}
