package entity;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractCoPerson extends BaseEntity{

        private Long id;
        private String nationalCode;
        private String firstName;
        private String lastName;
        private String fatherName;
        private String nomineeCode;
        private String mobile;
        private String address;
        private String email;
        private String telephone;
        private String economicCode;

        @Id
        @GeneratedValue(strategy = GenerationType.TABLE, generator = "personSequenceGenerator")
        @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
        public Long getId(){
            return id;
        }
        public void setId(Long id){
            this.id = id;
        }

        @Column(name = "NATIONAL_CODE", unique = true, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
        public String getNationalCode(){
            return nationalCode;
        }
        public void setNationalCode(String nationalCode){
            this.nationalCode = nationalCode;
        }

        @Column(name = "ECONOMIC_CODE",precision = 10,unique = true)
        public String getEconomicCode() {
            return economicCode;
        }
        public void setEconomicCode(String economicCode) {
            this.economicCode = economicCode;
        }

        @Column(name = "FIRST_NAME", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
        public String getFirstName(){
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        @Column(name = "LAST_NAME", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Column(name = "FATHER_NAME", unique = false, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
        public String getFatherName() {
            return fatherName;
        }
        public void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }

        @Column(name = "EMAIL", unique = true, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        @Column(name = "TELEPHONE", unique = false, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
        public String getTelephone() {
            return telephone;
        }
        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        @Column(name = "MOBILE", unique = false, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
        public String getMobile() {
            return mobile;
        }
        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        @Column(name = "ADDRESS", unique = false, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }

        @Column(name = "NOMINEE_CODE",precision = 10)
        public String getNomineeCode() {
            return nomineeCode;
        }
        public void setNomineeCode(String nomineeCode) {
            this.nomineeCode = nomineeCode;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCoPerson)) return false;
        AbstractCoPerson that = (AbstractCoPerson) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nationalCode, that.nationalCode) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(fatherName, that.fatherName) &&
                Objects.equals(nomineeCode, that.nomineeCode) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(address, that.address) &&
                Objects.equals(email, that.email) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(economicCode, that.economicCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nationalCode, firstName, lastName, fatherName, nomineeCode, email, economicCode);
    }
}
