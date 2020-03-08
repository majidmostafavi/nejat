package dao;

import entity.CoOrganization;
import entity.CoRole_;
import enumeration.AccessTypeEnum;

import entity.CoPermission;
import entity.CoRole;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by majid on 6/29/16.
 */
@Stateless
@LocalBean
public class RoleDao  extends AbstractDao<CoRole>{

    @PersistenceContext(unitName = "nejat")
    protected EntityManager entityManager;

    public RoleDao() {
        super(CoRole.class);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public CoRole findByTitle(String title){
        try {
            Query query = getEntityManager().createNamedQuery("findRoleByTitle");
            query.setParameter("title",title);
            return (CoRole) query.getSingleResult();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }

    }

    public List<CoRole> findAll(String userName, CoOrganization organization) {
        Query query = getEntityManager().createNamedQuery("findCandidatesPermissions");
        query.setParameter("userName", userName);
        query.setParameter("organization", organization);
        Set<CoPermission> permissions = new HashSet<CoPermission>(query.getResultList());
        List<CoRole> roles = findAll();
        List<CoRole> permittedRoles = new ArrayList<>();
        for (int i = 0; i < roles.size(); i++) {
            CoRole role = roles.get(i);
            if(permissions.containsAll(role.getPermissions())){
                permittedRoles.add(role);
            }
        }
//        query = getEntityManager().createNamedQuery("permittedRolesToAssign");
//        query.setParameter("permissions", permissions);

        return permittedRoles;
    }

/*    public List<CoRole> findRoleByUserAndOrganization (CoUsers user, CoOrganization organization){
        Query query = getEntityManager().createNamedQuery("findRoleByUserAndOrg");
        query.setParameter("user", user);
        query.setParameter("organization", organization);
        return query.getResultList();
    }*/


    public List<CoRole> findAll() {
        Query query=getEntityManager().createNamedQuery("findAllRoles");
        return query.getResultList();
    }

    public List<CoRole> findAllActiveRole() {
        Query query=getEntityManager().createNamedQuery("findAllActiveRoles");
        return query.getResultList();
    }

    public List<CoRole> findAllActiveRoleByAccessType(AccessTypeEnum accessTypeEnum) {
        Query query=getEntityManager().createNamedQuery("findAllActiveRoleByAccessType");
        query.setParameter("accessTypeEnum",accessTypeEnum);
        return query.getResultList();
    }

    public List<CoRole> searchByTitleAndAccessTypeEnumAndActive(String roleTitle, AccessTypeEnum accessTypeEnum, boolean active){
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<CoRole> criteriaQuery = criteriaBuilder.createQuery(CoRole.class);

        Root<CoRole> roleRoot = criteriaQuery.from(CoRole.class);
        Predicate predicate=criteriaBuilder.conjunction();

        if(roleTitle != null){
            predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(roleRoot.get(CoRole_.roleTitle),"%" + roleTitle + "%"));
        }
        if(accessTypeEnum != null){
            predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(roleRoot.get(CoRole_.accessTypeEnum),accessTypeEnum));
        }
        predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(roleRoot.get(CoRole_.active),active));

        criteriaQuery.where(predicate);
        Query query = getEntityManager().createQuery(criteriaQuery);
        return query.getResultList();
    }


    public List<CoRole> findByPermission(CoPermission permission){
        Query query=getEntityManager().createNamedQuery("findRoleByPermission");
        query.setParameter("permission", permission);

        return query.getResultList();
    }

    public List<CoPermission> findPermissionsByRole(CoRole role){
        Query query=getEntityManager().createNamedQuery("findPermissionsByRole");
        query.setParameter("id", role.getId());

        return query.getResultList();
    }
    public List<CoPermission> findPermissionsByRole(List<CoRole> roles){
        Query query=getEntityManager().createNamedQuery("permissionInRole");
        query.setParameter("roles", roles);

        return query.getResultList();
    }

    public long countRoleByName (CoRole role){
        try {
            Query query = getEntityManager().createNamedQuery("countRoleByName");
            query.setParameter("roleTitle",role.getRoleTitle());
            return (long) query.getSingleResult();
        }catch (NoResultException e){
            return 0l;
        }catch (NullPointerException e){
            return 0l;
        }
    }

    public long countRoleByNameEdit (CoRole role){
        try {
            Query query = getEntityManager().createNamedQuery("countRoleByNameEdit");
            query.setParameter("id",role.getId());
            query.setParameter("roleTitle",role.getRoleTitle());
            return (long) query.getSingleResult();
        }catch (NoResultException e){
            return 0l;
        }catch (NullPointerException e){
            return 0l;
        }
    }
}