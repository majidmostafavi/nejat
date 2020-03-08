package dao;

import entity.CoPermissionCategory;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 6/29/16.
 */
@Stateless
@LocalBean
public class PermissionCategoryDao extends AbstractDao<CoPermissionCategory>{
    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public PermissionCategoryDao() {
        super(CoPermissionCategory.class);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public CoPermissionCategory findByName(String name){
        try {
            Query query = getEntityManager().createNamedQuery("findPermissionCategoryByName");
            query.setParameter("categoryName", name);
            return (CoPermissionCategory) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }catch (NullPointerException ex) {
            return null;
        }
    }

    public CoPermissionCategory findByCode(Long code){
        try {
            Query query = getEntityManager().createNamedQuery("findPermissionCategoryByCode");
            query.setParameter("code", code);
            return (CoPermissionCategory) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }catch (NullPointerException ex) {
            return null;
        }
    }

    public long countByNameOrCode(CoPermissionCategory permissionCategory){
        try {
            Query query = getEntityManager().createNamedQuery("countPermissionCategoryByNameOrCode");
            query.setParameter("name",permissionCategory.getCategoryName());
            query.setParameter("code",permissionCategory.getCode());
            return (long) query.getSingleResult();
        } catch (NoResultException e){
            return 0l;
        } catch (NullPointerException e){
            return 0l;
        }
    }

    public long countByNameOrCodeForEdit(CoPermissionCategory permissionCategory){
        try {
            Query query = getEntityManager().createNamedQuery("countPermissionCategoryByNameOrCodeForEdit");
            query.setParameter("id",permissionCategory.getId());
            query.setParameter("name",permissionCategory.getCategoryName());
            query.setParameter("code",permissionCategory.getCode());
            return (long) query.getSingleResult();
        } catch (NoResultException e){
            return 0l;
        } catch (NullPointerException e){
            return 0l;
        }
    }

    public List<CoPermissionCategory> findAll(){
        try{
            Query query = entityManager.createNamedQuery("findAllPermissionCategory");
            return  query.getResultList();
        }catch (NullPointerException e){
            return new ArrayList<>();
        }catch (NoResultException e){
            return new ArrayList<>();
        }
    }
}
