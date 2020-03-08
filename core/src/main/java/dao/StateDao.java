package dao;

import entity.CoState;
import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 12/3/16.
 */

@Stateless
public class StateDao extends AbstractDao<CoState> {

    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public StateDao() {
        super(CoState.class);
    }


    public CoState findById(Long id) {
        Query query =entityManager.createNamedQuery("findStateById");
        query.setParameter("id",id);
        query.setHint("org.hibernate.cacheable", true);
        return (CoState) query.getSingleResult();
    }

    public List<CoState> findStateByClass(Class clazz){
        Query query =entityManager.createNamedQuery("findStateByClass");
        query.setParameter("class",clazz);
        query.setHint("org.hibernate.cacheable", true);
        return query.getResultList();
    }

    public CoState findStartedStateByClass(Class clazz){
        try {
            Query query =entityManager.createNamedQuery("findStartedStateByClass");
            query.setParameter("class",clazz);
            query.setHint("org.hibernate.cacheable", true);
            return (CoState) query.getSingleResult();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public CoState findDraftStateByClass(Class clazz){
        try {
            Query query =entityManager.createNamedQuery("findDraftStateByClass");
            query.setParameter("class",clazz);
            query.setHint("org.hibernate.cacheable", true);
            return (CoState) query.getSingleResult();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public CoState findByClassAndKey(Class clazz, String key){
        try {
            Query query =entityManager.createNamedQuery("findByClassAndKey");
            query.setParameter("class",clazz);
            query.setParameter("key",key);
            query.setHint("org.hibernate.cacheable", true);
            return (CoState) query.getSingleResult();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public CoState findStateByClassAndStart(Class clazz){
        try{
            Query query =entityManager.createNamedQuery("findStateByClassAndStart");
            query.setParameter("clazz",clazz);
            query.setParameter("start",true);
            query.setHint("org.hibernate.cacheable", true);
            return (CoState) query.getSingleResult();
        }catch (Exception e){
            return null;
        }
    }

    public CoState findEndStateByClass(Class clazz){
        try {
            Query query =entityManager.createNamedQuery("findEndedStateByClass");
            query.setParameter("class",clazz);
            query.setHint("org.hibernate.cacheable", true);
            return (CoState) query.getSingleResult();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public CoState findAccountingStateByClass(Class clazz){
        try {
            Query query =entityManager.createNamedQuery("findAccountingStateByClass");
            query.setParameter("class",clazz);
            query.setHint("org.hibernate.cacheable", true);
            return (CoState) query.getSingleResult();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public List<CoState> findRejectedStateByClass(Class clazz){
        try{
            Query query =entityManager.createNamedQuery("findRejectedStateByClass");
            query.setParameter("class",clazz);
            query.setHint("org.hibernate.cacheable", true);
            return query.getResultList();
        }catch (NullPointerException e){
            return new ArrayList<>(0);
        }catch (NoResultException e){
            return new ArrayList<>(0);
        }
    }

    public List<CoState> findStateByClassAndStableAndFinal(Class clazz, boolean stable, boolean ended){
        try{
            Query query =entityManager.createNamedQuery("findStateByClassAndStableAndFinal");
            query.setParameter("class",clazz);
            query.setParameter("stable",stable);
            query.setParameter("ended",ended);
            query.setHint("org.hibernate.cacheable", true);
            return query.getResultList();
        }catch (NullPointerException e){
            return new ArrayList<>(0);
        }catch (NoResultException e){
            return new ArrayList<>(0);
        }
    }

    public List<CoState> findStableStateByClass(Class clazz){
        try {
            Query query =entityManager.createNamedQuery("findStableStateByClass");
            query.setParameter("class",clazz);
            query.setHint("org.hibernate.cacheable", true);
            return query.getResultList();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public CoState findAutoStateByClass(Class clazz){
        try {
            Query query =entityManager.createNamedQuery("findAutoStateByClass");
            query.setParameter("class",clazz);
            query.setHint("org.hibernate.cacheable", true);
            return (CoState) query.getSingleResult();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public long countByKeyOrName(CoState state) {
        try {
            Query query = entityManager.createNamedQuery("countStateByKeyOrName");
            query.setParameter("class",state.getClazz());
            query.setParameter("key", state.getKey());
            query.setParameter("name", state.getName());
            return (long) query.getSingleResult();
        } catch (NoResultException e){
            return 0l;
        } catch (NullPointerException e){
            return 0l;
        }
    }

    public long countByKeyOrNameForEdit(CoState state) {
        try {
            Query query = entityManager.createNamedQuery("countStateByKeyOrNameForEdit");
            query.setParameter("id",state.getId());
            query.setParameter("class",state.getClazz());
            query.setParameter("key", state.getKey());
            query.setParameter("name", state.getName());
            return (long) query.getSingleResult();
        } catch (NoResultException e){
            return 0l;
        } catch (NullPointerException e){
            return 0l;
        }
    }

   /* public boolean countState(Class<?> clazz, CoState state){
        try {

            String table = clazz.getAnnotation(Table.class).name();
            String stateColumn =StateMachineUtils.findStateMethod(clazz, "").getAnnotation(JoinColumn.class).name();

            StringBuffer s = new StringBuffer();
            s.append("select" + " ");
            s.append("count" + " "+ "(*)"+" ");
            s.append("from" + " ");
            s.append(table);
            s.append(" ");
            s.append("where" + " ");
            s.append(stateColumn);
            s.append("=");
            s.append(state.getId());

            Query q = getEntityManager().createNativeQuery(s.toString());
            q.executeUpdate();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }*/
}
