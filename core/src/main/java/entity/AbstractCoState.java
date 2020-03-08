package entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by majid on 11/30/16.
 */
@MappedSuperclass
public  abstract class AbstractCoState  extends BaseEntity{

    private Long id;
    private String name;
    private String key;
    private Class clazz;
    private boolean start;
    private boolean end;
    private boolean draft;
    private boolean printable;
    private boolean editable;
    private boolean deletable;
    private boolean stable;
    private boolean validation;
    private boolean rejected;
    private boolean general;
    private String color;
    private boolean signature;
    private boolean accounting;

    private boolean autoGeneration;
    private Set<CoStateAction> toStateActions;
    private Set<CoStateAction> fromStateActions;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "STATESequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = false, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME",unique = true, nullable = false, insertable = true, updatable = false, precision = 50, scale = 0)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "KEY",unique = true, nullable = false, insertable = true, updatable = false, precision = 20, scale = 0)
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    @Column(name = "CLASS",unique = true, nullable = false, insertable = true, updatable = false, precision = 100, scale = 0)
    public Class getClazz() {
        return clazz;
    }
    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @NotNull
    @Column(name = "STARTED",unique = false, nullable = false, insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isStart() {
        return start;
    }
    public void setStart(boolean start) {
        this.start = start;
    }

    @NotNull
    @Column(name = "ENDED",unique = false, nullable = false, insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isEnd() {
        return end;
    }
    public void setEnd(boolean end) {
        this.end = end;
    }

    @NotNull
    @Column(name = "DRAFT",unique = false, nullable =false, insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isDraft() {
        return draft;
    }
    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    @NotNull
    @Column(name = "PRINTABLE",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isPrintable() {
        return printable;
    }
    public void setPrintable(boolean printable) {
        this.printable = printable;
    }

    @NotNull
    @Column(name = "EDITABLE",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isEditable() {
        return editable;
    }
    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    @NotNull
    @Column(name = "DELETABLE",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isDeletable() {
        return deletable;
    }
    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }

    @NotNull
    @Column(name = "STABLE",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isStable() {
        return stable;
    }
    public void setStable(boolean stable) {
        this.stable = stable;
    }

    @NotNull
    @Column(name = "VALIDATION",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isValidation() {
        return validation;
    }
    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    @Column(name = "COLOR",unique = false, nullable =true,insertable = true, updatable = false, precision = 1, scale = 0)
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @NotNull
    @Column(name = "REJECTED",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isRejected() {return rejected;}
    public void setRejected(boolean rejected) {this.rejected = rejected;}

    @NotNull
    @Column(name = "GENERAL",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isGeneral() {
        return general;
    }
    public void setGeneral(boolean general) {
        this.general = general;
    }

    @NotNull
    @Column(name = "AUTO",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isAutoGeneration() {
        return autoGeneration;
    }
    public void setAutoGeneration(boolean autoGeneration) {
        this.autoGeneration = autoGeneration;
    }

    @NotNull
    @Column(name = "SIGNATURE",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isSignature() {
        return signature;
    }
    public void setSignature(boolean signature) {
        this.signature = signature;
    }

    @NotNull
    @Column(name = "ACCOUNTING",unique = false, nullable =false,insertable = true, updatable = false, precision = 1, scale = 0)
    public boolean isAccounting() {
        return accounting;
    }
    public void setAccounting(boolean accounting) {
        this.accounting = accounting;
    }

    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, mappedBy = "toState")
    public Set<CoStateAction> getToStateActions() {
        return toStateActions;
    }
    public void setToStateActions(Set<CoStateAction> toStateActions) {
        this.toStateActions = toStateActions;
    }

    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, mappedBy = "fromState")
    public Set<CoStateAction> getFromStateActions() {
        return fromStateActions;
    }
    public void setFromStateActions(Set<CoStateAction> fromStateActions) {
        this.fromStateActions = fromStateActions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCoState)) return false;

        AbstractCoState that = (AbstractCoState) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return clazz != null ? clazz.equals(that.clazz) : that.clazz == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (clazz != null ? clazz.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  name ;
    }

}
