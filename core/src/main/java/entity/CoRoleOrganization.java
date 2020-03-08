package entity;

import javax.persistence.*;

/**
 * Created by majid on 6/25/16.
 */
@Entity
@Table(name = "CO_ROLE_ORGANIZATION")
@TableGenerator(name = "ROLEORGANIZATIONSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_ROLE_ORGANIZATION" )
@NamedQueries({
        @NamedQuery(name = "findOrgByRoleOrg",  query = "select roleOrg.coOrganization from CoRoleOrganization roleOrg where roleOrg.id=:roleOrgId and roleOrg.coOrganization.active=:active"),
        @NamedQuery(name = "countRoleOrgByRole", query = "select count(roleOrg) from CoRoleOrganization roleOrg inner join roleOrg.roles role where role=:selectRole and roleOrg.coOrganization.active=:active and roleOrg.id not in :id"),
        @NamedQuery(name = "findRoleOrganizationByRole", query = "select roleOrg from CoRoleOrganization roleOrg inner join roleOrg.roles role where role=:selectRole and roleOrg.coOrganization.active=:active"),
        @NamedQuery(name = "findOrgsByRoleOrgs", query = "select roleOrg.coOrganization from CoRoleOrganization roleOrg where roleOrg.coOrganization.active=:active and roleOrg in (:roleOrgIds)"),
        @NamedQuery(name = "findRolesByRoleOrg", query = "select roleOrg.roles from CoRoleOrganization roleOrg where roleOrg.id=:roleOrgId and roleOrg.coOrganization.active=:active"),
        @NamedQuery(name = "roleOrgHasPermission", query = "select count(permission) from CoRoleOrganization roleOrg inner join roleOrg.roles role inner join role.permissions permission where roleOrg=:roleOrg and roleOrg.coOrganization.active=:active and permission=:permission"),
        @NamedQuery(name = "hasAnyPermissionInCategory", query = "select count(permission) from CoRoleOrganization roleOrg inner join roleOrg.roles role inner join role.permissions permission where roleOrg=:roleOrg and roleOrg.coOrganization.active=:active and permission.category=:category"),
        @NamedQuery(name = "permissionInCategory", query = "select permission from CoRoleOrganization roleOrg inner join roleOrg.roles role inner join role.permissions permission where roleOrg=:roleOrg and roleOrg.coOrganization.active=:active and permission.category=:category"),
        @NamedQuery(name = "permissionInRoleOrganization", query = "select permission from CoRoleOrganization roleOrg inner join roleOrg.roles role inner join role.permissions permission where roleOrg=:roleOrg"),
        @NamedQuery(name = "countRoleOrganizationByRoleExceptUser", query = "select count(roleOrg) from CoRoleOrganization roleOrg inner join roleOrg.roles role where role=:role and roleOrg.coOrganization.active=:active and roleOrg.user.userName not in :user"),
        @NamedQuery(name = "personnelByOrganizationAndPermission", query = "select roleOrg.user.person from CoRoleOrganization roleOrg inner join roleOrg.roles role inner join role.permissions permission where permission.key=:permissionKey and (roleOrg.coOrganization.pathCode like :pathCode or roleOrg.coOrganization=:organization and roleOrg.coOrganization.active=:active)"),
        @NamedQuery(name = "findPersonnelEmailsByRole", query = "select roleOrg.user.person.email from CoRoleOrganization roleOrg inner join roleOrg.roles role inner join roleOrg.user user inner join user.person where role=:role and roleOrg.coOrganization.active=:active and not roleOrg.user.person.email is null"),
        @NamedQuery(name = "findSupplierEmailsByRole", query = "select roleOrg.user.person.email from CoRoleOrganization roleOrg inner join roleOrg.roles role inner join roleOrg.user user inner join user.person where role=:role and roleOrg.coOrganization.active=:active and not roleOrg.user.person.email is null"),
        @NamedQuery(name = "findPersonnelMobilesByRole", query = "select roleOrg.user.person.mobile from CoRoleOrganization roleOrg inner join roleOrg.roles role inner join roleOrg.user user inner join user.person where role=:role and roleOrg.coOrganization.active=:active and not roleOrg.user.person.mobile is null"),
        @NamedQuery(name = "findSupplierMobilesByRole", query = "select roleOrg.user.person.mobile from CoRoleOrganization roleOrg inner join roleOrg.roles role inner join roleOrg.user user inner join user.person where role=:role and roleOrg.coOrganization.active=:active and not roleOrg.user.person.mobile is null")
})
@Cacheable
public class CoRoleOrganization extends AbstractCoRoleOrganization {

    public CoRoleOrganization() {
    }
}
