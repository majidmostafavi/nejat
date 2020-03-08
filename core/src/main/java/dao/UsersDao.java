package dao;

import entity.*;
import entity.dto.UserDTO;
import utils.PersianUTF;

import javax.ejb.Stateless;
import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 6/25/16.
 */
@Stateless
public class UsersDao extends AbstractDao<CoUsers>  {

    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public UsersDao() {
        super(CoUsers.class);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void disableUser(String username) {
        Query query = getEntityManager().createNamedQuery("disableUser");
        query.setParameter("username", username);
        query.executeUpdate();
    }

    public List<CoRoleOrganization> findRoleOrganizations(String username) {
        try {
            Query query = getEntityManager().createNamedQuery("findRoleOrganizations");
            query.setParameter("userName", username);
            query.setParameter("active", true);
            return query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>(0);
        }


    }

    public long countRoleOrganizations(CoUsers user) {
        try {
            Query query = getEntityManager().createNamedQuery("countRoleOrganizations");
            query.setParameter("userName", user.getUserName());
            query.setParameter("active", true);
            return (long)query.getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
            return 0l;
        }


    }

    public CoUsers findByUsername(String username) {
        try {
            Query query = getEntityManager().createNamedQuery("findUserByUsername");
            query.setParameter("username", username.toLowerCase());
            CoUsers users = (CoUsers) query.getSingleResult();
            entityManager.detach(users);
            // query.setHint("org.hibernate.cacheable", true);
            return users;
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return new CoUsers();
        }catch (NoResultException ex){
            ex.printStackTrace();
            return new CoUsers();
        }
    }

    public CoUsers findUserByUsernamePassword(String username, String password) {
        try {
            Query query = getEntityManager().createNamedQuery("findUserByUsernamePassword");
            query.setParameter("username", username.toLowerCase());
            query.setParameter("password",CoUsers.hashSHA1(password));
            CoUsers users = (CoUsers) query.getSingleResult();
//            entityManager.detach(users);
            return users;
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return new CoUsers();
        }catch (NoResultException ex){
            ex.printStackTrace();
            return new CoUsers();
        }
    }


    public UserDTO findUserDTOByUsername(String username) {
        try {
            Query query = getEntityManager().createNamedQuery("findUserDTOByUsername");
            query.setParameter("username", username.toLowerCase());
            UserDTO users = (UserDTO) query.getSingleResult();
            // query.setHint("org.hibernate.cacheable", true);
            return users;
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return null;
        }catch (NoResultException ex){
            ex.printStackTrace();
            return null;
        }
    }


    public CoUsers findUserByUsernameAndOrganization(CoUsers user,CoOrganization organization) {
        try {
            Query query = getEntityManager().createNamedQuery("findUserByUsernameAndOrganization");
            query.setParameter("username", user.getUserName().toLowerCase());
            query.setParameter("organization", organization);
            CoUsers users = (CoUsers) query.getSingleResult();
            entityManager.detach(users);
            // query.setHint("org.hibernate.cacheable", true);
            return users;
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return new CoUsers();
        }catch (NoResultException ex){
            ex.printStackTrace();
            return new CoUsers();
        }
    }

    public long countUserByUsernameAndOrganization(CoUsers user,CoOrganization organization) {
        try {
            Query query = getEntityManager().createNamedQuery("countUserByUsernameAndOrganization");
            query.setParameter("username", user.getUserName().toLowerCase());
            query.setParameter("organization", organization);
            query.setParameter("personnel", user.getPerson());
           // query.setParameter("supplier", user.getSupplier());
            return (long)query.getSingleResult();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return 0l;
        }catch (NoResultException ex){
            ex.printStackTrace();
            return 0l;
        }
    }

    public long countUserByUsernameAndOrganizationForEdit(CoUsers user ,CoOrganization organization) {
        try {
            Query query = getEntityManager().createNamedQuery("countUserByUsernameAndOrganizationForEdit");
            query.setParameter("username", user.getUserName().toLowerCase());
            query.setParameter("organization", organization);
            query.setParameter("id", user.getId());
            query.setParameter("personnel", user.getPerson());
          //  query.setParameter("supplier", user.getSupplier());
            return (long)query.getSingleResult();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return 0l;
        }catch (NoResultException ex){
            ex.printStackTrace();
            return 0l;
        }
    }

    public String findPasswordByUsername(String username) {
        try {
            Query query = getEntityManager().createNamedQuery("findPasswordByUsername");
            query.setParameter("username", username.toLowerCase());
//            query.setHint("org.hibernate.cacheable", true);
            return (String) query.getSingleResult();
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<String> getPermissionByUsernameRoleOrgId(String userName, CoOrganization CoOrganization) {
        Query query = getEntityManager().createNamedQuery(CoUsers.DEFAULT_PERMISSIONS_NAMED_QUERY);
        query.setParameter("userName", userName);
        query.setParameter("organization", CoOrganization);
//        query.setHint("org.hibernate.cacheable", true);
        return query.getResultList();
    }

    public List<CoRole> findRolesByUsernameOrganization(String username, CoOrganization organization){
        try {
            Query query = getEntityManager().createNamedQuery("findRolesByUsernameOrganization");
            query.setParameter("userName", username);
            query.setParameter("organization", organization);
            return query.getResultList();
        }catch (NullPointerException e){
            return new ArrayList<>();
        }catch (NoResultException e){
            return new ArrayList<>();
        }
    }

    public CoRoleOrganization findRoleOrganization(String username, CoOrganization organization) {
        Query query = getEntityManager().createNamedQuery("findRoleOrganization");
        query.setParameter("userName", username);
        query.setParameter("organization", organization);
        query.setMaxResults(1);
        try {
            return (CoRoleOrganization) query.getSingleResult();
        }catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }catch (NonUniqueResultException une){
            une.printStackTrace();
            return null;
        }
    }

    public CoRoleOrganization findRoleOrgByUserAndOrganization(String userName, CoOrganization organization) {
        Query query = getEntityManager().createNamedQuery("findRoleOrgByUserAndOrganization");
        query.setParameter("user", userName);
        query.setParameter("organization", organization);
        query.setMaxResults(1);
        try {
            return (CoRoleOrganization) query.getSingleResult();
        }catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }catch (NonUniqueResultException une){
            une.printStackTrace();
            return null;
        }
    }

    public CoPerson findPersonnelByUsername(String username) {
        Query query = getEntityManager().createNamedQuery("findPersonnelByUsername");
        query.setParameter("userName", username);
        //      query.setHint("org.hibernate.cacheable", true);
        return (CoPerson) query.getSingleResult();
    }

    public List<CoOrganization> findOrganizationByUsername(String username) {
        Query query = getEntityManager().createNamedQuery("findOrganizationByUsername");
        query.setParameter("userName", username);
        //      query.setHint("org.hibernate.cacheable", true);
        return query.getResultList();
    }

/*    public CmSupplier findSupplierByUsername(String username) {
        Query query = getEntityManager().createNamedQuery("findSupplierByUsername");
        query.setParameter("userName", username);
        //      query.setHint("org.hibernate.cacheable", true);
        return (CmSupplier) query.getSingleResult();
    }*/

    public List<CoUsers> search(String firstName,
                                String lastName,
                                String userName,
                                CoOrganization organization,
                                String nationalCode,
                                CoRole role,
                                int from, int page){

        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<CoUsers> criteriaQuery = criteriaBuilder.createQuery(CoUsers.class);

        Root<CoUsers> usersRoot = criteriaQuery.from(CoUsers.class);
        Join<CoUsers,CoPerson> personnelJoin = usersRoot.join(CoUsers_.person, JoinType.LEFT);
        Join<CoUsers,CoRoleOrganization> roleOrganizationJoin = usersRoot.join(CoUsers_.roleOrganizations, JoinType.INNER);
        Join<CoRoleOrganization,CoOrganization> organizationJoin= roleOrganizationJoin.join(CoRoleOrganization_.coOrganization, JoinType.INNER);
        Join<CoRoleOrganization,CoRole> roleJoin = roleOrganizationJoin.join(CoRoleOrganization_.roles, JoinType.INNER);
        criteriaQuery.select(usersRoot).distinct(true);
        Predicate predicate = criteriaBuilder.conjunction();

        predicate = criteriaBuilder.isTrue(roleJoin.get(CoRole_.active));
        Subquery subquery = criteriaQuery.subquery(CoRoleOrganization.class);
        Root<CoRoleOrganization> roleOrganizationRoot = subquery.from(CoRoleOrganization.class);
        subquery.select(roleOrganizationRoot.get(CoRoleOrganization_.user));
        Predicate subqueryPredicate = criteriaBuilder.conjunction();
//        subqueryPredicate = criteriaBuilder.isTrue(organizationJoin.get(CoOrganization_.active));
        subqueryPredicate = criteriaBuilder.and(subqueryPredicate, criteriaBuilder.like(organizationJoin.get(CoOrganization_.pathCode), organization.getPathCode() + "%"));
        subquery.where(subqueryPredicate);
        subquery.groupBy(roleOrganizationRoot.get(CoRoleOrganization_.user));
        predicate = criteriaBuilder.and(predicate,(usersRoot.get(CoUsers_.id).in(subquery)));
        if(firstName !=null &&  !firstName.isEmpty()){
            predicate = criteriaBuilder.and(predicate,criteriaBuilder.or(
                    criteriaBuilder.like(personnelJoin.get(CoPerson_.firstName),"%" + PersianUTF.farsiRevision(firstName) + "%"),
                    criteriaBuilder.like(personnelJoin.get(CoPerson_.firstName),"%" + PersianUTF.arabicRevision(firstName) + "%")
            ));
        }
        if(lastName != null &&  !lastName.isEmpty()){
            predicate = criteriaBuilder.and(predicate,criteriaBuilder.or(
                    criteriaBuilder.like(personnelJoin.get(CoPerson_.lastName),"%" + PersianUTF.farsiRevision(lastName) + "%"),
                    criteriaBuilder.like(personnelJoin.get(CoPerson_.lastName),"%" + PersianUTF.arabicRevision(lastName) + "%")
            ));
        }
        if(userName != null && !userName.isEmpty()){
            predicate = criteriaBuilder.and(predicate,criteriaBuilder.like(usersRoot.get(CoUsers_.userName), "%" + userName + "%"));
        }
        if (organization != null && organization.getId() != null){
//            predicate = criteriaBuilder.and(predicate,criteriaBuilder.isTrue(organizationJoin.get(CoOrganization_.active)));
            predicate= criteriaBuilder.and(predicate,criteriaBuilder.like(organizationJoin.get(CoOrganization_.pathCode), organization.getPathCode()+"%"));
        }
        if(nationalCode != null &&  !nationalCode.isEmpty()){
            predicate = criteriaBuilder.and(predicate,criteriaBuilder.equal(personnelJoin.get(CoPerson_.nationalCode),  nationalCode));
        }
        if (role != null && role.getId() != null){
            predicate= criteriaBuilder.and(predicate,criteriaBuilder.equal(roleJoin.get(CoRole_.id), role.getId()));
        }
        criteriaQuery.orderBy(criteriaBuilder.asc(personnelJoin.get(CoPerson_.lastName)));

        //append where clause
        criteriaQuery.where(predicate);
        TypedQuery<CoUsers> queryResult = getEntityManager().createQuery(criteriaQuery);

        //append sizing
        queryResult.setFirstResult(from);
        if (page > 0){
            queryResult.setMaxResults(page);
        }

        return queryResult.getResultList();
    }

    public Long countSearch(String firstName,
                            String lastName,
                            String userName,
                            CoOrganization organization,
                            String nationalCode,
                            CoRole role){

        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);

        //create parametric where clause
        Root<CoUsers> usersRoot = criteriaQuery.from(CoUsers.class);
        Join<CoUsers,CoPerson> personnelJoin = usersRoot.join(CoUsers_.person, JoinType.LEFT);
        Join<CoUsers,CoRoleOrganization> roleOrganizationJoin = usersRoot.join(CoUsers_.roleOrganizations, JoinType.INNER);
        Join<CoRoleOrganization,CoOrganization> organizationJoin= roleOrganizationJoin.join(CoRoleOrganization_.coOrganization, JoinType.INNER);
        Join<CoRoleOrganization,CoRole> roleJoin = roleOrganizationJoin.join(CoRoleOrganization_.roles, JoinType.INNER);
        criteriaQuery.select(criteriaBuilder.countDistinct(usersRoot));
        Predicate predicate = criteriaBuilder.conjunction();

        predicate = criteriaBuilder.isTrue(roleJoin.get(CoRole_.active));
        Subquery subquery = criteriaQuery.subquery(CoRoleOrganization.class);
        Root<CoRoleOrganization> roleOrganizationRoot = subquery.from(CoRoleOrganization.class);
        subquery.select(roleOrganizationRoot.get(CoRoleOrganization_.user));
        Predicate subqueryPredicate = criteriaBuilder.conjunction();
//        subqueryPredicate = criteriaBuilder.isTrue(organizationJoin.get(CoOrganization_.active));
        subqueryPredicate = criteriaBuilder.and(subqueryPredicate, criteriaBuilder.like(organizationJoin.get(CoOrganization_.pathCode), organization.getPathCode() + "%"));
        subquery.where(subqueryPredicate);
        subquery.groupBy(roleOrganizationRoot.get(CoRoleOrganization_.user));
        predicate = criteriaBuilder.and(predicate,(usersRoot.get(CoUsers_.id).in(subquery)));
        if(firstName !=null &&  !firstName.isEmpty()){
            predicate = criteriaBuilder.and(predicate,criteriaBuilder.or(
                    criteriaBuilder.like(personnelJoin.get(CoPerson_.firstName),"%" + PersianUTF.farsiRevision(firstName) + "%"),
                    criteriaBuilder.like(personnelJoin.get(CoPerson_.firstName),"%" + PersianUTF.arabicRevision(firstName) + "%")
            ));
        }
        if(lastName != null &&  !lastName.isEmpty()){
            predicate = criteriaBuilder.and(predicate,criteriaBuilder.or(
                    criteriaBuilder.like(personnelJoin.get(CoPerson_.lastName),"%" + PersianUTF.farsiRevision(lastName) + "%"),
                    criteriaBuilder.like(personnelJoin.get(CoPerson_.lastName),"%" + PersianUTF.arabicRevision(lastName) + "%")
            ));
        }
        if(userName != null && !userName.isEmpty()){
            predicate = criteriaBuilder.and(predicate,criteriaBuilder.like(usersRoot.get(CoUsers_.userName), "%" + userName + "%"));
        }
        if (organization != null && organization.getId() != null){
//            predicate = criteriaBuilder.and(predicate,criteriaBuilder.isTrue(organizationJoin.get(CoOrganization_.active)));
            predicate= criteriaBuilder.and(predicate,criteriaBuilder.like(organizationJoin.get(CoOrganization_.pathCode), organization.getPathCode()+"%"));
        }
        if(nationalCode != null &&  !nationalCode.isEmpty()){
            predicate = criteriaBuilder.and(predicate,criteriaBuilder.equal(personnelJoin.get(CoPerson_.nationalCode),  nationalCode));
        }
        if (role != null && role.getId() != null){
            predicate= criteriaBuilder.and(predicate,criteriaBuilder.equal(roleJoin.get(CoRole_.id), role.getId()));
        }

        //append where clause
        criteriaQuery.where(predicate);
        TypedQuery<Long> queryResult = getEntityManager().createQuery(criteriaQuery);

        return queryResult.getSingleResult();
    }

