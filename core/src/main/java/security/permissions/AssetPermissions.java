package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum AssetPermissions {

        AssetMenu("asset:assetMenu","message.permission.asset.assetMenu"),
        AssetBasicInfo("asset:basicInfo","message.permission.asset.basicInfoMenu"),
        AssetProcess("asset:process","message.permission.asset.processMenu"),
        AssetReport("asset:report","message.permission.asset.reportMenu"),
        AssetAccounting("asset:accounting","message.permission.asset.accountingMenu"),
        locationSubMenu("asset:locationSubMenu","message.permission.asset.locationSubMenu"),

        // assetMenu
        location("asset:location","message.permission.asset.location"),
        locationType("asset:locationType","message.permission.asset.locationType"),
        changeStatusRule("asset:changeStatusRule","message.permission.asset.changeStatusRule"),
        transferConfiguration("asset:transferConfiguration","message.permission.asset.transferConfiguration"),
        assetDocumentTemplate("asset:assetDocumentTemplate","message.permission.asset.assetDocumentTemplate"),
        locationTemp("asset:locationTemp","message.permission.asset.locationTemp"),
        asset("asset:asset","message.permission.asset.asset"),
        assetChangeStatus("asset:changeStatus", "message.permission.asset.assetChangeStatus"),
        assetMovement("asset:movement", "message.permission.asset.assetMovement"),
        assetRepricing("asset:assetRepricing","message.permission.asset.assetRepricing"),
        autoChangeStatusDocument("asset:autoChangeStatusDocument","message.permission.asset.autoChangeStatusDocument"),
        transferRequestDocumentSent("asset:transferRequestDocumentSent","message.permission.asset.transferRequestDocumentSent"),
        transferRequestDocumentReceived("asset:transferRequestDocumentReceived","message.permission.asset.transferRequestDocumentReceived"),
        assetTransfer("asset:assetTransfer","message.permission.asset.assetTransfer"),
        assetTransferInRequest("asset:assetTransferInRequest","message.permission.asset.assetTransferInRequest"),
        billPayment("asset:billPayment","message.permission.asset.billPayment"),
        expireDayAlarmReport("asset:expireDayAlarmReport","message.permission.asset.expireDayAlarmReport"),
        returnDateAlarmReport("asset:returnDateAlarmReport","message.permission.asset.returnDateAlarmReport"),
        assetMonetaryValueReport("asset:assetMonetaryValueReport","message.permission.asset.assetMonetaryValueReport"),
        attributionAssetReport("asset:attributionAssetReport","message.permission.asset.attributionAssetReport"),
        assetLocationReport("asset:assetLocationReport","message.permission.asset.assetLocationReport"),
        assetActivityReport("asset:assetActivityReport","message.permission.asset.assetActivityReport"),
        organizationAssetReport("asset:organizationAssetReport","message.permission.asset.organizationAssetReport"),
        locationAssetReport("asset:locationAssetReport","message.permission.asset.locationAssetReport"),
        personnelAssetReport("asset:personnelAssetReport","message.permission.asset.personnelAssetReport"),
        deprecationReport("asset:depreciationReport","message.permission.asset.depreciationReport"),
        billPaymentReport("asset:billPaymentReport","message.permission.asset.billPaymentReport"),
        repricingDocument("asset:repricingDocument","message.permission.asset.repricingDocument"),
        depreciationDocument("asset:depreciationDocument","message.permission.asset.depreciationDocument"),
        depreciationTreeReport("asset:depreciationTreeReport","message.permission.asset.depreciationTreeReport"),
        repricingReport("asset:repricingReport","message.permission.asset.repricingReport"),
        assetInWarehouse("asset:assetInWarehouse","message.permission.asset.assetInWarehouse"),
        billPaymentDocument("asset:billPaymentDocument","message.permission.asset.billPaymentDocument"),


        // assetAction
                //location
        locationCreate("asset:locationCreate","message.permission.asset.locationCreate"),
        locationEdit("asset:locationEdit","message.permission.asset.locationEdit"),
        locationDelete("asset:locationDelete","message.permission.asset.locationDelete"),
        locationDisable("asset:locationDisable","message.permission.asset.locationDisable"),
                //locationType
        locationTypeCreate("asset:locationTypeCreate","message.permission.asset.locationTypeCreate"),
        locationTypeEdit("asset:locationTypeEdit","message.permission.asset.locationTypeEdit"),
        locationTypeDelete("asset:locationTypeDelete","message.permission.asset.locationTypeDelete"),
                //changeStatusRule
        changeStatusRuleCreate("asset:changeStatusRuleCreate","message.permission.asset.changeStatusRuleCreate"),
        changeStatusRuleEdit("asset:changeStatusRuleEdit","message.permission.asset.changeStatusRuleEdit"),
        changeStatusRuleDelete("asset:changeStatusRuleDelete","message.permission.asset.changeStatusRuleDelete"),
        changeStatusRuleDisable("asset:changeStatusRuleDisable","message.permission.asset.changeStatusRuleDisable"),
                //transferConfiguration
        transferConfigurationCreate("asset:transferConfigurationCreate","message.permission.asset.transferConfigurationCreate"),
        transferConfigurationEdit("asset:transferConfigurationEdit","message.permission.asset.transferConfigurationEdit"),
        transferConfigurationDelete("asset:transferConfigurationDelete","message.permission.asset.transferConfigurationDelete"),
                //locationTemp
        locationTempChecking("asset:locationTempChecking","message.permission.asset.locationTempChecking"),
        locationTempCreate("asset:locationTempCreate","message.permission.asset.locationTempCreate"),
        locationTempEdit("asset:locationTempEdit","message.permission.asset.locationTempEdit"),
        locationTempDelete("asset:locationTempDelete","message.permission.asset.locationTempDelete"),


                //asset
        assetCreate("asset:assetCreate","message.permission.asset.assetCreate"),
        assetEdit("asset:assetEdit","message.permission.asset.assetEdit"),
        assetLimitedEdit("asset:assetLimitedEdit","message.permission.asset.assetLimitedEdit"),
        assetDelete("asset:assetDelete","message.permission.asset.assetDelete"),
        assetCopy("asset:assetCopy","message.permission.asset.assetCopy"),
        assetBarcode("asset:assetBarcode","message.permission.asset.assetBarcode"),
                //changeStatus
        changeStatusCreate("asset:changeStatusCreate","message.permission.asset.changeStatusCreate"),
        changeStatusEdit("asset:changeStatusEdit","message.permission.asset.changeStatusEdit"),
        changeStatusDelete("asset:changeStatusDelete","message.permission.asset.changeStatusDelete"),
        changeStatusPrint("asset:changeStatusPrint","message.permission.asset.changeStatusPrint"),
                //movement
        movementCreate("asset:movementCreate","message.permission.asset.movementCreate"),
        movementEdit("asset:movementEdit","message.permission.asset.movementEdit"),
        movementDelete("asset:movementDelete","message.permission.asset.movementDelete"),
        movementPrint("asset:movementPrint","message.permission.asset.movementPrint"),
                //repricing
        repricingCreate("asset:repricingCreate","message.permission.asset.repricingCreate"),
        repricingEdit("asset:repricingEdit","message.permission.asset.repricingEdit"),
        repricingDelete("asset:repricingDelete","message.permission.asset.repricingDelete"),
        repricingPrint("asset:repricingPrint","message.permission.asset.repricingPrint"),
                //transfer
        transferCreate("asset:transferCreate","message.permission.asset.transferCreate"),
        transferEdit("asset:transferEdit","message.permission.asset.transferEdit"),
        transferDelete("asset:transferDelete","message.permission.asset.transferDelete"),
        transferPrint("asset:transferPrint","message.permission.asset.transferPrint"),
                //Special
        specialAssetKeeper("asset:specialAssetKeeper","message.permission.asset.specialAssetKeeper"),
        assetKeeper("asset:assetKeeper","message.permission.asset.assetKeeper"),

                //assetDocumentTemplate
        assetDocumentTemplateCreate("asset:assetDocumentTemplateCreate", "message.permission.asset.assetDocumentTemplateCreate"),
        assetDocumentTemplateEdit("asset:assetDocumentTemplateEdit", "message.permission.asset.assetDocumentTemplateEdit"),
        assetDocumentTemplateDelete("asset:assetDocumentTemplateDelete", "message.permission.asset.assetDocumentTemplateDelete"),
        assetDocumentTemplateCopy("asset:assetDocumentTemplateCopy", "message.permission.asset.assetDocumentTemplateCopy"),

                //autoChangeStatusDocument
        autoChangeStatusDocumentCreate("asset:autoChangeStatusDocumentCreate", "message.permission.asset.autoChangeStatusDocumentCreate"),
        autoChangeStatusDocumentDelete("asset:autoChangeStatusDocumentDelete", "message.permission.asset.autoChangeStatusDocumentDelete"),

                //repricingDocument
        repricingDocumentCreate("asset:repricingDocumentCreate", "message.permission.asset.repricingDocumentCreate"),
        repricingDocumentُShow("asset:repricingDocumentُShow", "message.permission.asset.repricingDocumentُShow"),

                //depreciationDocument
        depreciationDocumentCreate("asset:depreciationDocumentCreate", "message.permission.asset.depreciationDocumentCreate"),

        //transferRequestDocumentSent
        transferRequestDocumentSentCreate("asset:transferRequestDocumentSentCreate","message.permission.asset.transferRequestDocumentSentCreate"),

        //transferRequestDocumentReceived
        transferRequestDocumentReceivedCreate("asset:transferRequestDocumentReceivedCreate","message.permission.asset.transferRequestDocumentReceivedCreate"),

                // assetDashboardMenu
        Asset("dashboard:Asset","message.permission.dashboard.asset"),
        changeStatusRequest("dashboard:changeStatusRequest","message.permission.dashboard.asset.changeStatusRequest"),
        movementRequest("dashboard:movementRequest","message.permission.dashboard.asset.movementRequest"),
        repricingRequest("dashboard:repricingRequest","message.permission.dashboard.asset.repricingRequest"),
        transferRequest("dashboard:transferRequest","message.permission.dashboard.asset.transferRequest");




        private final String label;

        private final String key;

        private AssetPermissions(String key, String label){
            this.label = label;
            this.key = key;
        }

        public String getLabel(){
            return this.label;
        }

        public String getKey(){
            return key;
        }
    }