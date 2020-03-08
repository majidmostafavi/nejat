package entity;

import enumeration.SubSystem;

import javax.persistence.*;

/**
 * Created by majid on 11/30/16.
 */
@Entity
@Cacheable
@Table(name = "CO_USECASE")
@TableGenerator(name = "USECASESequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_USECASE" )
@NamedQueries({
        @NamedQuery(name = "findUsecaseByName", query = "select usecase from CoUsecase usecase where usecase.name=:name"),
        @NamedQuery(name = "findUsecaseByClass", query = "select usecase from CoUsecase usecase where usecase.clazz=:clazz"),
        @NamedQuery(name = "countUsecaseByNameOrClazz", query = "select count(usecase) from CoUsecase usecase where usecase.name=:name or usecase.clazz=:clazz"),
        @NamedQuery(name = "countUsecaseByNameOrClazzForEdit", query = "select count(usecase) from CoUsecase usecase where usecase.id not in :id and (usecase.name like :name or usecase.clazz =:clazz)"),
        @NamedQuery(name = "findUsecaseBySubSystem", query = "select usecase from CoUsecase usecase where usecase.subSystem=:subSystemEnum"),
//        @NamedQuery(name = "findIndependentAccountsWithBudgetUseCase", query = "select usecase.independentAccounts from CoUsecase usecase where usecase.clazz=:clazz")
})
public class CoUsecase extends AbstractCoUsecase  {

    public CoUsecase() {
    }

    public CoUsecase(Class clazz, Long id) {
        super(clazz, id);
    }

    public CoUsecase(Long id, String name, Class clazz, SubSystem subSystem) {
        super(id, name, clazz, subSystem);
    }
}
