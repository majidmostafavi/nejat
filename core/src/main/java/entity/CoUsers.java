package entity;

import javax.persistence.*;

/**
 * Created by majid on 6/25/16.
 */
@Entity
@Table(name = "CO_USERS")
@TableGenerator(name = "UserSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_USERS" )
@NamedQueries({
        @NamedQuery(name = "disableUser", query = "update CoUsers u set u.active=false where u.userName=:username"),
        @NamedQuery(name = "findAllUsers", query = "select u from CoUsers u"),
        @NamedQuery(name = "findUserByUsername", query = "select u from CoUsers u where (u.userName)=:username"),
        @NamedQuery(name = "findUserDTOByUsername", query = " select new entity.dto.UserDTO(u.userName,u.password,u.active,u.person.id,u.person.id) from CoUsers u where (u.userName)=:username"),
        @NamedQuery(name = "findRoleOrganizations",query = "SELECT distinct roleOrg FROM CoUsers user inner join user.roleOrganizations roleOrg WHERE user.userName=:userName and user.active=:active and roleOrg.active=:active"),
        @NamedQuery(name = "countRoleOrganizations",query = "SELECT count(distinct roleOrg) FROM CoUsers user inner join user.roleOrganizations roleOrg WHERE user.userName=:userName and user.active=:active"),
        @NamedQuery(name = "findRoleOrgByUserAndOrganization",query = "SELECT roleOrg FROM CoUsers user inner join user.roleOrganizations roleOrg WHERE user.userName=:user and roleOrg.coOrganization =:organization"),
        @NamedQuery(name = "findPasswordByUsername", query = "select u.password from CoUsers u where lower(u.userName)=:username"),
        @NamedQuery(name = "findRoleOrganization", query = "SELECT distinct roleOrg FROM CoUsers user inner join user.roleOrganizations roleOrg inner join roleOrg.coOrganization org WHERE user.userName=:userName and org=:organization"),
        @NamedQuery(name = CoUsers.DEFAULT_PERMISSIONS_NAMED_QUERY, query = "SELECT distinct permission.key FROM CoUsers user " +
                "                inner join user.roleOrganizations roleorg " +
                "                inner join roleorg.roles role " +
                "                inner join role.permissions permission " +
                "                where user.userName=:userName and roleorg.coOrganization=:organization"),
        @NamedQuery(name = "findPersonnelByUsername", query = "select u.person from CoUsers u where lower(u.userName)=:userName"),
        @NamedQuery(name = "findSupplierByUsername",query = "select u.person from CoUsers u where lower(u.userName)=:userName"),
        @NamedQuery(name = "countPersonnelInUser", query = "select count(user)  from CoUsers user where user.person.id =:id"),
        @NamedQuery(name = "findUserByPersonnel", query = "select user from CoUsers user where user.person =:personnel"),
        @NamedQuery(name = "findAllRoleOrganizations", query = "SELECT user.roleOrganizations FROM CoUsers user INNER join user.roleOrganizations roleorg where user.userName=:userName"),
        @NamedQuery(name = "findReadOnlyRoleOrganizations", query = "SELECT distinct user.roleOrganizations FROM CoUsers user INNER join user.roleOrganizations roleorg where user.userName=:userName and roleorg.creator<>:creator"),
        @NamedQuery(name = "findCandidatesPermissions", query = "SELECT role.permissions FROM CoUsers user " +
                "inner join user.roleOrganizations roleorg " +
                "                inner join roleorg.roles role " +
                "                where user.userName=:userName and roleorg.coOrganization=:organization"),
        @NamedQuery(name = "findRolesByUsername", query = "SELECT distinct role FROM CoUsers user " +
                "inner join user.roleOrganizations roleorg " +
                "                inner join roleorg.roles role " +
                "                where user.userName=:userName and roleorg.creator=:creator"),


        @NamedQuery(name = "findRolesByUsernameOrganization", query = "SELECT distinct role FROM CoUsers user " +
                "                inner join user.roleOrganizations roleorg " +
                "                inner join roleorg.roles role " +
                "                where user.userName=:userName and roleorg.coOrganization=:organization"),
        @NamedQuery(name = "findUserByOrg",query = "select user from CoUsers user inner join user.roleOrganizations roleorg inner join roleorg.coOrganization organization where organization.pathCode like :pathCode"),
        @NamedQuery(name = "updateUserPassword", query = "update CoUsers user set user.password=:newPassword where user.id=:id"),
        @NamedQuery(name = "findUserByUsernameAndOrganization", query = "select count(u) from CoUsers u inner join u.roleOrganizations roleOrg inner join roleOrg.coOrganization org where (u.userName)=:username and org=:organization"),
        @NamedQuery(name = "countUserByUsernameAndOrganization", query = "select count(u) from CoUsers u inner join u.roleOrganizations roleOrg inner join roleOrg.coOrganization org where (u.userName=:username or u.person=:personnel or u.person=:supplier) and org=:organization"),
        @NamedQuery(name = "countUserByUsernameAndOrganizationForEdit", query = "select count(u) from CoUsers u inner join u.roleOrganizations roleOrg inner join roleOrg.coOrganization org where (u.userName=:username or u.person=:personnel or u.person=:supplier) and org=:organization and u.id not in :id"),
        @NamedQuery(name = "countUserByUsername",query = "select count(user) from CoUsers  user where user.userName=:userName"),
        @NamedQuery(name = "findOrganizationByUsername", query = "select roleorg.coOrganization from CoUsers user inner join user.roleOrganizations roleorg where user.userName=:userName"),
        @NamedQuery(name = "findUserByUsernamePassword", query = "select u from CoUsers u where u.userName=:username and u.password=:password"),
})

@Cacheable
public class CoUsers extends AbstractCoUsers{
    public static final String DEFAULT_PERMISSIONS_NAMED_QUERY = "query.permission_named_query";
    public CoUsers() {
    }
}
