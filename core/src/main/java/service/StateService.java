package service;

import dao.StateDao;
import entity.CoState;
import utils.exception.DuplicateDataException;
import utils.exception.RelationDataException;
import utils.exception.SaveRecordException;

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
public class StateService extends AbstractService {

    @EJB
    StateDao stateDao;

    public List<CoState> findAll(){
        try {
            return stateDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>(0);
        }
    }

    public List<CoState> findByClass(Class clazz){
        return stateDao.findStateByClass(clazz);
    }

    public CoState findStartedStateByClass(Class clazz){
        try {
            return stateDao.findStartedStateByClass(clazz);
        }catch (Exception e){
            return new CoState();
        }
    }

    public CoState findDraftStateByClass(Class clazz){
        try {
            return stateDao.findDraftStateByClass(clazz);
        }catch (Exception e){
            return new CoState();
        }
    }

    public CoState findByClassAndKey(Class clazz, String key){
        try {
            return stateDao.findByClassAndKey(clazz, key);
        }catch (Exception e){
            return new CoState();
        }
    }

    public CoState findStateByClassAndStart(Class clazz){
        try {
            return stateDao.findStateByClassAndStart(clazz);
        }catch (Exception e){
            return new CoState();
        }
    }

    public CoState findEndedStateByClass(Class clazz){
        try{
            return stateDao.findEndStateByClass(clazz);
        }catch (Exception e){
            return new CoState();
        }
    }

    public CoState findAccountingStateByClass(Class clazz){
        try{
            return stateDao.findAccountingStateByClass(clazz);
        }catch (Exception e){
            return new CoState();
        }
    }

    public List<CoState> findStableStateByClass(Class clazz){
        try{
            return stateDao.findStableStateByClass(clazz);
        }catch (Exception e){
            return new ArrayList<CoState>();
        }
    }

    public CoState findAutoStateByClass(Class clazz){
        try{
            return stateDao.findAutoStateByClass(clazz);
        }catch (Exception e){
            return new CoState();
        }
    }

    public List<CoState> findRejectedStateByClass(Class clazz){
        try{
            return stateDao.findRejectedStateByClass(clazz);
        }catch (Exception e){
            return new ArrayList<>(0);
        }
    }

    public List<CoState> findStateByClassAndStableAndFinal(Class clazz, boolean stable, boolean ended){
        try{
            return stateDao.findStateByClassAndStableAndFinal(clazz,stable,ended);
        }catch (Exception e){
            return new ArrayList<>(0);
        }
    }

    public CoState findById(Long id){
        try {
            return stateDao.findById(id);
        }catch (Exception e){
            return new CoState();
        }
    }

    public void create(CoState state) throws DuplicateDataException,SaveRecordException {

        if (canSave(state)) {
            stateDao.create(state);
        }
    }

    public void edit(CoState state)  throws DuplicateDataException,RelationDataException,SaveRecordException{

        if (canEdit(state)) {
            stateDao.edit(state);
        }
    }

    public void delete(CoState state) throws RelationDataException {

        if (canDelete(state)) {
            stateDao.delete(state);
        }
    }

    public boolean canSave(CoState state) throws DuplicateDataException {

        long count = stateDao.countByKeyOrName(state);
        if (count == 0l) {
            return true;
        } else {
            throw new DuplicateDataException();
        }
    }

    public boolean canEdit(CoState state) throws RelationDataException , DuplicateDataException{

        boolean b=false;
        if( stateDao.countByKeyOrNameForEdit(state) == 0l){
            b=true;
        }else{
            throw new DuplicateDataException();
        }

        return b;
    }

    public boolean canDelete(CoState state) throws RelationDataException{
        boolean b=false;
    /*    if( stateDao.countState(state.getClazz(),state)){
            b=true;
        }else{
            throw new RelationDataException();
        }*/

        return b;
    }
}
