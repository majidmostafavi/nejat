package security.permissions;

/**
 * Created by majid on 6/22/16.
 */
public enum CommonPermissions {

    CommonMenu("common:commonMenu","message.permission.common.commonMenu"),

    NotificationSubMenu("common:notificationSubMenu","message.permission.common.notificationSubMenu"),

      // CommonMenu
    Unit("common:Unit", "message.permission.common.Unit"),
    CurrencyUnit("common:CurrencyUnit", "message.permission.common.CurrencyUnit"),
    SupplierType("common:supplierType","message.permission.common.supplierType"),
    Supplier("common:supplier", "message.permission.common.supplier"),
    TenderQualifier("common:tenderQualifier","message.permission.common.tenderQualifier"),
    SupplierTemp("common:supplierTemp","message.permission.common.supplier.temp"),
    DefinitionIndependentAccount("common:definitionIndependentAccount","message.permission.common.definitionIndependentAccount"),
    IndependentRelation("common:independentRelation","message.permission.common.independentRelation"),
    UseCase("common:useCase","message.permission.common.useCase"),
    Notification("common:notification", "message.permission.common.notification"),
    NotificationSubject("common:notificationSubject","message.permission.common.notificationSubject"),
    Fiscalyear("common:fiscalyear", "message.permission.common.fiscalyear"),
    Organization("common:organization", "message.permission.common.organization"),
    OrganizationKind("common:organizationKind","message.permission.common.organizationKind"),
    OrganizationRelation("common:organizationRelation","message.permission.common.organizationRelation"),
    CostCenter("common:costCenter", "message.permission.common.costCenter"),
    CostCenterType("common:costCenterType", "message.permission.common.costCenterType"),
    Goods("common:goods", "message.permission.common.goods"),
    GoodsTemp("common:goodsTemp","message.permission.common.goodsTemp"),
    GoodsGroup("common:goodsGroup", "message.permission.common.goodsGroup"),
    PropertyCategory("common:propertyCategory","message.permission.common.propertyCategory"),
    Property("common:property", "message.permission.common.property"),
    GoodsCategory("common:goodsCategory","message.permission.common.goodsCategory"),
    GoodsEquivalentUnit("common:goodsEquivalentUnit","message.permission.common.goodsEquivalentUnit"),
    GeoLocation("common:geoLocation","message.permission.common.geoLocation") ,
    CommonParameterType("common:commonParameterType","message.permission.common.commonParameterType"),
    CommonParameter("common:commonParameter","message.permission.common.commonParameter"),
    MinPriceSetting("common:minPriceSetting","message.permission.common.minPriceSetting"),
    SupplierReplace("common:supplierReplace","message.permission.common.supplierReplace"),
    GoodsReplace("common:goodsReplace","message.permission.common.goodsReplace"),
    organizationCostCenter("common:organizationCostCenter","message.permission.common.organizationCostCenter"),
    NoticesUser("common:noticesUser","message.permission.common.noticesUser"),


    //CommonSubMenu
    UnitsSubMenu("common:unitsSubMenu","message.permission.common.unitsSubMenu"),
    SuppliersSubMenu("common:suppliersSubMenu","message.permission.common.suppliersSubMenu"),
    IndependentAccountSubMenu("common:independentAccountSubMenu","message.permission.common.independentAccountSubMenu"),
    OrganizationSubMenu("common:organizationSubMenu","message.permission.common.organizationSubMenu"),
    CostCenterSubMenu("common:costCenterSubMenu","message.permission.common.costCenterSubMenu"),
    GoodsSubMenu("common:goodsSubMenu","message.permission.common.goodsSubMenu"),
    CommonParameterSubMenu("common:commonParameterSubMenu","message.permission.common.commonParameterSubMenu"),


