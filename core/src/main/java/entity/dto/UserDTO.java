package entity.dto;

public class UserDTO {

    private String userName;
    private String password;
    private Boolean active;
    private Long personnel;
    private Long supplier;

    public UserDTO(String userName, String password, Boolean active, Long personnel, Long supplier) {
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.personnel = personnel;
        this.supplier = supplier;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getPersonnel() {
        return personnel;
    }
    public void setPersonnel(Long personnel) {
        this.personnel = personnel;
    }

    public Long getSupplier() {
        return supplier;
    }
    public void setSupplier(Long supplier) {
        this.supplier = supplier;
    }
}
