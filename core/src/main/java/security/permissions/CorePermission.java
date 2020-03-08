package security.permissions;

/**
 * Created by hossein on 1/31/17.
 */
public enum CorePermission {

    systemAdministrator("core:systemAdministrator","message.permission.core.systemAdministrator"),
    adminMenu("core:adminMenu","message.permission.core.adminMenu"),

    permissionSubMenu("core:permissionSubMenu","message.permission.core.permissionSubMenu"),

      //CoreMenu
    Roles("core:roles", "message.permission.core.roles"),
    Users("core:users", "message.permission.core.users"),
    Permission("core:permission","message.permission.core.permission"),
    PermissionCategory("core:permissionCategory","message.permission.core.permissionCategory"),
    BugReportAdmin("core:bugReportAdmin","message.permission.core.bugReportAdmin"),
    Release("core:release","message.permission.core.release"),
    LoginAs("core:loginAs","message.permission.core.loginAs"),

      //CoreAction
       //Roles
    RolesCreate("core:rolesCreate","message.permission.core.rolesCreate"),
    RolesEdit("core:rolesEdit","message.permission.core.rolesEdit"),
    RolesDelete("core:rolesDelete","message.permission.core.rolesDelete"),
    RolesCopy("core:rolesCopy","message.permission.core.rolesCopy"),
       //Users
    UsersCreate("core:usersCreate","message.permission.core.usersCreate"),
    UsersEdit("core:usersEdit","message.permission.core.usersEdit"),
    UsersEnable("core:usersEnable","message.permission.core.usersEnable"),
    UsersDisable("core:usersDisable","message.permission.core.usersDisable"),
    UsersChangePassword("core:usersChangePassword","message.permission.core.usersChangePassword"),
       //PermissionCategory
    PermissionCategoryCreate("core:permissionCategoryCreate","message.permission.core.permissionCategoryCreate"),
    PermissionCategoryEdit("core:permissionCategoryEdit","message.permission.core.permissionCategoryEdit"),
    PermissionCategoryDelete("core:permissionCategoryDelete","message.permission.core.permissionCategoryDelete"),
       //Release
    ReleaseCreate("core:releaseCreate","message.permission.core.releaseCreate"),
    ReleaseEdit("core:releaseEdit","message.permission.core.releaseEdit"),
    ReleaseDelete("core:releaseDelete","message.permission.core.releaseDelete"),
    SystemManagerUnit("core:systemManagerUnit","message.permission.core.systemManagerUnit"),

       //Dashboard Management
    DashboardManagementSubMenu("core:dashboardManagementSubMenu","message.permission.core.dashboardManagementSubMenu"),
    State("core:State","message.permission.core.State"),
    StateAction("core:stateAction","message.permission.core.stateAction"),
    ;


    private final String label;

    private final String key;

    CorePermission(String key, String label) {
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
