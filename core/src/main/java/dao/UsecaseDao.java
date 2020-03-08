package dao;


import entity.CoUsecase;
import enumeration.SubSystem;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 12/3/16.
 */
@Stateless
@LocalBean
public class UsecaseDao  extends AbstractDao<CoUsecase>{
    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public UsecaseDao() {
        super(CoUsecase.class);
    }

    public CoUsecase findByClass(Class clazz){
        Query query = entityManager.createNamedQuery("findUsecaseByClass");
        query.setParameter("clazz",clazz);
        return (CoUsecase) query.getSingleResult();
    }

    public CoUsecase findUsecaseByName(String name) {
        Query query = getEntityManager().createNamedQuery("findUsecaseByName");
        query.setParameter("name", name);
        try {
            return (CoUsecase) query.getSingleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }catch (NonUniqueResultException e){
            e.printStackTrace();
            return null;
        }
    }

    public long countByNameOrClazz(CoUsecase usecase){
        try {
            Query query = getEntityManager().createNamedQuery("countUsecaseByNameOrClazz");
            query.setParameter("name",usecase.getName());
            query.setParameter("clazz",usecase.getClazz());
            return (long) query.getSingleResult();
        } catch (NoResultException e){
            return 0l;
        } catch (NullPointerException e){
            return 0l;
        }
    }

    public long countByNameOrClazzForEdit(CoUsecase usecase){
        try {
            Query query = getEntityManager().createNamedQuery("countUsecaseByNameOrClazzForEdit");
            query.setParameter("id",usecase.getId());
            query.setParameter("name",usecase.getName());
            query.setParameter("clazz",usecase.getClazz());
            return (long) query.getSingleResult();
        } catch (NoResultException e){
            return 0l;
        } catch (NullPointerException e){
            return 0l;
        }
    }



    public CoUsecase findUsecaseByClass(Class clazz){
        try {
            Query query = getEntityManager().createNamedQuery("findUsecaseByClass");
            query.setParameter("clazz",clazz);
            return (CoUsecase) query.getSingleResult();
        } catch (NoResultException e){
            return null;
        } catch (NullPointerException e){
            return null;
        }
    }

    public List<CoUsecase> findUsecaseBySubSystem(SubSystem subSystemEnum){
        try {
            Query query = getEntityManager().createNamedQuery("findUsecaseBySubSystem");
            query.setParameter("subSystemEnum",subSystemEnum);
            return query.getResultList();
        } catch (NoResultException e){
            return new ArrayList<>(0);
        } catch (NullPointerException e){
            return new ArrayList<>(0);
        }
    }

}
