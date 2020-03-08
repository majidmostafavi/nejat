package dao;

import entity.CoPermission;
import entity.CoPermissionStateAction;
import entity.CoState;
import entity.CoStateAction;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

/**
 * Created by majid on 7/24/17.
 */
@Stateless
public class PermissionStateActionDao extends AbstractDao<CoPermissionStateAction> {

    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    PermissionStateActionDao() {
        super(CoPermissionStateAction.class);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public List<CoStateAction> findByPermission(Set<CoPermission> permissions){
        try {
            Query query = getEntityManager().createNamedQuery("findPermissionStateActionByPermissions");
            query.setParameter("permissions",permissions);
            return (List<CoStateAction>) query.getResultList();
        }catch (NoResultException e){
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }
    public List<CoStateAction> findByPermission(CoPermission permission){
        try {
            Query query = getEntityManager().createNamedQuery("findPermissionStateActionByPermission");
            query.setParameter("permission",permission);
            return (List<CoStateAction>) query.getResultList();
        }catch (NoResultException e){
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }
    public List<CoState> findStateByPermission(List<CoPermission> permissions){
        try {
            Query query = getEntityManager().createNamedQuery("findStateByPermission");
            query.setParameter("permissions",permissions);
            return (List<CoState>) query.getResultList();
        }catch (NoResultException e){
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }
}
