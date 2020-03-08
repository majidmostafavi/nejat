package dao;

import entity.CoUsecaseAction;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by majid on 12/3/16.
 */
@Stateless
@LocalBean
public class UsecaseActionDao  extends AbstractDao<CoUsecaseAction>{

    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public UsecaseActionDao() {
        super(CoUsecaseAction.class);
    }

}
