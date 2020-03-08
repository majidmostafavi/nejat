package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum InventoryReportPermissions {
    MonetaryValue("inventory:report:monetaryValueNumber","message.permission.inventory.report.monetary.value.number"),
    RemainingStock("inventory:report:remainingStock","message.permission.inventory.report.remaining.stock"),
    Stock("inventory:report:stock","message.permission.inventory.report.stock"),
    StockMonetaryValue("inventory:report:stockMonetaryValue","message.permission.inventory.report.stock.monetary.value"),
    Cardex("inventory:report:cardex","message.permission.inventory.report.cardex"),
    Delivery("inventory:report:delivery","message.permission.inventory.report.delivery"),
    Consume("inventory:report:consume", "message.permission.inventory.report.consume"),
    ConsumeSummary("inventory:report:consumeSummary", "message.permission.inventory.report.consume.summary"),
    InventoryActivity("inventoryReport:inventoryActivity", "message.permission.inventory.report.inventory.activity"),
    Supplier("inventory:supplierReport", "message.permission.inventory.report.supplier"),
    Receipt("inventory:report:receipt", "message.permission.inventory.report.receipt"),
    Draft("inventory:report:draft", "message.permission.inventory.report.draft"),
    RequstGoodsReport("inventory:report:requstGoods", "message.permission.inventory.requstGoods.report");
    private final String key;
    private final String label;

    private InventoryReportPermissions(String key, String label){
        this.key=key;
        this.label=label;
    }

    public String getLabel() {
        return this.label;
    }

    public String getKey() {
        return key;
    }
}
