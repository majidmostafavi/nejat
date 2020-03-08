package security.permissions;

public enum  TransportationPermission {

    TransportationMenu("transportation:transportationMenu","message.permission.transportation.transportationMenu"),
    TransportationBasicInfo("transportation:basicInfo","message.permission.transportation.basicInfoMenu"),
    TransportationProcess("transportation:process","message.permission.transportation.processMenu"),
    TransportationReport("transportation:report","message.permission.transportation.reportMenu"),
    TransportationAccounting("transportation:accounting","message.permission.transportation.accountingMenu"),

    //TransportationMenu
    VehicleCategory("transportation:vehicleCategory","message.permission.transportation.vehicleCategory"),
    VehicleColor("transportation:vehicleColor","message.permission.transportation.vehicleColor"),
    VehicleSystem("transportation:vehicleSystem","message.permission.transportation.vehicleSystem"),
    VehicleType("transportation:vehicleType","message.permission.transportation.vehicleType"),
    Vehicle("transportation:vehicle","message.permission.transportation.vehicle"),
    Driver("transportation:driver","message.permission.transportation.driver"),
    DriverVehicle("transportation:driverVehicle","message.permission.transportation.driverVehicle"),
    TransportationRequest("transportation:transportationRequest","message.permission.transportation.transportationRequest"),
    TransportationService("transportation:transportationService","message.permission.transportation.transportationService"),


    // TransportationAction
    TransportationBureau("transportation:transportationBureau","message.permission.transportation.transportationBureau"),
    TransportSpecialRequester("transportation:transportSpecialRequester","message.permission.transportation.transportSpecialRequester"),

         // transportationRequest
    TransportationRequestCreate("transportation:TransportationRequestCreate","message.permission.transportation.transportationRequest.create"),
    TransportationRequestEdit("transportation:TransportationRequestEdit","message.permission.transportation.transportationRequest.edit"),
    TransportationRequestDelete("transportation:TransportationRequestDelete","message.permission.transportation.transportationRequest.Delete"),
         //vehicleCategory
    vehicleCategoryCreate("transportation:vehicleCategoryCreate","message.permission.transportation.vehicleCategoryCreate"),
    vehicleCategoryEdit("transportation:vehicleCategoryEdit","message.permission.transportation.vehicleCategoryEdit"),
    vehicleCategoryDelete("transportation:vehicleCategoryDelete","message.permission.transportation.vehicleCategoryDelete"),
    vehicleCategoryDisable("transportation:vehicleCategoryDisable","message.permission.transportation.vehicleCategoryDisable"),
    vehicleCategoryEnable("transportation:vehicleCategoryEnable","message.permission.transportation.vehicleCategoryEnable"),
        //vehicleColor
    vehicleColorCreate("transportation:vehicleColorCreate","message.permission.transportation.vehicleColorCreate"),
    vehicleColorEdit("transportation:vehicleColorEdit","message.permission.transportation.vehicleColorEdit"),
    vehicleColorDelete("transportation:vehicleColorDelete","message.permission.transportation.vehicleColorDelete"),
    vehicleColorDisable("transportation:vehicleColorDisable","message.permission.transportation.vehicleColorDisable"),
    vehicleColorEnable("transportation:vehicleColorEnable","message.permission.transportation.vehicleColorEnable"),
        //vehicleSystem
    vehicleSystemCreate("transportation:vehicleSystemCreate","message.permission.transportation.vehicleSystemCreate"),
    vehicleSystemEdit("transportation:vehicleSystemEdit","message.permission.transportation.vehicleSystemEdit"),
    vehicleSystemDelete("transportation:vehicleSystemDelete","message.permission.transportation.vehicleSystemDelete"),
    vehicleSystemDisable("transportation:vehicleSystemDisable","message.permission.transportation.vehicleSystemDisable"),
    vehicleSystemEnable("transportation:vehicleSystemEnable","message.permission.transportation.vehicleSystemEnable"),
        //vehicleType
    vehicleTypeCreate("transportation:vehicleTypeCreate","message.permission.transportation.vehicleTypeCreate"),
    vehicleTypeEdit("transportation:vehicleTypeEdit","message.permission.transportation.vehicleTypeEdit"),
    vehicleTypeDelete("transportation:vehicleTypeDelete","message.permission.transportation.vehicleTypeDelete"),
    vehicleTypeDisable("transportation:vehicleTypeDisable","message.permission.transportation.vehicleTypeDisable"),
    vehicleTypeEnable("transportation:vehicleTypeEnable","message.permission.transportation.vehicleTypeEnable"),
    //vehicle
    vehicleCreate("transportation:vehicleCreate","message.permission.transportation.vehicleCreate"),
    vehicleEdit("transportation:vehicleEdit","message.permission.transportation.vehicleEdit"),
    vehicleDelete("transportation:vehicleDelete","message.permission.transportation.vehicleDelete"),
    vehicleDisable("transportation:vehicleDisable","message.permission.transportation.vehicleDisable"),
    vehicleEnable("transportation:vehicleEnable","message.permission.transportation.vehicleEnable"),
    DriverCreate("transportation:driverCreate","message.permission.transportation.DriverCreate"),

    //driver
    DriverEdit("transportation:DriverEdit","message.permission.transportation.DriverEdit"),
    DriverDelete("transportation:DriverDelete","message.permission.transportation.DriverDelete"),
    DriverDisable("transportation:DriverDisable","message.permission.transportation.DriverDisable"),
    DriverEnable("transportation:DriverEnable","message.permission.transportation.DriverEnable");

    private String key;
    private String label;

    TransportationPermission(String key, String title) {
        this.key = key;
        this.label = title;
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
