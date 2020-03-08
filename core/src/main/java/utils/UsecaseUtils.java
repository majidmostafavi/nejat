package utils;


import entity.CoUsecase;
import entity.CoUsecaseAction;
import enumeration.SubSystem;
import stateMachine.StateTypeSupport;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by majid on 12/6/16.
 */
public  class UsecaseUtils {

    private static final NejatCache <Long,Usecase> USECASE_FULL_CACHE = new NejatCache<>();
    private static final NejatCache <Usecase,CoUsecaseAction> USECASE_USECASE_ACTION = new NejatCache<>();



    public static void initialUsecaseCache(Long usecaseId , CoUsecase usecase) throws Exception {
        if (usecaseId !=null ){
            ArrayList<CoUsecaseAction> actions=new ArrayList<>();
            actions.addAll(usecase.getUsecaseActions());
        //    Usecase use = new Usecase(usecase.getId(),usecase.getSubSystem().getId(),usecase.getName(),usecase.getClazz(),usecase.getClass(),actions);
         //   USECASE_FULL_CACHE.put(usecase.getId(),use);
        }
    }

    public static Usecase getUsecase(Long usecaseId){
        if (USECASE_FULL_CACHE.containsKey(usecaseId)){
            return USECASE_FULL_CACHE.get(usecaseId);
        }else {
            return null;
        }
    }

    public static List<CoUsecase> findClassBySubSystem(SubSystem subSystem, List<CoUsecase> usecaseList){
        List<CoUsecase> usecases = usecaseList.stream().filter(usecase -> usecase.getSubSystem().getKey().equals(subSystem.getKey())).collect(Collectors.toList());
        return usecases;
    }

    public static Enumable[] findEnumration(CoUsecase usecase) {
        if (usecase.getClazz().isAnnotationPresent(StateTypeSupport.class)) {
                    StateTypeSupport typeSupport = (StateTypeSupport) usecase.getClazz().getAnnotation(StateTypeSupport.class);
                    Method method = findTypeMethod(usecase.getClazz(),typeSupport.stateType());
                    if (Enum.class.isAssignableFrom(method.getReturnType())){
                         Enumable[] enumrate = (Enumable[]) method.getReturnType().getEnumConstants();
                        return enumrate;
                    }
//            try {
//                Class<?> clazz = Class.forName(method.getReturnType().getCanonicalName());
//                Constructor<?> constructor = clazz.getConstructor(String.class);
//                try {
//                    Object object = constructor.newInstance();
//                } catch (InstantiationException e) {
//                    e.printStackTrace();
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (InvocationTargetException e) {
//                    e.printStackTrace();
//                }
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }catch (NoSuchMethodException e) {
//                e.printStackTrace();
//            }
        }
        return null;
    }
    private static Method findTypeMethod(Class<?> clazz, String methodName){
        try {
            return clazz.getMethod(methodName);
        } catch (Exception e) {
            System.out.println( "Type Method not Find");
        }
        Method[] methods= clazz.getMethods();
        for(Method currentMethod:methods){
            if( currentMethod.getName().matches("[get][\\w]*[T|t]ype[\\w]*")){
                return currentMethod;

            }
        }

        return null;
    }
}
