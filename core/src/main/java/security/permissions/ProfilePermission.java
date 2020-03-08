package security.permissions;


/**
 * Created by qazale on 1/6/2018.
 */
public enum ProfilePermission {

    ProfileMenu("profile:ProfileMenu","message.permission.profile.ProfileMenu"),

    //ProfileMenu
    FoodRequest("profile:foodRequest","message.permission.profile.foodRequest"),
    ViewPayRollFile("profile:viewPayRollFile","message.permission.profile.viewPayRollFile"),
    EditProfile("profile:editProfile","message.permission.profile.editProfile"),
    PersonnelSignature("profile:personnelSignature","message.permission.profile.personnelSignature"),
    BugReportUser("profile:bugReportUser","message.permission.profile.bugReportUser");

    private final String label;

    private final String key;

    ProfilePermission(String key, String label) {
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
