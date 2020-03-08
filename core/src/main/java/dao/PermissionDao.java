package dao;


import entity.CoOrganization;
import entity.CoPermission;
import entity.CoPermissionCategory;
import entity.CoPermission_;
import entity.CoRoleOrganization;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 6/29/16.
 */
@Stateless
@LocalBean
public class PermissionDao extends AbstractDao<CoPermission> {

    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public PermissionDao() {
        super(CoPermission.class);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public List<CoPermission> findAllInCategory(CoPermissionCategory category) {
        try {


            if (category == null) {
                try {
                    return findAll();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Query query = getEntityManager().createNamedQuery("findPermissionsByCategory");
            query.setParameter("category", category);
             query.setHint("org.hibernate.cacheable", true);
            return query.getResultList();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }
    public List<CoPermission> findAllPermissionNotInCategory(){
        try {
            Query query = getEntityManager().createNamedQuery("findAllPermissionNotInCategory");
            return query.getResultList();
        }catch (NoResultException e) {
            return null;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public CoPermission findByKey(String key) {
        try {
            Query query = getEntityManager().createNamedQuery("findPermissionByKey");
            query.setParameter("key", key);
            //    query.setHint("org.hibernate.cacheable", true);
            return (CoPermission) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } catch (NonUniqueResultException ex) {
            return null;
        }
    }

    public List<CoPermission> findPermissionsByPermissionCategory(CoPermissionCategory permissionCategory){
        try {
            Query query = getEntityManager().createNamedQuery("findPermissionsByPermissionCategory");
            query.setParameter("category", permissionCategory);
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public long countPermissionsByPermissionCategory(CoPermissionCategory permissionCategory){
        try {
            Query query = getEntityManager().createNamedQuery("countPermissionsByPermissionCategory");
            query.setParameter("category", permissionCategory);
            return (long)query.getSingleResult();
        } catch (NoResultException e) {
            return 0l;
        } catch (NullPointerException e) {
            return 0l;
        }
    }

    public boolean existsPermissionByKey(Long id, String key) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
        Root<CoPermission> permissionRoot = criteriaQuery.from(CoPermission.class);
        criteriaQuery.select(criteriaBuilder.count(permissionRoot.get(CoPermission_.id)));

        Predicate criteria = criteriaBuilder.equal(permissionRoot.get(CoPermission_.key), key);
        if (id!=null)
            criteria = criteriaBuilder.and(criteria, criteriaBuilder.notEqual(permissionRoot.get(CoPermission_.id),id));
        criteriaQuery.where(criteria);

        TypedQuery<Long> query = getEntityManager().createQuery(criteriaQuery);

        Long count = (Long) query.getSingleResult();
        return count != 0;
    }

    public boolean existsPermissionByTitle(Long id, String title) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
        Root<CoPermission> permissionRoot = criteriaQuery.from(CoPermission.class);
        criteriaQuery.select(criteriaBuilder.count(permissionRoot.get(CoPermission_.id)));

        Predicate criteria = criteriaBuilder.equal(permissionRoot.get(CoPermission_.title), title);
        if (id!=null)
            criteria = criteriaBuilder.and(criteria, criteriaBuilder.notEqual(permissionRoot.get(CoPermission_.id),id));
        criteriaQuery.where(criteria);

        TypedQuery<Long> query = getEntityManager().createQuery(criteriaQuery);

        Long count = (Long) query.getSingleResult();
        return count != 0;
    }

    public boolean existsPermissionByShortTitle(Long id, String shortTitle) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
        Root<CoPermission> permissionRoot = criteriaQuery.from(CoPermission.class);
        criteriaQuery.select(criteriaBuilder.count(permissionRoot.get(CoPermission_.id)));

        Predicate criteria = criteriaBuilder.equal(permissionRoot.get(CoPermission_.key), shortTitle);
        if (id!=null)
            criteria = criteriaBuilder.and(criteria, criteriaBuilder.notEqual(permissionRoot.get(CoPermission_.id),id));
        criteriaQuery.where(criteria);

        TypedQuery<Long> query = getEntityManager().createQuery(criteriaQuery);

        Long count = (Long) query.getSingleResult();
        return count != 0;
    }

    public boolean canRemove(CoPermission permission){
        Query query = getEntityManager().createNamedQuery("usedInRole");
        query.setParameter("permission", permission);
        try {
            Long result = (Long) query.getSingleResult();
            return result>0 ? false : true;
        }catch (NonUniqueResultException | NoResultException e){
            return false;
        }
    }

    public boolean hasPermission(CoRoleOrganization roleOrganization, CoPermission permission) {
        try {
            Query query = getEntityManager().createNamedQuery("roleOrgHasPermission");
            query.setParameter("roleOrg", roleOrganization);
            query.setParameter("permission", permission);
            query.setParameter("active", true);
            return (Long) query.getSingleResult()!=0;
        } catch (NonUniqueResultException ex) {
            return false;
        }
    }

    public boolean hasAnyPermissionInCategory(CoRoleOrganization roleOrganization, CoPermissionCategory category) {
        try {
            Query query = getEntityManager().createNamedQuery("hasAnyPermissionInCategory");
            query.setParameter("roleOrg", roleOrganization);
            query.setParameter("category", category);
            query.setParameter("active", true);
            return (Long) query.getSingleResult()!=0;
        } catch (NonUniqueResultException ex) {
            return false;
        }
    }

    public List<CoPermission> findPermissionByCategory(CoRoleOrganization roleOrganization, CoPermissionCategory category) {
        try {
            Query query = getEntityManager().createNamedQuery("permissionInCategory");
            query.setParameter("roleOrg", roleOrganization);
            query.setParameter("category", category);
            query.setParameter("active", true);
            return query.getResultList();
        } catch (NoResultException ex) {
            return new ArrayList<>(0);
        }catch (NullPointerException ex){
            return new ArrayList<>(0);
        }
    }

    public List<CoPermission> findPermissionByRoleOrganization(CoRoleOrganization roleOrganization) {
        try {
            Query query = getEntityManager().createNamedQuery("permissionInRoleOrganization");
            query.setParameter("roleOrg", roleOrganization);

            return query.getResultList();
        } catch (NoResultException ex) {
            return new ArrayList<>(0);
        }catch (NullPointerException ex){
            return new ArrayList<>(0);
        }
    }
    public List<CoPermission> findPermissionsByUsername(String userName, CoOrganization organization) {
        Query query = getEntityManager().createNamedQuery("findPermissionsByUsername");
        query.setParameter("userName", userName);
        query.setParameter("organization", organization );
        return query.getResultList();
    }
}