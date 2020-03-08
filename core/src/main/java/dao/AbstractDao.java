package dao;


import entity.BaseEntity;
import utils.TreeSupport;
import utils.exception.*;
import utils.ExceptionUtils;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by majidmostafavi on 8/20/15.
 */
public abstract class AbstractDao<T> implements Serializable {


    private Class<T> entityClass;

    public  AbstractDao(Class<T> entityClass){
        this.entityClass=entityClass;
    }

    /*Free Constractor*/
    public AbstractDao(){

    }

    public abstract EntityManager getEntityManager();


    public T create (T entity) throws DuplicateDataException ,SaveRecordException {
        try {

            if (entity instanceof TreeSupport) {
                ((TreeSupport) entity).setPathCode(((TreeSupport) entity).getParent() != null ?
                        ((TreeSupport) entity).getParent().getPathCode() + "#" + ((TreeSupport) entity).getCode() :
                        "#" + ((TreeSupport) entity).getCode());
            }

            getEntityManager().persist(entity);

            if (entity instanceof TreeSupport) {
                createPathId((TreeSupport) entity);
                if (((TreeSupport) entity).getParent()!=null) setLeaf((TreeSupport) entity);
            }

            return entity;

        }catch (Exception e){
            String uniqueException = ExceptionUtils.isUniqueException(e);
            if (uniqueException != null) {
                throw new DuplicateDataException(uniqueException);
            } else {
                e.printStackTrace();
                throw new SaveRecordException();
            }
        }
    }


    public T  createOrEdit (T entity) throws DuplicateDataException,RelationDataException,SaveRecordException {
        try {

            return getEntityManager().merge(entity);

        }catch (Exception e){
            String uniqueException = ExceptionUtils.isUniqueException(e);
            if (uniqueException != null) {
                throw new DuplicateDataException(uniqueException);
            } else {
                throw new SaveRecordException();
            }
        }
    }

    public <T extends BaseEntity>  T  edit (T entity) throws DuplicateDataException,RelationDataException,SaveRecordException {
            try {
                getEntityManager().merge(entity);
                return entity;
            }catch (Exception e){
                String uniqueException = ExceptionUtils.isUniqueException(e);
                if (uniqueException != null) {
                    throw new DuplicateDataException(uniqueException);
                } else {
                    throw new SaveRecordException();
                }
            }
    }

    public <T extends BaseEntity>  T  edit (T entity ,long l) throws DuplicateDataException,RelationDataException,SaveRecordException, PersonnelDataException {
        if (entity.getCreatedBy()==(l) ) {
            try {
                getEntityManager().merge(entity);
                return entity;
            }catch (Exception e){
                String uniqueException = ExceptionUtils.isUniqueException(e);
                if (uniqueException != null) {
                    throw new DuplicateDataException(uniqueException);
                } else {
                    throw new SaveRecordException();
                }
             }
        }else {
            throw new PersonnelDataException();
        }
    }

    public <T> boolean  delete (T entity) throws ForeignKeyException,RelationDataException {

            try {
                getEntityManager().remove(getEntityManager().merge(entity));
                return true;
            } catch (Exception e) {
                String foreignKeyException = ExceptionUtils.isForeignKeyException(e);
                if (foreignKeyException != null) {
                    throw new ForeignKeyException(foreignKeyException);
                } else {
                    throw new RelationDataException();
                }
            }

    }

    public <T extends BaseEntity> boolean  delete (T entity,long l) throws ForeignKeyException,RelationDataException, PersonnelDataException {
        if (entity.getCreatedBy()==(l) ) {
            try {
                getEntityManager().remove(getEntityManager().merge(entity));
                return true;
            } catch (Exception e) {
                String foreignKeyException = ExceptionUtils.isForeignKeyException(e);
                if (foreignKeyException != null) {
                    throw new ForeignKeyException(foreignKeyException);
                } else {
                    throw new RelationDataException();
                }
            }
        }else {
            throw new PersonnelDataException();
        }
    }

    public T refresh (T entiry){
        getEntityManager().refresh(entiry);

        return entiry;
    }

    public void flush(){
        getEntityManager().flush();

    }

    public void detach(T entity){
        getEntityManager().detach(entity);
    }

    public void clear(){
        getEntityManager().clear();
    }

    public void lock(T object, LockModeType lockType){
        getEntityManager().lock(object,lockType);
    }

    public T findById (Object id){
        return getEntityManager().find(entityClass,id);
    }


