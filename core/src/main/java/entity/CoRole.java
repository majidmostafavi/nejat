package entity;

import javax.persistence.*;

/**
 * Created by majid on 6/25/16.
 */

@Entity
@Table(name = "CO_ROLE")
@TableGenerator(name = "ROLESequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_ROLE" )
@NamedQueries({
        @NamedQuery(name = "findAllRoles", query = "select role from CoRole role "),
        @NamedQuery(name = "findAllActiveRoles", query = "select role from CoRole role where role.active=true"),
        @NamedQuery(name = "findAllActiveRoleByAccessType", query = "select role from CoRole role where role.active=true and role.accessTypeEnum=:accessTypeEnum"),
        @NamedQuery(name = "findRoleByTitle", query = "select role from CoRole role where role.roleTitle=:title"),
        @NamedQuery(name = "findPermissionsByRole", query = "select role.permissions from CoRole role where role.id=:id"),
        @NamedQuery(name = "findRoleByPermission", query = "select role from CoRole role where :permission in elements(role.permissions) "),
        @NamedQuery(name="permissionInRole", query = "select permission from CoRole role inner  join role.permissions permission where role in (:roles)"),
        @NamedQuery(name="countRoleByName", query = "select count(role) from CoRole role where role.roleTitle=:roleTitle"),
        @NamedQuery(name="countRoleByNameEdit", query = "select count(role) from CoRole role where role.roleTitle=:roleTitle and role.id not in :id")
})
@Cacheable
public class CoRole extends AbstractCoRole {
    public CoRole() {
    }
}