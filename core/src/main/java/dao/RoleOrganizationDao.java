package dao;


import entity.*;
import entity.dto.RoleOrganizationDTO;
import utils.PersianUTF;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by majid on 6/26/16.
 */
@Stateless
public class RoleOrganizationDao extends AbstractDao<CoRoleOrganization> {

    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public RoleOrganizationDao() {
        super(CoRoleOrganization.class);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public CoOrganization findOrganization(CoRoleOrganization roleOrganization) {
        try {
            Query query = getEntityManager().createNamedQuery("findOrgByRoleOrg");
            query.setParameter("roleOrgId", roleOrganization.getId());
            query.setParameter("active", true);
        //    query.setHint("org.hibernate.cacheable", true);
            return (CoOrganization) query.getSingleResult();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public List<CoRole> findByRoleOrganization(CoRoleOrganization roleOrganization){
       try {
           Query query = getEntityManager().createNamedQuery("findRolesByRoleOrg");
           query.setParameter("roleOrgId", roleOrganization.getId());
           query.setParameter("active", true);
//           query.setHint("org.hibernate.cacheable", true);
           return query.getResultList();
       }catch (NullPointerException e){
           return null;
       }catch (NoResultException e){
           return null;
       }
    }

    public List<CoPermission> findPermissionByRoleOrganization(CoRoleOrganization roleOrganization){
        try {
            Query query = getEntityManager().createNamedQuery("permissionInRoleOrganization");
            query.setParameter("roleOrg", roleOrganization);
//            query.setParameter("active", true);
            query.setHint("org.hibernate.cacheable", true);
            return query.getResultList();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public Long countRoleOrgByRole(CoRole role, CoRoleOrganization roleOrganization) {
        Query query = getEntityManager().createNamedQuery("countRoleOrgByRole");
        query.setParameter("selectRole", role);
        query.setParameter("id", roleOrganization.getId());
        query.setParameter("active", true);
        return (Long) query.getSingleResult();
    }

    public List<CoRoleOrganization> findRoleOrganizationByRole(CoRole role) {
        Query query = getEntityManager().createNamedQuery("findRoleOrganizationByRole");
        query.setParameter("selectRole", role);
        query.setParameter("active", true);
        return query.getResultList();
    }

    public Long countRoleOrganizationByRoleExceptUser(CoRole role, String userName){
        Query query = getEntityManager().createNamedQuery("countRoleOrganizationByRoleExceptUser");
        query.setParameter("role", role);
        query.setParameter("user", userName);
        query.setParameter("active", true);
        return (Long) query.getSingleResult();
    }

    public List<CoPerson> personnelByOrganizationAndPermission(CoOrganization organization, String permissionKey) {
        try {
            Query query = getEntityManager().createNamedQuery("personnelByOrganizationAndPermission");
            query.setParameter("pathCode", organization.getPathCode()+"#"+"%");
            query.setParameter("organization",organization);
            query.setParameter("permissionKey", permissionKey);
            query.setParameter("active", true);
            return query.getResultList();
        } catch (NoResultException ex) {
            return new ArrayList<>();
        }catch (NullPointerException ex){
            return new ArrayList<>();
        }
    }

    public List<String> findPersonnelEmailsByRole(CoRole role) {
        try {
            Query query = getEntityManager().createNamedQuery("findPersonnelEmailsByRole");
            query.setParameter("role", role);
            query.setParameter("active", true);
            return query.getResultList();
        } catch (NoResultException ex) {
            return new ArrayList<>();
        }catch (NullPointerException ex){
            return new ArrayList<>();
        }
    }

    public List<String> findSupplierEmailsByRole(CoRole role) {
        try {
            Query query = getEntityManager().createNamedQuery("findSupplierEmailsByRole");
            query.setParameter("role", role);
            query.setParameter("active", true);
            return query.getResultList();
        } catch (NoResultException ex) {
            return new ArrayList<>();
        }catch (NullPointerException ex){
            return new ArrayList<>();
        }
    }

    public List<String> findPersonnelMobilesByRole(CoRole role) {
        try {
            Query query = getEntityManager().createNamedQuery("findPersonnelMobilesByRole");
            query.setParameter("role", role);
            query.setParameter("active", true);
            return query.getResultList();
        } catch (NoResultException ex) {
            return new ArrayList<>();
        }catch (NullPointerException ex){
            return new ArrayList<>();
        }
    }

    public List<String> findSupplierMobilesByRole(CoRole role) {
        try {
            Query query = getEntityManager().createNamedQuery("findSupplierMobilesByRole");
            query.setParameter("role", role);
            query.setParameter("active", true);
            return query.getResultList();
        } catch (NoResultException ex) {
            return new ArrayList<>();
        }catch (NullPointerException ex){
            return new ArrayList<>();
        }
    }

    public List<RoleOrganizationDTO> findRoleOrganizationByUserAndRoleAndPermission(CoOrganization organization,
                                                                                    CoRole role,
                                                                                    String userFirstName,
                                                                                    String userLastName,
                                                                                    String username,
                                                                                    String nationalCode,
                                                                                    CoPermission permission) {
        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<RoleOrganizationDTO> criteriaQuery = builder.createQuery(RoleOrganizationDTO.class);

        Root<CoRoleOrganization> roleOrganizationRoot = criteriaQuery.from(CoRoleOrganization.class);
        Join<CoRoleOrganization,CoUsers> usersJoin = roleOrganizationRoot.join(CoRoleOrganization_.user);
        Join<CoUsers,CoPerson> personnelJoin = usersJoin.join(CoUsers_.person);
        Join<CoRoleOrganization,CoOrganization> organizationJoin = roleOrganizationRoot.join(CoRoleOrganization_.coOrganization);
        Join<CoRoleOrganization,CoRole> roleJoin = roleOrganizationRoot.join(CoRoleOrganization_.roles);

        criteriaQuery.select(
                builder.construct(
                        RoleOrganizationDTO.class,
                        roleOrganizationRoot.get(CoRoleOrganization_.id),
                        usersJoin.get(CoUsers_.userName),
                        personnelJoin.get(CoPerson_.firstName),
                        personnelJoin.get(CoPerson_.lastName),
                        personnelJoin.get(CoPerson_.nationalCode),
                        organizationJoin.get(CoOrganization_.name),
                        organizationJoin.get(CoOrganization_.codeDigit)
                )
        ).distinct(true);

        Predicate predicate = builder.conjunction();

        predicate = builder.and(predicate, builder.equal(usersJoin.get(CoUsers_.active),true));
        if (organization != null && organization.getId() != null) {
            predicate = builder.and(predicate, builder.or(
                    builder.like(organizationJoin.get(CoOrganization_.pathCode), organization.getPathCode() + "#%"),
                    builder.equal(organizationJoin.get(CoOrganization_.id), organization.getId())
            ));
        }
        if (role != null && role.getId() != null){
            predicate= builder.and(predicate,builder.equal(roleJoin.get(CoRole_.id), role.getId()));
        }
        if(userFirstName !=null &&  !userFirstName.isEmpty()){
            predicate = builder.and(predicate,builder.or(
                    builder.like(personnelJoin.get(CoPerson_.firstName),"%" + PersianUTF.farsiRevision(userFirstName) + "%"),
                    builder.like(personnelJoin.get(CoPerson_.firstName),"%" + PersianUTF.arabicRevision(userFirstName) + "%")
            ));
        }
        if(userLastName != null &&  !userLastName.isEmpty()){
            predicate = builder.and(predicate,builder.or(
                    builder.like(personnelJoin.get(CoPerson_.lastName),"%" + PersianUTF.farsiRevision(userLastName) + "%"),
                    builder.like(personnelJoin.get(CoPerson_.lastName),"%" + PersianUTF.arabicRevision(userLastName) + "%")
            ));
        }
        if (username != null && !username.isEmpty()) {
            predicate = builder.and(predicate, builder.equal(usersJoin.get(CoUsers_.userName),username));
        }
        if(nationalCode != null &&  !nationalCode.isEmpty()){
            predicate = builder.and(predicate,builder.equal(personnelJoin.get(CoPerson_.nationalCode),  nationalCode));
        }
        if (permission != null && permission.getId() != null){
            Subquery subquery = criteriaQuery.subquery(CoRole.class);
            Root<CoRole> roleRoot = subquery.from(CoRole.class);
            Join<CoRole,CoPermission> permissionJoin = roleRoot.join(CoRole_.permissions);
            subquery.select(roleRoot).distinct(true);

            Predicate predicate1;
            predicate1 = builder.equal(permissionJoin,  permission);
            subquery.where(predicate1);

            predicate = builder.and(predicate, roleJoin.in(subquery));
        }

        criteriaQuery.where(predicate);

        Query query = getEntityManager().createQuery(criteriaQuery);
        List<RoleOrganizationDTO> result = query.getResultList();
        return result;
    }

    public List<CoPerson> findPersonnelsByRolesAndOrganizations(List<CoRole> roleList, List<CoOrganization> organizationList){

        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<CoPerson> criteriaQuery = builder.createQuery(CoPerson.class);

        Root<CoRoleOrganization> roleOrganizationRoot = criteriaQuery.from(CoRoleOrganization.class);
        Join<CoRoleOrganization,CoRole> roleJoin = roleOrganizationRoot.join(CoRoleOrganization_.roles);
        Join<CoRoleOrganization,CoUsers> usersJoin = roleOrganizationRoot.join(CoRoleOrganization_.user);
        Join<CoUsers,CoPerson> personnelJoin = usersJoin.join(CoUsers_.person);

        criteriaQuery.select(personnelJoin);

        Predicate predicate = builder.conjunction();

        if (organizationList != null && organizationList.size() != 0) {
            predicate = builder.and(predicate, roleOrganizationRoot.get(CoRoleOrganization_.coOrganization).in(organizationList));
        }
        if (roleList != null && roleList.size() != 0){
            predicate = builder.and(predicate, roleJoin.in(roleList));
        }

        criteriaQuery.where(predicate);

        Query query = getEntityManager().createQuery(criteriaQuery);
        List<CoPerson> result = query.getResultList();
        return result;
    }
}
