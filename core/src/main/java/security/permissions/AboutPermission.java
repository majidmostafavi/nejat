package security.permissions;

/**
 * Created by qazale on 4/7/2018.
 */
public enum AboutPermission {
    AboutMenu("about:aboutMenu","message.permission.profile.aboutMenu");

    private final String label;

    private final String key;

    AboutPermission(String key, String label) {
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
