package dao;

import entity.CoAction;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by majid on 12/3/16.
 */
@Stateless
@LocalBean
public class ActionDao extends AbstractDao<CoAction> {

    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public ActionDao() {
        super(CoAction.class);
    }


}
