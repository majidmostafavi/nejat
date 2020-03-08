package dao;


import entity.CoStateUsecaseAction;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by majid on 12/3/16.
 */
@Stateless
@LocalBean
public class StateUsecaseAction extends AbstractDao<CoStateUsecaseAction> {
    @PersistenceContext(unitName = "nejat")
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public StateUsecaseAction() {
        super(CoStateUsecaseAction.class);
    }
}