    public CoUsers findUserByPersonnel(CoPerson personnel) {
        try {
            Query query = getEntityManager().createNamedQuery("findUserByPersonnel");
            query.setParameter("personnel",personnel);
            return (CoUsers) query.getSingleResult();
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public List<CoRoleOrganization> findReadOnlyRoleOrganizations(CoUsers user, String creator) {
        Query query = getEntityManager().createNamedQuery("findReadOnlyRoleOrganizations");
        query.setParameter("userName", user.getUserName());
        query.setParameter("creator", creator);
        List list = query.getResultList();
        return list;
    }

    public List<CoUsers> findUserByOrg(String pathCode){
        try {
            Query query = entityManager.createNamedQuery("findUserByOrg");
            query.setParameter("pathCode",pathCode +"%");
            return query.getResultList();
        } catch (NoResultException e){
            return null;
        } catch (NullPointerException e){
            return null;
        }
    }

    public int changePassword(CoUsers users){
        try {
            Query query = entityManager.createNamedQuery("updateUserPassword");
            query.setParameter("newPassword",CoUsers.hashSHA1(users.getPassword()));
            query.setParameter("id",users.getId());
            return query.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    public long countUserByUsername(String username){
        try {
            Query query=entityManager.createNamedQuery("countUserByUsername");
            query.setParameter("userName",username);
            return (long) query.getSingleResult();
        }catch (Exception e){
            return 0l;
        }
    }

}