package dao;


import entity.*;
import stateMachine.StateTransactionDto;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 1/5/17.
 */
@Stateless
@LocalBean
public class StateTransactionDao extends AbstractDao<CoStateTransaction> {
    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public StateTransactionDao() {
        super(CoStateTransaction.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    public List<CoStateTransaction> findRecordAction(Long record, Class clazz){
        try {
            Query query = entityManager.createNamedQuery("findRecordAction");
            query.setParameter("record", record);
            query.setParameter("clazz", clazz);
            return query.getResultList();
        }catch (NoResultException e){
            return new ArrayList<>(0);
        }catch (NullPointerException e){
            return new ArrayList<>(0);
        }
    }

    public List<StateTransactionDto> findTransactionHistory(Long record, Class clazz){
        try{
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<StateTransactionDto> criteriaQuery = builder.createQuery(StateTransactionDto.class);
            Root<CoStateTransaction> stateTransactionRoot = criteriaQuery.from(CoStateTransaction.class);
            Join<CoStateTransaction,CoStateAction> stateActionJoin = stateTransactionRoot.join(CoStateTransaction_.stateAction, JoinType.INNER);
            Join<CoStateTransaction, CoPerson> personnelJoin = stateTransactionRoot.join(CoStateTransaction_.person, JoinType.INNER);
            criteriaQuery.select(
                    builder.construct(
                            StateTransactionDto.class,
                            personnelJoin.get((CoPerson_.id)),
                            personnelJoin.get(CoPerson_.firstName),
                            personnelJoin.get(CoPerson_.lastName),
                            stateTransactionRoot.get(CoStateTransaction_.message),
                            stateTransactionRoot.get(CoStateTransaction_.date),
                            stateActionJoin.get(CoStateAction_.id),
                            stateActionJoin.get(CoStateAction_.stateName)

                    )
            );
            Predicate predicate=builder.conjunction();
            if (record !=null){
                predicate=builder.and(predicate,builder.equal(stateTransactionRoot.get(CoStateTransaction_.record),record));
            }
            if (clazz !=null){
                predicate=builder.and(predicate,builder.equal(stateTransactionRoot.get(CoStateTransaction_.clazz),clazz));
            }
            criteriaQuery.where(predicate);
            criteriaQuery.orderBy(builder.asc(stateTransactionRoot.get(CoStateTransaction_.date)));
            Query query = getEntityManager().createQuery(criteriaQuery);
            List<StateTransactionDto> result = query.getResultList();
            return result;

        }catch (NoResultException e){
            return new ArrayList<>(0);
        }catch (NullPointerException e){
            return new ArrayList<>(0);
        }
    }

}
