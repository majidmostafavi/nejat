package entity;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractCoOrganizationType extends BaseEntity implements Comparable<AbstractCoOrganizationType>{

    private Long id;
    private String code;
    private String name;
    private String key;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "organizationTypeSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CODE" , nullable = false,unique = true)
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "NAME" ,nullable = false,unique = true)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "KEY" , nullable = false , unique = true)
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCoOrganizationType)) return false;
        AbstractCoOrganizationType that = (AbstractCoOrganizationType) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, key);
    }

    @Override
    public String toString() {
        if (getCode() != null && getName() != null)
            return "(" + getCode() + ") "+ getName();
        else if (getCode() != null)
            return "(" + getCode() + ")";
        else if (getName() != null)
            return getName();
        else return "";
    }

    @Override
    public int compareTo(AbstractCoOrganizationType organizationType) {
        if (this.getId()!=null) {
            return this.getCode().compareTo(organizationType.getCode());
        }else {
            return 0 ;
        }
    }
}
