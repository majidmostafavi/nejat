package security;


import dao.UsersDao;
import entity.CoPermission;
import entity.CoRoleOrganization;
import utils.NejatCache;
import utils.Constants;
import utils.ManagedBeanManager;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by majid on 6/22/16.
 */
public class NejatRealm extends AuthorizingRealm {

    public static final Map<String,Set<CoPermission>> USER_PERMISSION_FULL_CACHE = new NejatCache<String, Set<CoPermission>>();
     UsersDao usersDao;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        CoRoleOrganization roleOrganization = (CoRoleOrganization) ((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true)).getAttribute(Constants.ROLE_ORG_ATTR);
        //CmOrganization cmOrganization = SessionManager.getOrganization();
        //RoleOrganization roleOrganization = LoggedUsersHolder.getRoleOrganization(username);
        //RoleOrganization is stored in the user's session, but his username is stored in his cookies
        //so there are cases the user name is restored from cookies but RoleOrganization is null
        //forward the user to thee login page in these cases!
        if ((roleOrganization == null) && (principals != null)) {
            {
                ((SimplePrincipalCollection) principals).clear();
//            throw new AuthorizationException("User's Session has expired!", new Exception());
            }
            if (principals == null)
                throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }


        String username = (String) getAvailablePrincipal(principals);

        Set<String> roleNames = new HashSet<String>();
        roleNames.add("NO_ROLE");

        Set<String> permissions= new HashSet();
        USER_PERMISSION_FULL_CACHE.get(username).forEach(permission -> permissions.add(permission.getKey()));
        USER_PERMISSION_FULL_CACHE.values();

//        Set<String> permissions = new HashSet(getUsersDao().getPermissionByUsernameRoleOrgId(username, cmOrganization));

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);
        info.setStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;
        String username = upToken.getUsername();
//        userFacade.clear();
        AuthenticationInfo info = buildAuthenticationInfo(username, getUsersDao().findPasswordByUsername(username).toCharArray());
        return info;
    }

    protected AuthenticationInfo buildAuthenticationInfo(String username, char[] password) {
        return new SimpleAuthenticationInfo(username, password, getName());
    }

    public UsersDao getUsersDao(){
        if(usersDao==null)
            usersDao =  ManagedBeanManager.lookup(UsersDao.class);
        return usersDao;
    }

}