      //CommonAction
       //Unit
    UnitCreate("common:unitCreate","message.permission.common.unitCreate"),
    UnitEdit("common:unitEdit","message.permission.common.unitEdit"),
    UnitDelete("common:unitDelete","message.permission.common.unitDelete"),
       //CurrencyType
    CurrencyTypeCreate("common:currencyTypeCreate","message.permission.common.currencyTypeCreate"),
    CurrencyTypeEdit("common:currencyTypeEdit","message.permission.common.currencyTypeEdit"),
    CurrencyTypeDelete("common:currencyTypeDelete","message.permission.common.currencyTypeDelete"),
       //SupplierType
    SupplierTypeCreate("common:supplierTypeCreate","message.permission.common.supplierTypeCreate"),
    SupplierTypeEdit("common:supplierTypeEdit","message.permission.common.supplierTypeEdit"),
    SupplierTypeDelete("common:supplierTypeDelete","message.permission.common.supplierTypeDelete"),
       //Supplier
    SupplierCreate("common:supplierCreate","message.permission.common.supplierCreate"),
    SupplierEdit("common:supplierEdit","message.permission.common.supplierEdit"),
    SupplierDelete("common:supplierDelete","message.permission.common.supplierDelete"),
    SupplierDisable("common:supplierDisable","message.permission.common.supplierDisable"),
    SupplierEnable("common:supplierEnable","message.permission.common.supplierEnable"),
    SupplierUserCreate("common:supplierUserCreate","message.permission.common.supplierUserCreate"),
    SupplierQualification("common:supplierQualification","message.permission.common.supplierQualification"),
       //TenderQualifier
    TenderQualifierCreate("common:tenderQualifierCreate","message.permission.common.tenderQualifierCreate"),
    TenderQualifierEdit("common:tenderQualifierEdit","message.permission.common.tenderQualifierEdit"),
    TenderQualifierDelete("common:tenderQualifierDelete","message.permission.common.tenderQualifierDelete"),
       //SupplierTemp
    SupplierTempCreate("common:supplierTempCreate","message.permission.common.supplierTempCreate"),
    SupplierTempEdit("common:supplierTempEdit","message.permission.common.supplierTempEdit"),
    SupplierTempDelete("common:supplierTempDelete","message.permission.common.supplierTempDelete"),
    SupplierTempChecking("common:supplierTempChecking","message.permission.common.supplierTempChecking"),
    SupplierTempConfirm("common:supplierTempConfirm","message.permission.common.supplierTempConfirm"),
    SupplierTempReject("common:supplierTempReject","message.permission.common.supplierTempReject"),
       //IndependentAccount
    IndependentAccountCreate("common:independentAccountCreate","message.permission.common.independentAccountCreate"),
    IndependentAccountEdit("common:independentAccountEdit","message.permission.common.independentAccountEdit"),
    IndependentAccountDelete("common:independentAccountDelete","message.permission.common.independentAccountDelete"),
    IndependentAccountFields("common:independentAccountFields","message.permission.common.independentAccountFields"),
       //IndependentRelation
    IndependentRelationCreate("common:independentRelationCreate","message.permission.common.independentRelationCreate"),
    IndependentRelationDelete("common:independentRelationDelete","message.permission.common.independentRelationDelete"),
    IndependentRelationGroupDelete("common:independentRelationGroupDelete","message.permission.common.independentRelationGroupDelete"),
       //UseCase
    UseCaseCreate("common:useCaseCreate","message.permission.common.useCaseCreate"),
    UseCaseEdit("common:useCaseEdit","message.permission.common.useCaseEdit"),
    UseCaseDelete("common:useCaseDelete","message.permission.common.useCaseDelete"),
       //Notices
    NoticesCreate("common:noticesCreate","message.permission.common.noticesCreate"),
    NoticesEdit("common:noticesEdit","message.permission.common.noticesEdit"),
    NoticesDelete("common:noticesDelete","message.permission.common.noticesDelete"),
       //Fiscalyear
    FiscalyearCreate("common:fiscalyearCreate","message.permission.common.fiscalyearCreate"),
    FiscalyearEdit("common:fiscalyearEdit","message.permission.common.fiscalyearEdit"),
       //Organization
    OrganizationCreate("common:organizationCreate","message.permission.common.organizationCreate"),
    OrganizationEdit("common:organizationEdit","message.permission.common.organizationEdit"),
    OrganizationDelete("common:organizationDelete","message.permission.common.organizationDelete"),
    OrganizationCenterCreate("common:organizationCenterCreate","message.permission.common.organizationCenterCreate"),
    OrganizationTransfer("common:organizationTransfer","message.permission.common.organizationTransfer"),
       //OrganizationKind
    OrganizationKindCreate("common:organizationKindCreate","message.permission.common.organizationKindCreate"),
    OrganizationKindEdit("common:organizationKindEdit","message.permission.common.organizationKindEdit"),
    OrganizationKindDelete("common:organizationKindDelete","message.permission.common.organizationKindDelete"),
       //OrganizationRelation
    OrganizationRelationCreate("common:organizationRelationCreate","message.permission.common.organizationRelationCreate"),
    OrganizationRelationEdit("common:organizationRelationEdit","message.permission.common.organizationRelationEdit"),
    OrganizationRelationDelete("common:organizationRelationDelete","message.permission.common.organizationRelationDelete"),
       //CostCenter
    CostCenterCreate("common:costCenterCreate","message.permission.common.costCenterCreate"),
    CostCenterEdit("common:costCenterEdit","message.permission.common.costCenterEdit"),
    CostCenterDelete("common:costCenterDelete","message.permission.common.costCenterDelete"),
       //CostCenterType
    CostCenterTypeCreate("common:costCenterTypeCreate","message.permission.common.costCenterTypeCreate"),
    CostCenterTypeEdit("common:costCenterTypeEdit","message.permission.common.costCenterTypeEdit"),
    CostCenterTypeDelete("common:costCenterTypeDelete","message.permission.common.costCenterTypeDelete"),
       //Goods
    GoodsCreate("common:goodsCreate","message.permission.common.goodsCreate"),
    GoodsEdit("common:goodsEdit","message.permission.common.goodsEdit"),
    GoodsDelete("common:goodsDelete","message.permission.common.goodsDelete"),
    GoodsDisable("common:goodsDisable","message.permission.common.goodsDisable"),
    GoodsEnable("common:goodsEnable","message.permission.common.goodsEnable"),
    GoodsPropertyCreate("common:goodsPropertyCreate","message.permission.common.goodsPropertyCreate"),
    GoodsUnit("common:goodsUnit","message.permission.common.goodsUnit"),
    GoodsCopy("common:goodsCopy","message.permission.common.goodsCopy"),
    GoodsPropertyEdit("common:goodsPropertyEdit","message.permission.common.goodsPropertyEdit"),
    GoodsPropertyDelete("common:goodsPropertyDelete","message.permission.common.goodsPropertyDelete"),
       //GoodsTemp
    GoodsTempCreate("common:goodsTempCreate","message.permission.common.goodsTempCreate"),
    GoodsTempEdit("common:goodsTempEdit","message.permission.common.goodsTempEdit"),
    GoodsTempDelete("common:goodsTempDelete","message.permission.common.goodsTempDelete"),
    GoodsTempChecking("common:goodsTempChecking","message.permission.common.goodsTempChecking"),
    GoodsTempConfirm("common:goodsTempConfirm","message.permission.common.goodsTempConfirm"),
    GoodsTempReject("common:goodsTempReject","message.permission.common.goodsTempReject"),
       //GoodsGroup
    GoodsGroupCreate("common:goodsGroupCreate","message.permission.common.goodsGroupCreate"),
    GoodsGroupEdit("common:goodsGroupEdit","message.permission.common.goodsGroupEdit"),
    GoodsGroupDelete("common:goodsGroupDelete","message.permission.common.goodsGroupDelete"),
    GoodsGroupDisable("common:goodsGroupDisable","message.permission.common.goodsGroupDisable"),
    GoodsGroupEnable("common:goodsGroupEnable","message.permission.common.goodsGroupEnable"),
    GoodsGroupPropertyCreate("common:goodsGroupPropertyCreate","message.permission.common.goodsGroupPropertyCreate"),
    GoodsGroupPropertyEditDelete("common:goodsGroupEditDelete","message.permission.common.goodsGroupEditDelete"),
       //PropertyCategory
    PropertyCategoryCreate("common:propertyCategoryCreate","message.permission.common.propertyCategoryCreate"),
    PropertyCategoryEdit("common:propertyCategoryEdit","message.permission.common.propertyCategoryEdit"),
    PropertyCategoryDelete("common:propertyCategoryDelete","message.permission.common.propertyCategoryDelete"),
       //Property
    PropertyCreate("common:propertyCreate","message.permission.common.propertyCreate"),
    PropertyEdit("common:propertyEdit","message.permission.common.propertyEdit"),
    PropertyDelete("common:propertyDelete","message.permission.common.propertyDelete"),
    PropertyDisable("common:propertyDisable","message.permission.common.propertyDisable"),
    PropertyEnable("common:propertyEnable","message.permission.common.propertyEnable"),
       //GoodsCategory
    GoodsCategoryCreate("common:goodsCategoryCreate","message.permission.common.goodsCategoryCreate"),
    GoodsCategoryEdit("common:goodsCategoryEdit","message.permission.common.goodsCategoryEdit"),
    GoodsCategoryDelete("common:goodsCategoryDelete","message.permission.common.goodsCategoryDelete"),
       //GoodsUnit
    GoodsUnitCreate("common:goodsUnitCreate","message.permission.common.goodsUnitCreate"),
    GoodsUnitEdit("common:goodsUnitEdit","message.permission.common.goodsUnitEdit"),
    GoodsUnitDelete("common:goodsUnitDelete","message.permission.common.goodsUnitDelete"),
       //GeoLocation
         //Country
    GeoLocationCountryCreate("common:geoLocationCountryCreate","message.permission.common.geoLocationCountryCreate"),
    GeoLocationCountryEdit("common:geoLocationCountryEdit","message.permission.common.geoLocationCountryEdit"),
    GeoLocationCountryDelete("common:geoLocationCountryDelete","message.permission.common.geoLocationCountryDelete"),
         //County
    GeoLocationCountyCreate("common:geoLocationCountyCreate","message.permission.common.geoLocationCountyCreate"),
    GeoLocationCountyEdit("common:geoLocationCountyEdit","message.permission.common.geoLocationCountyEdit"),
    GeoLocationCountyDelete("common:geoLocationCountyDelete","message.permission.common.geoLocationCountyDelete"),
         //City
    GeoLocationCityCreate("common:geoLocationCityCreate","message.permission.common.geoLocationCityCreate"),
    GeoLocationCityEdit("common:geoLocationCityEdit","message.permission.common.geoLocationCityEdit"),
    GeoLocationCityDelete("common:geoLocationCityDelete","message.permission.common.geoLocationCityDelete"),
       //CommonParameterType
    CommonParameterTypeCreate("common:commonParameterTypeCreate","message.permission.common.commonParameterTypeCreate"),
    CommonParameterTypeEdit("common:commonParameterTypeEdit","message.permission.common.commonParameterTypeEdit"),
    CommonParameterTypeDelete("common:commonParameterTypeDelete","message.permission.common.commonParameterTypeDelete"),
    CommonParameterTypeEnable("common:commonParameterTypeEnable","message.permission.common.commonParameterTypeEnable"),
    CommonParameterTypeDisable("common:CommonParameterTypeDisable","message.permission.common.CommonParameterTypeDisable"),
       //CommonParameter
    CommonParameterCreate("common:commonParameterCreate","message.permission.common.commonParameterCreate"),
    CommonParameterEdit("common:commonParameterEdit","message.permission.common.commonParameterEdit"),
    CommonParameterDelete("common:commonParameterDelete","message.permission.common.commonParameterDelete"),
    CommonParameterEnable("common:commonParameterEnable","message.permission.common.commonParameterEnable"),
    CommonParameterDisable("common:CommonParameterDisable","message.permission.common.CommonParameterDisable"),

