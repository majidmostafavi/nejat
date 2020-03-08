package cache;



import entity.CoPermission;
import entity.CoState;
import entity.CoStateAction;
import utils.ManagedBeanManager;

import java.util.*;


/**
 * Created by majid on 7/14/17.
 */
public class CacheQueryUtils {

/*
    public static List<CmOrganization> findOrganizations() {
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        QueryFactory queryFactory  = org.infinispan.query.Search.getQueryFactory(systemManager.getCache());
        Query query = queryFactory.from(CmOrganization.class).build();

        return  query.list();
    }
    public static List<CmOrganization> findOrganization() {
        try {
            SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
            QueryFactory queryFactory = Search.getQueryFactory(systemManager.getCache());
            Query query = queryFactory.from(CmOrganization.class).having("name").eq("William").toBuilder().build();
            List<CmOrganization> matches = query.list();
            return  matches;
        }catch (Exception e){
            e.printStackTrace();
        }

      return new ArrayList<>();
    }
*/

//    public static List<AcAccountLevel> finAccountLevels() {
//        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
//        QueryFactory queryFactory = Search.getQueryFactory(systemManager.getCache());
//        Query  query=  queryFactory.from(AcAccountLevel.class).build();
//        List<AcAccountLevel> accountLevels = query.list();
//        return accountLevels;
//    }
/*    public static List<CoState> findStateByObject (Object o){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        return (List<CoState>) systemManager.getCache().getAdvancedCache().get(o.getClass());
    }
    public static List<CoState> getStateByClass (Class<?> clazz){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        List<CoState> states = (List<CoState>) systemManager.getCache().get(clazz);
        return states;
    }
    public static void putStateByClass(Class<?> clazz, List<CoState> states){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        systemManager.getCache().put(clazz,states);
    }
    public static void putIndependentAccount (Map map , Object o){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        systemManager.getCache().put(map,o);
    }

    public static Object getIndependentAccount (Map map ){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        if (systemManager.getCache().containsKey(map)){
            return systemManager.getCache().get(map);
        }else {
            return null;
        }
    }
    public static List<CmIndependent> getIndependentList(CmIndependentAccount independentAccount){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        if (systemManager.getCache().containsKey(independentAccount)){
            return (List<CmIndependent>) systemManager.getCache().get(independentAccount);
        }else {
            return null;
        }
    }

    public static void getIndependentRelation(CmIndependentRelation independentRelation){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);

    }

    public static List<CoStateAction> findStateActionByPermission(CoPermission permission){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        if (systemManager.getCache().containsKey(permission)){
            return (List<CoStateAction>) systemManager.getCache().get(permission);
        }else {
            return new ArrayList<CoStateAction>(0);
        }
    }

    public static Set<CoStateAction> findStateActionByPermission(Set<CoPermission> permissions){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        LinkedHashMap l = (LinkedHashMap) systemManager.getCache().getAdvancedCache().getAll(permissions);
        Set<CoStateAction> stateActionSet = new HashSet<>();
        for (Object permission : l.values()){
           List<CoStateAction> list = (List<CoStateAction>) permission;
           list.forEach(stateActionSet::add);
        }

        return stateActionSet;
    }
    public static void putStateActionByPermission(CoPermission permission, List<CoStateAction> stateActions){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
        systemManager.getCache().put(permission,stateActions);


    }
    public  static List<CoPermission> fetchPermissionAsCache(){
        SystemManager systemManager = ManagedBeanManager.lookup(SystemManager.class);
         List<CoPermission> permissions = (List<CoPermission>) systemManager.getCache().getAdvancedCache().get(CoPermission.class);
         return permissions;
    }*/

}
