package entity;

import javax.persistence.*;

/**
 * Created by majid on 1/5/17.
 */
@Entity
@Table(name = "CO_STATE_TRANSACTION")
@TableGenerator(name = "STATETRANSACTIONSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_STATE_TRANSACTION" )
@NamedQueries({
        @NamedQuery(name = "findRecordAction",query = "select transaction from CoStateTransaction transaction where transaction.clazz=:clazz and transaction.record=:record"),
        @NamedQuery(name = "findStateTransactionPersonnel",query = "select transaction.person from CoStateTransaction transaction where transaction.id=:id")
})
public class CoStateTransaction  extends AbstractCoStateTransaction{
    public CoStateTransaction() {
    }


}
