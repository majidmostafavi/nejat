package service;

import entity.*;
import dao.PermissionDao;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 6/29/16.
 */
@Stateless
@LocalBean
public class PermissionService extends AbstractService {

    @EJB
    PermissionDao permissionDao;

    public List<CoPermission> findAll(){
        try {
            return permissionDao.findAll();
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }
    public List<CoPermission> findAllPermissionNotInCategory(){
        try {
            return permissionDao.findAllPermissionNotInCategory();
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public CoPermission findPermissionByKey(String key){
        try {
            return permissionDao.findByKey(key);
        }catch (NoResultException ex) {
            return null;
        } catch (NonUniqueResultException ex) {
            return null;
        }catch (NullPointerException ex){
            return null;
        }
    }

    public List<CoPermission> findPermissionsByPermissionCategory(CoPermissionCategory permissionCategory){
        try {
            return permissionDao.findPermissionsByPermissionCategory(permissionCategory);
        }catch (NoResultException | NullPointerException e){
            return new ArrayList<>(0);
        }

    }

    public List<CoPermission> findPermissionByCategory(CoRoleOrganization roleOrganization, CoPermissionCategory permissionCategory){
        try {
            return permissionDao.findPermissionByCategory(roleOrganization,permissionCategory);
        }catch (NoResultException | NullPointerException e){
            return new ArrayList<>(0);
        }
    }

    public List<CoPermission> findPermissionByUser(CoUsers users, CoOrganization organization){
        try {
            return permissionDao.findPermissionsByUsername(users.getUserName(),organization);
        }catch (NoResultException | NullPointerException e){
            return new ArrayList<>(0);
        }
    }
    public List<CoPermission> findPermissionRoleOrganization(CoRoleOrganization roleOrganization){
        try {
            return permissionDao.findPermissionByRoleOrganization(roleOrganization);
        }catch (NoResultException | NullPointerException e){
            return new ArrayList<>(0);
        }
    }

}