    public List<T> findAll() throws Exception {
        try {
            CriteriaQuery criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(entityClass));
            Query query = getEntityManager().createQuery(criteriaQuery);
            return query.getResultList();
        }catch (NoResultException e){
            return new ArrayList<T>(0);
        }catch (NullPointerException e){
            e.printStackTrace();
            return new ArrayList<T>(0);
        }
    }

    public Object findGeneric(Class clazz, Serializable id){
        return getEntityManager().find(clazz,id);
    }

    public <T extends BaseEntity> boolean enableObject(T t) throws Exception {
        try {
            t.setActive(true);
            getEntityManager().merge(t);
            return true;
        }catch (Exception e){
            e.printStackTrace();
           throw  new Exception("Can not Enable Object");
        }
    }
    public <T extends BaseEntity> boolean disableObject(T t) throws Exception {
        try {
            t.setActive(false);
            getEntityManager().merge(t);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            throw  new Exception("Can not Disable Object");
        }
    }

//    public static <T> T initializeAndUnproxy(T entity){
//        if (entity == null){
//            throw new
//                    NullPointerException("EntityPassed for initialization is Null");
//        }
//        Hibernate.initialize(entity);
//        if (entity instanceof HibernateProxy){
//            entity.getClass();
//            entity = (T) ((HibernateProxy) entity).getHibernateLazyInitializer().getImplementation();
//        }
//        return entity;
//    }


//    public boolean gotoNext(Class<?> clazz, Long id, CoState state){
//        try {
//
//            String table = clazz.getAnnotation(Table.class).name();
//            String stateColumn = StateMachineUtils.findStateMethodLong(clazz, "").getAnnotation(Column.class).name() == null ?
//                    StateMachineUtils.findStateMethod(clazz, clazz.getAnnotation(State.class).stateMethod()).getAnnotation(JoinColumn.class).name() :
//                    StateMachineUtils.findStateMethodLong(clazz, "").getAnnotation(Column.class).name();
//            StringBuffer s = new StringBuffer();
//            s.append("update" + " ");
//            s.append(table);
//            s.append(" ");
//            s.append("set" + " ");
//            s.append(stateColumn);
//            s.append("=");
//            s.append(state.getId());
//            s.append(" ");
//            s.append("where" + " ");
//            s.append("id=");
//            s.append(id);
//
//            Query q = getEntityManager().createNativeQuery(s.toString());
//            q.executeUpdate();
//            return true;
//        }catch (Exception e){
//           e.printStackTrace();
//           return false;
//        }
//    }

    private  <T extends TreeSupport> void createPathId(T t){

        t.setPathId(t.getParent()!=null ? t.getParent().getPathId()+ "#"+ t.getCode() : "#" + String.valueOf(t.getId()) );

        String table = t.getClass().getAnnotation(Table.class).name();

        StringBuffer s = new StringBuffer();
        s.append("update" + " ");
        s.append(table);
        s.append(" ");
        s.append("set" + " ");
        s.append("PATH_ID");
        s.append("=");
        s.append("'"+t.getPathId()+"'");
        s.append(" ");
        s.append("where" + " ");
        s.append("id=");
        s.append(t.getId());

        Query q = getEntityManager().createNativeQuery(s.toString());
        q.executeUpdate();
    }

    private <T extends  TreeSupport> void setLeaf(T t){
        String table = t.getClass().getAnnotation(Table.class).name();
        t = (T) t.getParent();
        t.setLeaf(false);
        StringBuffer s = new StringBuffer();
        s.append("update" + " ");
        s.append(table);
        s.append(" ");
        s.append("set" + " ");
        s.append("LEAF");
        s.append("=");
        s.append("0"); //for False
        s.append(" ");
        s.append("where" + " ");
        s.append("id=");
        s.append(t.getId());
    }

    private <T extends  TreeSupport> void getLeaf(T t){
        if (t.getParent()!=null&&t.getChildren()!=null && t.getParent().getChildren().size()==0)
            t.setLeaf(true);
    }

    public  long count(Class<?> clazz, Date date) throws Exception {

        try {
            String table = clazz.getAnnotation(Table.class).name();
            StringBuffer s = new StringBuffer();
            s.append("select count(*) from ");
            s.append(table);
            s.append(" ");
            s.append("where" + " ");
            s.append("created>=:date");
            Query q = getEntityManager().createNativeQuery(s.toString());
            q.setParameter("date",date);
            return (long)q.getSingleResult();
        }catch (Exception e){
            return 0l;
        }

    }

}
