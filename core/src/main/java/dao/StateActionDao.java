package dao;


import entity.CoStateAction;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by majid on 12/3/16.
 */
@Stateless
@LocalBean
public class StateActionDao extends AbstractDao<CoStateAction>{

    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public StateActionDao() {
        super(CoStateAction.class);
    }

    public List<CoStateAction> findStateActionByClass(Class clazz){
        Query query =entityManager.createNamedQuery("findStateActionByClass");
        query.setParameter("class",clazz);
        query.setHint("org.hibernate.cacheable", true);
        return query.getResultList();
    }

    public long countByNameAndFromAndToState(CoStateAction stateAction) {
        try {
            Query query = entityManager.createNamedQuery("countStateActionByNameAndFromAndToState");
            query.setParameter("stateName",stateAction.getStateName());
            query.setParameter("fromState", stateAction.getFromState());
            query.setParameter("toState", stateAction.getToState());
            return (long) query.getSingleResult();
        } catch (NoResultException e){
            return 0l;
        } catch (NullPointerException e){
            return 0l;
        }
    }

    public long countByNameAndFromAndToStateForEdit(CoStateAction stateAction) {
        try {
            Query query = entityManager.createNamedQuery("countStateActionByNameAndFromAndToStateForEdit");
            query.setParameter("id",stateAction.getId());
            query.setParameter("stateName",stateAction.getStateName());
            query.setParameter("fromState", stateAction.getFromState());
            query.setParameter("toState", stateAction.getToState());
            return (long) query.getSingleResult();
        } catch (NoResultException e){
            return 0l;
        } catch (NullPointerException e){
            return 0l;
        }
    }
}
