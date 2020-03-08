package service;

import dao.StateActionDao;
import entity.CoStateAction;
import utils.exception.DuplicateDataException;
import utils.exception.RelationDataException;
import utils.exception.SaveRecordException;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majidmostafavi on 12/5/16.
 */
@Stateless
@LocalBean
public class StateActionService extends AbstractService {

    @EJB
    StateActionDao stateActionDao;

    public List<CoStateAction> findAll(){
        try {
            return stateActionDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public List<CoStateAction> findByClass(Class clazz){
        return stateActionDao.findStateActionByClass(clazz);
    }

    public void create(CoStateAction stateAction) throws DuplicateDataException,SaveRecordException {

        if (canSave(stateAction)) {
            stateActionDao.create(stateAction);
        }
    }

    public void edit(CoStateAction stateAction)  throws DuplicateDataException,RelationDataException,SaveRecordException{

        if (canEdit(stateAction)) {
            stateActionDao.edit(stateAction);
        }
    }

    public void delete(CoStateAction stateAction) throws RelationDataException {

        if (canDelete(stateAction)) {
            stateActionDao.delete(stateAction);
        }
    }

    public boolean canSave(CoStateAction stateAction) throws DuplicateDataException {

        long count = stateActionDao.countByNameAndFromAndToState(stateAction);
        if (count == 0l) {
            return true;
        } else {
            throw new DuplicateDataException();
        }
    }

    public boolean canEdit(CoStateAction stateAction) throws RelationDataException , DuplicateDataException{

        boolean b=false;
        if( stateActionDao.countByNameAndFromAndToStateForEdit(stateAction) == 0l){
            b=true;
        }else{
            throw new DuplicateDataException();
        }

        return b;
    }

    public boolean canDelete(CoStateAction stateAction) throws RelationDataException{

        return true;
    }
}
