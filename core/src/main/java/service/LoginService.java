package service;


import dao.RoleOrganizationDao;
import dao.UsersDao;
import entity.*;
import entity.dto.UserDTO;
import security.LoginManager;
import utils.exception.ActiveException;
import utils.exception.PasswordException;
import utils.exception.UserException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nahal on 8/23/17.
 */
@Stateless
@LocalBean
public class LoginService extends AbstractService {

    @EJB
    LoginManager loginManager;
    @EJB
    UsersDao usersDao;
    @EJB
    RoleOrganizationDao roleOrganizationDao;


    protected Subject currentUser;


    public List<CoRoleOrganization> findRoleOrganizations (String username){
        try {
            return usersDao.findRoleOrganizations(username);
        }catch (Exception e){
            logger.error("No Result", e);
            return new ArrayList<>(0);
        }
    }

    public CoUsers findByUsername(String username){
        try {
            return usersDao.findByUsername(username);
        }catch (Exception e){
            logger.error("No Result", e);
            return new CoUsers();
        }
    }
    public boolean findUserDTOByUsername(String username, String password) throws PasswordException,UserException,ActiveException{
        UserDTO userDTO = usersDao.findUserDTOByUsername(username);
      if ( userDTO== null){
          throw new UserException();
      }else if (userDTO!=null && (!userDTO.getPassword().equals(password)) ){
          throw new PasswordException();
      }else if (userDTO!=null && (!userDTO.getActive())){
          throw new ActiveException();
      } else if (userDTO!=null && userDTO.getPassword().equals(password)){
          return true;
      }
      return false;
    }
    public CoPerson findPersonnelByUsername(String username){
        try {
            return usersDao.findPersonnelByUsername(username);
        }catch (Exception e){
            logger.error("No Result", e);
            return new CoPerson();
        }
    }
  /*  public CoPerson findSupplierByUsername(String username){
        try {
            return usersDao.findSupplierByUsername(username);
        }catch (Exception e){
            logger.error("No Result", e);
            return new CoPerson();
        }
    }
*/
    public void writeException(Throwable lae) {
        Throwable tr = lae.getCause();
        if (tr == null)
            return;
        else
            writeException(tr);
    }

    public String logout(){
        String result = "gotoLogin";
        currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return result;
    }

    public List<CoPermission> findPermissionByRoleOrganization (CoRoleOrganization roleOrganization){
        try {
            return roleOrganizationDao.findPermissionByRoleOrganization(roleOrganization);
        }catch (Exception e){
            logger.error("No Result", e);
            return new ArrayList<>(0);
        }
    }

    public String loginOverFlowed(String username){
        usersDao.disableUser(username);
        return "/loginOverflowed.jsf?faces-redirect=true";
    }

    public String authenticated(String username){
        loginManager.invalidLogin(username);
        if(loginManager.isLoginRestricted(username)){

        }
        return null;
    }

    public void simpleLoginMethod(String username, String password){
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        currentUser = SecurityUtils.getSubject();
        currentUser.login(token);
    }

    public boolean authenticatedValidation(){
        return SecurityUtils.getSubject().isAuthenticated();
    }

    public CoRoleOrganization findRoleOrganization(String username, CoOrganization organization){
        try {
            return usersDao.findRoleOrganization(username, organization);
        }catch (Exception e){
            logger.error("No Result", e);
            return new CoRoleOrganization();
        }
    }

}
