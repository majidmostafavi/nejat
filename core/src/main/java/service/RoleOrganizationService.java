package service;

import entity.*;
import dao.RoleOrganizationDao;
import entity.dto.RoleOrganizationDTO;
import utils.exception.DuplicateDataException;
import utils.exception.RelationDataException;
import utils.exception.SaveRecordException;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by elnaz on 3/27/17.
 */
@Stateless
@LocalBean
public class RoleOrganizationService extends AbstractService  {

    @EJB
    RoleOrganizationDao roleOrganizationDao;

    public List<CoRoleOrganization> findAll(){
        try{
            return roleOrganizationDao.findAll();
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public boolean disableObject(CoRoleOrganization roleOrganization) throws Exception {
        return roleOrganizationDao.disableObject(roleOrganization);
    }

    public boolean enableObject(CoRoleOrganization roleOrganization) throws Exception {
        return roleOrganizationDao.enableObject(roleOrganization);
    }

    public CoRoleOrganization create(CoRoleOrganization roleOrganization) throws DuplicateDataException ,SaveRecordException {
        try {
            return roleOrganizationDao.create(roleOrganization);
        } catch (Exception e) {
            logger.error("Create Failed", e);
            return new CoRoleOrganization();
        }
    }

    public CoRoleOrganization edit(CoRoleOrganization roleOrganization)throws DuplicateDataException,RelationDataException,SaveRecordException{
        try {
            return roleOrganizationDao.edit(roleOrganization);
        }catch (Exception e) {
            logger.error("Edit Failed", e);
            return new CoRoleOrganization();
        }
    }

    public List<CoRole> findByRoleOrganization(CoRoleOrganization roleOrganization){
        try {
               return roleOrganizationDao.findByRoleOrganization(roleOrganization);
            }catch (NullPointerException e){
                return null;
            }catch (NoResultException e){
                return null;
            }
    }

    public void delete(CoRoleOrganization roleOrganization) throws RelationDataException{
        try {
            roleOrganizationDao.delete(roleOrganization);
        }catch (Exception e) {
            logger.error("Delete Failed", e);
        }
    }

    public List<CoRoleOrganization> findRoleOrganizationByRole(CoRole role){
        try {
            return roleOrganizationDao.findRoleOrganizationByRole(role);
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public Set<CoPerson> personnelByOrganizationAndPermission(CoOrganization organization, String permissionKey){
        try {
            Set<CoPerson> personnels = new HashSet<CoPerson>(roleOrganizationDao.personnelByOrganizationAndPermission(organization,permissionKey));
            return personnels;
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public List<String> findPersonnelEmailsByRole(CoRole role){
        try {
            return roleOrganizationDao.findPersonnelEmailsByRole(role);
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public List<String> findSupplierEmailsByRole(CoRole role){
        try {
            return roleOrganizationDao.findSupplierEmailsByRole(role);
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public List<String> findPersonnelMobilesByRole(CoRole role){
        try {
            return roleOrganizationDao.findPersonnelMobilesByRole(role);
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public List<String> findSupplierMobilesByRole(CoRole role){
        try {
            return roleOrganizationDao.findSupplierMobilesByRole(role);
        }catch (NullPointerException e){
            return null;
        }catch (NoResultException e){
            return null;
        }
    }

    public List<RoleOrganizationDTO> findRoleOrganizationByUserAndRoleAndPermission(CoOrganization organization,
                                                                                    CoRole role,
                                                                                    String userFirstName,
                                                                                    String userLastName,
                                                                                    String username,
                                                                                    String nationalCode,
                                                                                    CoPermission permission) {
        try {
            return roleOrganizationDao.findRoleOrganizationByUserAndRoleAndPermission(organization,role,userFirstName,userLastName,username,nationalCode,permission);
        }catch (NullPointerException e){
            return new ArrayList<>();
        }catch (NoResultException e){
            return null;
        }
    }

    public CoRoleOrganization findById(Long l){
        try {
            return roleOrganizationDao.findById(l);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<CoPerson> findPersonnelsByRolesAndOrganizations(List<CoRole> roleList, List<CoOrganization> organizationList){
        try {
            return roleOrganizationDao.findPersonnelsByRolesAndOrganizations(roleList,organizationList);
        }catch (NullPointerException e){
            return new ArrayList<>();
        }catch (NoResultException e){
            return null;
        }
    }
}