       //MinPriceSetting
    MinPriceSettingCreate("common:minPriceSettingCreate","message.permission.common.minPriceSettingCreate"),
    MinPriceSettingEdit("common:minPriceSettingEdit","message.permission.common.minPriceSettingEdit"),
    MinPriceSettingDelete("common:minPriceSettingDelete","message.permission.common.minPriceSettingDelete"),









//    SubSystem("common:subSystem", "message.permission.common.subSystem"),
//    Personnel("common:personnel", "message.permission.common.personnel"),
//    PersonnelSignature("common:personnelSignature","message.permission.common.personnelSignature"),
//    Signature("common:signature", "message.permission.common.signature"),
//    TechConfirmPermission("common:techConfirmPermission", "message.permission.common.tech.confirm.permission"),
//    Location("common:location", "message.permission.common.location"),
//    SupplierCategory("common:supplierCategory", "message.permission.common.supplier.category"),
//    GoodsTemp("common:goodsTemp","message.permission.common.goodsTemp"),
//    AllGoodsTemp("common:allGoodsTemp","message.permission.common.goodsTemp.all"),
//    SuggestedSupplier("common:suggestedSupplier", "message.permission.common.suggestedSupplier"),
//    SupplierSuggestionCheck("common:checkSuggestedSupplier", "message.permission.common.checkSuggestedSupplier"),
//    FeedbackManagement("common:feedbackManagement","menu.right.common.feedbackManagement"),
//    FeedbackConfirm("common:feedbackConfirm","menu.right.common.feedbackConfirm"),
//    FeedbackReject("common:feedbackReject","menu.right.common.feedbackReject"),
//    FeedbackInPorgress("common:feedbackInProgress","menu.right.common.feedbackInProgress"),
//    FeedbackDone("common:feedbackDone","menu.right.common.feedbackDone"),
    ;

    private final String label;

    private final String key;

    private CommonPermissions(String key, String label) {
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
