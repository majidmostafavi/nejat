package entity;


import org.apache.commons.codec.binary.Hex;
import org.apache.shiro.SecurityUtils;
import javax.persistence.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

//import org.bouncycastle.cms.CMSSignedData;

/**
 * Created by majid on 6/25/16.
 */
@MappedSuperclass
public abstract class AbstractCoUsers extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String userName;
    private String password;
    private String creator;
    private Date createdDate;
    private Set<CoRoleOrganization> roleOrganizations;
    private CoPerson person;

    public AbstractCoUsers() {
    }

    public AbstractCoUsers(String userName, String password) {
        this.userName = userName;
        this.password = hashSHA1(password);
        this.createdDate = new Date();
        try {
            this.creator = SecurityUtils.getSubject().getPrincipal().toString();
        } catch (Throwable t) {
            //do nothing, an exception thrown at startup when the application creates some default users
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "UserSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "username", length = 128, nullable = false)
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password", length = 128, unique = false, nullable = false, insertable = true, updatable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "personnel_creator", length = 128)
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Column(name = "create_date", length = 128)
    @Temporal(TemporalType.DATE)
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_USER_ROLEORGANIZATION_ID"))
    public Set<CoRoleOrganization> getRoleOrganizations() {
        return roleOrganizations;
    }
    public void setRoleOrganizations(Set<CoRoleOrganization> roleOrganizations) {
        this.roleOrganizations = roleOrganizations;
    }
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name="person_id")
    public CoPerson getPerson() {
        return person;
    }
    public void setPerson(CoPerson person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCoUsers)) return false;
        AbstractCoUsers that = (AbstractCoUsers) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(roleOrganizations, that.roleOrganizations) &&
                Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, creator, roleOrganizations, person);
    }

    @Override
    public String toString() {
        return "[name=" +
                userName + "] : " + password;
    }

    public static String hashSHA1(String password) {
        try {
            MessageDigest cript = MessageDigest.getInstance("SHA-1");
            cript.reset();

            return Hex.encodeHexString(cript.digest(password.getBytes("UTF-8")));
//new String(Hex.encodeHex(cript.digest()), Charset.forName("UTF-8"));
        } catch (Exception ex) {
            ex.printStackTrace();
            return password;
        }
    }

    private String hashPassword(String password) {

        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
            byte[] bs;
            messageDigest.reset();
            bs = messageDigest.digest(password.getBytes());
            StringBuilder stringBuilder = new StringBuilder();
            //hex encode the digest
            for (int i = 0; i < bs.length; i++) {
                String hexVal = Integer.toHexString(0xFF & bs[i]);
                if (hexVal.length() == 1) {
                    stringBuilder.append("0");
                }
                stringBuilder.append(hexVal);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }


}
