package entity;

import javax.persistence.*;

/**
 * Created by majid on 11/30/16.
 */
@Entity
@Cacheable
@Table(name = "CO_STATE")
@TableGenerator(name = "STATESequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_STATE" )
@NamedQueries({
        @NamedQuery(name = "findStateByClass",query = "select state from CoState state where state.clazz=:class and state.active=true "),
        @NamedQuery(name = "findStateById",query = "select state from CoState state where state.id=:id"),
        @NamedQuery(name = "findStartedStateByClass",query = "select state from CoState  state where state.clazz=:class and state.start=true and state.active=true"),
        @NamedQuery(name = "findDraftStateByClass",query = "select state from CoState  state where state.clazz=:class and state.draft=true and state.active=true"),
        @NamedQuery(name = "findByClassAndKey",query = "select state from CoState  state where state.clazz=:class and state.key=:key and state.active=true"),
        @NamedQuery(name = "findStateByClassAndStart", query = "select state from CoState state where state.clazz=:clazz and state.start=:start and state.active=true"),
        @NamedQuery(name = "findEndedStateByClass",query = "select state from CoState state where state.clazz =:class and state.end =true and state.active=true"),
        @NamedQuery(name = "findAccountingStateByClass",query = "select state from CoState state where state.clazz =:class and state.accounting =true and state.active=true"),
        @NamedQuery(name = "findStableStateByClass",query = "select state from CoState state where state.clazz =:class and state.stable =true and state.active=true"),
        @NamedQuery(name = "findRejectedStateByClass",query = "select state from CoState state where state.clazz =:class and state.rejected =true and state.active=true"),
        @NamedQuery(name = "findStateByClassAndStableAndFinal" , query = "select state from CoState state where state.clazz =:class and state.stable=:stable and state.end=:ended and state.active=true"),
        @NamedQuery(name = "findAutoStateByClass" , query = "select state from CoState state where state.clazz=:class and state.autoGeneration =true and state.active=true"),
        @NamedQuery(name = "countStateByKeyOrName", query = "select count(state) from CoState state where (state.clazz=:class and state.key=:key) or (state.clazz=:class and state.name=:name) and state.active=true"),
        @NamedQuery(name = "countStateByKeyOrNameForEdit", query = "select count(state) from CoState state where  state.active=true and state.id not in :id and ((state.clazz=:class and state.key=:key) or (state.clazz=:class and state.name=:name))")


})

public class CoState extends AbstractCoState{

    public CoState() {
    }
}
