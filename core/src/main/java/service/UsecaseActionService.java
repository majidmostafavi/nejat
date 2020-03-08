package service;

import dao.UsecaseActionDao;
import entity.CoUsecaseAction;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 12/6/16.
 */
@Stateless
@LocalBean
public class UsecaseActionService extends AbstractService {

    @EJB
    UsecaseActionDao usecaseActionDao;

    public boolean canSave(CoUsecaseAction usecaseAction){
        return true;
    }

    public boolean canEditDelete(CoUsecaseAction usecaseAction){
        return true;
    }

    public List<CoUsecaseAction> findAll(){
        try {
            return usecaseActionDao.findAll();
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public void create(CoUsecaseAction usecaseAction){
        try {
            if (canSave(usecaseAction)) {
                usecaseActionDao.create(usecaseAction);
            }
        }catch (Exception e){
            logger.error("Create Failed" , e);
        }
    }

    public void edit(CoUsecaseAction usecaseAction){
        try {
            if (canEditDelete(usecaseAction)) {
                usecaseActionDao.edit(usecaseAction);
            }
        }catch (Exception e){
            logger.error("Edit Failed" , e);
        }
    }

    public void delete(CoUsecaseAction usecaseAction) {
        try {
            if (canEditDelete(usecaseAction))
                usecaseActionDao.delete(usecaseAction);
        }catch (Exception e){
            logger.error("Delete Failed" , e);
        }
    }
}
