package service;

import dao.PermissionStateActionDao;
import entity.CoPermission;
import entity.CoState;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by majid on 7/24/17.
 */
@Stateless
@LocalBean
public class PermissionStateActionService extends AbstractService{

    @EJB
    PermissionStateActionDao permissionStateActionDao;

    public List<CoState> findStateByPermission(List<CoPermission> permissions){
        return permissionStateActionDao.findStateByPermission(permissions);
    }
}
