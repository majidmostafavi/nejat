package service;

import dao.UsecaseDao;
import entity.CoUsecase;
import enumeration.SubSystem;
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
public class UsecaseService extends AbstractService {

    @EJB
    UsecaseDao usecaseDao;

    public List<CoUsecase> findAll(){
        try {
            return usecaseDao.findAll();
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

/*    public List<CmIndependentAccount> findIndependentAccountsWithUseCase(Class clazz){
        try {
            return usecaseDao.findIndependentAccountsWithBudgetUseCase(clazz);
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<CmIndependentAccount>(0);
        }
    }*/

    public CoUsecase findUsecaseByClass(Class clazz){
        try {
            return usecaseDao.findByClass(clazz);
        }catch (Exception e){
            logger.error("No Result" , e);
            return new CoUsecase();
        }
    }

    public List<CoUsecase> findUsecaseBySubSystem(SubSystem subSystemEnum){
        try {
            return usecaseDao.findUsecaseBySubSystem(subSystemEnum);
        }catch (Exception e){
            logger.error("No Result" , e);
            return new ArrayList<>(0);
        }
    }

    public boolean canSave(CoUsecase usecase) throws DuplicateDataException{
        if (usecaseDao.countByNameOrClazz(usecase)==0l)
            return true;
        else {
            throw new DuplicateDataException();
        }
    }

    public boolean canEdit(CoUsecase usecase) throws DuplicateDataException,RelationDataException,SaveRecordException{
        boolean b = false;
        if(usecaseDao.countByNameOrClazzForEdit(usecase) == 0l){
            b=true;
        }else {
            throw new DuplicateDataException();
        }

        return b;
    }

    public boolean canDelete(CoUsecase usecase) throws RelationDataException{
        return true;
    }

    public void create(CoUsecase usecase) throws DuplicateDataException,SaveRecordException {
            if (canSave(usecase)) {
                usecaseDao.create(usecase);
            }
    }

    public void edit(CoUsecase usecase) throws DuplicateDataException,RelationDataException ,SaveRecordException{
            if (canEdit(usecase)) {
                usecaseDao.edit(usecase);
            }
    }

    public void delete(CoUsecase usecase) throws RelationDataException {
            if (canDelete(usecase))
                usecaseDao.delete(usecase);
    }


}
