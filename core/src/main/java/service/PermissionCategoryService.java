package service;

import dao.PermissionCategoryDao;
import dao.PermissionDao;
import entity.CoPermissionCategory;
import utils.exception.DuplicateDataException;
import utils.exception.RelationDataException;
import utils.exception.SaveRecordException;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 6/29/16.
 */
@Stateless
@LocalBean
public class PermissionCategoryService extends AbstractService{

    @EJB
    PermissionCategoryDao permissionCategoryDao;
    @EJB
    PermissionDao permissionDao;


    public void create(CoPermissionCategory permissionCategory) throws DuplicateDataException, RelationDataException ,SaveRecordException{
        if (canSave(permissionCategory)) {
            permissionCategoryDao.createOrEdit(permissionCategory);
        }
    }

    public void edit(CoPermissionCategory permissionCategory) throws DuplicateDataException,RelationDataException,SaveRecordException {
        if (canEdit(permissionCategory)) {
            permissionCategoryDao.edit(permissionCategory);
        }
    }

    public void delete(CoPermissionCategory permissionCategory) throws RelationDataException {
        if (canDelete(permissionCategory)) {
            permissionCategoryDao.delete(permissionCategory);
        } else {
            throw new RelationDataException();
        }
    }

    public boolean canSave(CoPermissionCategory permissionCategory) throws DuplicateDataException{
        if (permissionCategoryDao.countByNameOrCode(permissionCategory)==0l) {
            return true;
        } else {
            throw new DuplicateDataException();
        }
    }

    private boolean canEdit(CoPermissionCategory permissionCategory) throws RelationDataException,DuplicateDataException{
        if(permissionCategoryDao.countByNameOrCodeForEdit(permissionCategory) == 0l){
            return true;
        }else {
            throw new DuplicateDataException();
        }
    }

    private boolean canDelete(CoPermissionCategory permissionCategory) throws RelationDataException {
        if(permissionDao.countPermissionsByPermissionCategory(permissionCategory) == 0l){
            return true;
        }else {
            throw new RelationDataException();
        }
    }

    public CoPermissionCategory findPermissionCategoryByName(String name){
        try {
            return permissionCategoryDao.findByName(name);
        }catch (NoResultException ex) {
            return null;
        }catch (NullPointerException ex) {
            return null;
        }
    }

    public CoPermissionCategory findPermissionCategoryByCode(Long code){
        try {
            return permissionCategoryDao.findByCode(code);
        }catch (NoResultException ex) {
            return null;
        }catch (NullPointerException ex) {
            return null;
        }
    }

    public List<CoPermissionCategory> findAll(){
        try{
            return permissionCategoryDao.findAll();
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }
}
