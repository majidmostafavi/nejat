package security;

import cache.CacheQueryUtils;
import entity.CoPermission;
import org.apache.shiro.SecurityUtils;

/**
 * Created by majid on 9/10/17.
 */
public class PermissionUtils {

/*    public static CoPermission findPermissionByKey(String key){

        for(CoPermission permission : CacheQueryUtils.fetchPermissionAsCache()){
            if (permission.getKey().equals(key)){
                return permission;
            }
        }
        return new CoPermission();
    }*/

    public static boolean systemAdministrator(){
        return SecurityUtils.getSubject().isPermitted("core:systemAdministrator");
    }
    public static boolean assetKeeperPermission(){
        return SecurityUtils.getSubject().isPermitted("asset:assetKeeper");
    }
    public static boolean specialAssetKeeperPermission(){
        return SecurityUtils.getSubject().isPermitted("asset:specialAssetKeeper");
    }
    public static boolean requestRegisterPermission(){
        return SecurityUtils.getSubject().isPermitted("inventory:requestRegister");
    }
    public static boolean provider(){
        return SecurityUtils.getSubject().isPermitted("inventory:provider");
    }

    public static boolean defineSupplier(){
        return SecurityUtils.getSubject().isPermitted("inventory:defineSupplier");
    }
    public static boolean supplierBossConfirmed(){
        return SecurityUtils.getSubject().isPermitted("buyRequest:supplierbossconfirmed");
    }

    public static boolean storeManager(){
        return SecurityUtils.getSubject().isPermitted("inventory:storeManager");
    }

    public static boolean storeKeeper(){
        return SecurityUtils.getSubject().isPermitted("inventory:storeKeeper");
    }

    public static boolean documentChangeDate(){
        return SecurityUtils.getSubject().isPermitted("accounting:DocumentCreateChangeDocumentDate");
    }

    public static boolean chequeChangeDate(){
        return SecurityUtils.getSubject().isPermitted("treasury:ChangeChequeDate");
    }
    public static boolean inventoryReport(){
        return SecurityUtils.getSubject().isPermitted("inventory:inventoryReport");
    }

    public static boolean boss(){
        return SecurityUtils.getSubject().isPermitted("inventory:boss");
    }
    public static boolean manager(){
        return SecurityUtils.getSubject().isPermitted("inventory:manager");
    }

    public static boolean requestChange(){
        return SecurityUtils.getSubject().isPermitted("inventory:RequestChange");
    }

    public static boolean buyRequestAmountChange(){
        return SecurityUtils.getSubject().isPermitted("inventory:BuyRequestAmountChange");
    }
    public static boolean buyRequestPriceChange(){
        return SecurityUtils.getSubject().isPermitted("inventory:BuyRequestPriceChange");
    }

    public static boolean changeStatusManager() {
        return SecurityUtils.getSubject().isPermitted("asset:csBossConfirm") && !SecurityUtils.getSubject().isPermitted("inventory:manager");
    }

    public static boolean facilityRequestManager(){
        return SecurityUtils.getSubject().isPermitted("facility:facilityRequestManager");
    }

    public static boolean movementManager() {
        return SecurityUtils.getSubject().isPermitted("asset:mBossConfirm") && !SecurityUtils.getSubject().isPermitted("inventory:manager");
    }

    public static boolean createAccountingGeneralSpecialReport() {
        return SecurityUtils.getSubject().isPermitted("accounting:SpecialReportCreateGeneral");
    }

    public static boolean createBudgetGeneralSpecialReport() {
        return SecurityUtils.getSubject().isPermitted("budget:SpecialReportCreateGeneral");
    }

    public static boolean RequestDateChange(){
        return SecurityUtils.getSubject().isPermitted("inventory:RequestDateChange");
    }

    public static boolean systemManagerUnit(){
        return SecurityUtils.getSubject().isPermitted("core:systemManagerUnit");
    }

    public static boolean goodsTempConfirm(){
        return SecurityUtils.getSubject().isPermitted("common:goodsTempConfirm");
    }

    public static boolean supplierTempConfirm(){
        return SecurityUtils.getSubject().isPermitted("common:supplierTempConfirm");
    }

    public static boolean selectExpertConfirmed(){
        return SecurityUtils.getSubject().isPermitted("inventory:selectExpertConfirmed");
    }

/*    public static CoPermission findSpecialReportScopePermission(){
        return findPermissionByKey("accounting:SpecialReport");
    }

    public static boolean limitedToAccountingTypes(){
        SessionManager.getUserPermission(SessionManager.getUsername());
        return SecurityUtils.getSubject().isPermitted("accounting:limitedToAccountingTypes");
    }*/

    public static boolean isBossCredit(){
        return SecurityUtils.getSubject().isPermitted("salary:bossCredit");
    }

    public static boolean isSalaryPaymentControl(){
        return SecurityUtils.getSubject().isPermitted("credit:salaryPaymentControl");
    }

    public static boolean isChangeOrganizationPermission(){
        return SecurityUtils.getSubject().isPermitted("credit:creditSalaryChangeOrganization");
    }

    public static boolean isTransportationBureau(){
        return SecurityUtils.getSubject().isPermitted("transportation:transportationBureau");
    }

    public static boolean isTransportSpecialRequester(){
        return SecurityUtils.getSubject().isPermitted("transportation:transportSpecialRequester");
    }

}
