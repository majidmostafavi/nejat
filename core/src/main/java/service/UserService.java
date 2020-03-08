package service;

import dao.UsersDao;
import entity.*;
import utils.exception.DuplicateDataException;
import utils.exception.RelationDataException;
import utils.exception.SaveRecordException;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by majid on 7/12/16.
 */
@Stateless
@LocalBean
public class UserService extends AbstractService{

    @EJB
    UsersDao usersDao;

    public boolean validation(CoUsers user,CoOrganization organization) throws DuplicateDataException,RelationDataException,SaveRecordException {
        if (usersDao.findUserByUsernameAndOrganization(user,organization).getUserName() == null){
            return true;
        }else {
            throw new DuplicateDataException();
        }
    }

    public boolean canSave(CoUsers user, CoOrganization organization) throws DuplicateDataException{
        if (usersDao.countUserByUsernameAndOrganization(user,organization) == 0l){
            return true;
        }else {
            throw new DuplicateDataException();
        }
    }

    public boolean canEdit(CoUsers user,CoOrganization organization) throws DuplicateDataException,RelationDataException{
        if (usersDao.countUserByUsernameAndOrganizationForEdit(user,organization) == 0l){
            return true;
        }else {
            throw new DuplicateDataException();
        }
    }

    public boolean canDelete(CoUsers user) throws RelationDataException{
        if (usersDao.countRoleOrganizations(user) == 0l){
            return true;
        }else {
            throw new RelationDataException();
        }
    }

    public void create(CoUsers users,CoOrganization organization) throws DuplicateDataException,RelationDataException,SaveRecordException{
        if (canSave(users,organization)){
            usersDao.createOrEdit(users);
        }
    }


    public void edit(CoUsers user,CoOrganization organization)throws DuplicateDataException,RelationDataException,SaveRecordException{
        if(canEdit(user,organization)) {
            usersDao.edit(user);
        }
    }

    public void delete(CoUsers user) throws RelationDataException{
        if (canDelete(user)) {
            usersDao.delete(user);
        }
    }

    public List<CoUsers> findAll(){
        try {
            return usersDao.findAll();
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public List<CoRole> findRolesByUsernameOrganization(String userName, CoOrganization organization){
        try {
            return usersDao.findRolesByUsernameOrganization(userName,organization);
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public CoRoleOrganization findRoleOrgByUserAndOrganization(String userName, CoOrganization organization){
        try {
            return usersDao.findRoleOrgByUserAndOrganization(userName,organization);
        }catch (Exception e){
            logger.error("No Result" , e);
            return null;
        }
    }

    public CoUsers findByUsername(String string){
        CoUsers user = usersDao.findByUsername(string);
         if (user != null){
             return user;
         }else {
             return new CoUsers();
         }
    }

    public List<CoUsers> lazySearch(String firstName, String lastName, String userName, CoOrganization organization, String nationalCode, CoRole role, int first, int pageSize){
        try{
            return usersDao.search(firstName,lastName,userName,organization,nationalCode,role,first,pageSize);
        }catch (Exception e){
            return new ArrayList<CoUsers>(0);
        }
    }
    public Long countLazySearch(String firstName, String lastName, String userName, CoOrganization organization, String nationalCode, CoRole role){
        try{
            return usersDao.countSearch(firstName,lastName,userName,organization,nationalCode,role);
        }catch (Exception e){
            return 0l;
        }
    }

    public CoRoleOrganization findRoleOranization(String userName, CoOrganization organization){
        try {
            return usersDao.findRoleOrganization(userName,organization);
        }catch (Exception e){
            logger.error("Delete Failed", e);
            return null;
        }
    }

    public CoUsers findUserByPerssonel(CoPerson personnel){
        return usersDao.findUserByPersonnel(personnel);
    }

    public List<CoUsers> findUserByOrg(String pathCode){
        try {
            return usersDao.findUserByOrg(pathCode);
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public List<CoRoleOrganization> findRoleOrganizations (String username){
        try{
            return usersDao.findRoleOrganizations(username);
        }catch (Exception e){
            return new ArrayList<CoRoleOrganization>(0);
        }
    }

    public int changePassword(CoUsers users){
        return usersDao.changePassword(users);
    }

    public void disableUser(String username){
        usersDao.disableUser(username);
    }

    public CoPerson findPersonnelByUsername(String username){
        try {
            return usersDao.findPersonnelByUsername(username);
        }catch (Exception e){
            logger.error("No Result", e);
            return new CoPerson();
        }
    }
    public CoUsers findUserByUsernamePassword(String username, String password){
        try {
            return usersDao.findUserByUsernamePassword(username,password);
        }catch (Exception e){
            logger.error("No Result", e);
            return new CoUsers();
        }
    }

    public List<CoOrganization> findOrganizationByUsername(String username){
        try {
            return usersDao.findOrganizationByUsername(username);
        }catch (Exception e){
            logger.error("No Result", e);
            return new ArrayList<>();
        }
    }
    public String findPasswordByUsername(String username){
        return usersDao.findPasswordByUsername(username);
    }

    public long count(Class<?> clazz, Date date){
        try {
            return usersDao.count(clazz,date);
        } catch (Exception e) {
            e.printStackTrace();
            return 0l;
        }
    }
}
