package entity;

import org.apache.shiro.authz.Permission;
import javax.persistence.*;

/**
 * Created by majid on 6/25/16.
 */
@Entity
@Cacheable
@Table(name = "CO_PERMISSION")
@TableGenerator(name = "PERMISSIONSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_PERMISSION" )
@NamedQueries({
        @NamedQuery(name = "findPermissionsByPermissionCategory", query = "select permission from CoPermission permission where permission.category= :category order by permission.persianTitle"),
        @NamedQuery(name = "countPermissionsByPermissionCategory", query = "select count(permission) from CoPermission permission where permission.category= :category"),
        @NamedQuery(name = "findAllPermissionNotInCategory", query = "select permission from CoPermission permission where permission.category is null order by permission.persianTitle"),
        @NamedQuery(name = "findPermissionByKey", query = "select permission from CoPermission permission where permission.key=:key"),
        @NamedQuery(name = "findPermissionsByCategory", query = "select p from CoPermission p where p.category= :category"),
        @NamedQuery(name = "existsPermissionByTitle", query = "select count(p) from CoPermission p where p.title= :title"),
        @NamedQuery(name = "existsPermissionByShortTitle", query = "select count(p) from CoPermission p where p.key= :shortTitle"),
        @NamedQuery(name = "existsPermissionByKey", query = "select count(p) from CoPermission p where p.key= :key"),
        @NamedQuery(name = "findPermissionsByUsername", query = "SELECT permissions FROM CoPermission permissions where permissions in (select roles.permissions from CoRole roles where roles in (select roleorgs.roles from CoRoleOrganization roleorgs where roleorgs in (select u.roleOrganizations from CoUsers u where u.userName=:userName) and roleorgs.organization=:organization))"),

})
public class CoPermission extends AbstractCoPermission implements Permission{

    public CoPermission() {
    }

    @Override
    public boolean implies(Permission permission) {
        return false;
    }
}