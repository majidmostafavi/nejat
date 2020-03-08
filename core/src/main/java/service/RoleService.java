package service;

import dao.RoleDao;
import dao.RoleOrganizationDao;
import entity.CoOrganization;
import entity.CoPermission;
import entity.CoRole;
import enumeration.AccessTypeEnum;
import utils.exception.DuplicateDataException;
import utils.exception.RelationDataException;
import utils.exception.SaveRecordException;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 6/29/16.
 */
@Stateless
@LocalBean
public class RoleService extends AbstractService {

    @EJB
    RoleDao roleDao;
    @EJB
    RoleOrganizationDao roleOrganizationDao;

    public List<CoRole> findAllRole(){
        try{
            return roleDao.findAll();
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public List<CoRole> findAllActiveRole(){
        try{
            return roleDao.findAllActiveRole();
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public List<CoRole> findAllActiveRoleByAccessType(AccessTypeEnum accessTypeEnum){
        try{
            return roleDao.findAllActiveRoleByAccessType(accessTypeEnum);
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public List<CoRole> searchByTitleAndAccessTypeEnumAndActive(String roleTitle, AccessTypeEnum accessTypeEnum, boolean active){
        try{
            return roleDao.searchByTitleAndAccessTypeEnumAndActive(roleTitle,accessTypeEnum,active);
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public CoRole findByTitle(String title){
        try {
            return roleDao.findByTitle(title);
        }catch (NullPointerException e){
            return  new CoRole();
        }
    }

    public CoRole findById(Long id){
        try {
            return roleDao.findById(id);
        }catch (NullPointerException e){
            return new CoRole();
        }
    }

    public void editRole(CoRole role)throws RelationDataException,DuplicateDataException ,SaveRecordException{
        if (canEdit(role)){
            roleDao.edit(role);
        }
    }

    public void createRole(CoRole role) throws DuplicateDataException,SaveRecordException {
        if (canSave(role)){
            roleDao.create(role);
        }
    }

    public boolean canSave(CoRole role) throws DuplicateDataException{
        if (roleDao.countRoleByName(role)==0l){
            return true;
        }
        else {
            throw new DuplicateDataException();
        }
    }

    public boolean canEdit(CoRole role) throws DuplicateDataException{
        if (roleDao.countRoleByNameEdit(role)==0l){
            return true;
        }
        else {
            throw new DuplicateDataException();
        }
    }

  /*  public boolean delete(CoRole role) throws RelationDataException, DuplicateDataException, SaveRecordException{
        if (roleOrganizationDao.countRoleOrganizationByRoleExceptUser(role,SessionManager.getUsername()) > 0){
            role.setActive(false);
            roleDao.edit(role);
            return false;
        } else {
            if (role.getCreatedBy().equals(SessionManager.getPersonnel().getId())){
                roleDao.delete(role);
                return true;
            }
        }
        return false;
    }*/

    public List<CoRole> findRoleByUser(String users, CoOrganization organization){
        try {
            return roleDao.findAll(users,organization);
        }catch (Exception e) {
            logger.error("Delete Failed", e);
            return new ArrayList<>(0);
        }
    }

    public List<CoRole> findRoleByPermission(CoPermission permission){
        try{
            return roleDao.findByPermission(permission);
        }catch (Exception e){
            logger.error("Not Find Failed", e);
            return new ArrayList<>(0);
        }
    }

    public List<CoPermission> findPermissionByRole(CoRole role){
        try {
            return roleDao.findPermissionsByRole(role);
        }catch (Exception e){
            logger.error("Not Find Failed", e);
            return new ArrayList<>(0);
        }
    }

    public List<CoPermission> findPermissionByRole(List<CoRole> roles){
        try {
            return roleDao.findPermissionsByRole(roles);
        }catch (Exception e){
            logger.error("Not Find Failed", e);
            return new ArrayList<>(0);
        }
    }

}