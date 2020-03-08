package stateMachine;


import entity.CoStateAction;
import entity.CoUsecase;
import utils.NejatCache;
import utils.Usecase;
import utils.UsecaseStateInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.List;


/**
 * Created by majid on 12/4/16.
 */
public class StateActionUtils {
    private static final Class<?>[] classes= new Class<?>[]{};
    protected static Logger logger = LoggerFactory.getLogger(StateActionUtils.classes.getClass().getName());
    private static final NejatCache<CoUsecase,UsecaseStateInformation> Co_USECASE_CO_STATE_ACTION = new NejatCache<CoUsecase,UsecaseStateInformation>();
    private static final NejatCache<Usecase,UsecaseStateInformation> USECASE_CO_STATE_ACTION = new NejatCache<Usecase,UsecaseStateInformation>();
    private static final NejatCache<Long,UsecaseStateInformation> USECASE_STATE_INFORMATION = new NejatCache<>();

    public static void initialUsecaseState(CoUsecase usecase , List<CoStateAction> stateActions){
        if (!Co_USECASE_CO_STATE_ACTION.containsKey(usecase)){
            if (usecase.getClazz().isAnnotationPresent(State.class)) {
                State usecaseState = usecase.getClass().getAnnotation(State.class);
                String stateMethod = usecaseState.stateMethod();

                Method method = findStatusMethod(usecase.getClass(),stateMethod);
                if (method !=null){
                    UsecaseStateInformation stateInformation = new UsecaseStateInformation(usecase.getClass(),usecase,stateActions);
                }
            }
        }
    }

    private static Method findStatusMethod(Class<?> clazz, String preferedName){
        try {
            return clazz.getMethod(preferedName, classes);
        } catch (Exception e) {

                logger.error("fail to find docStatus method with name :"+preferedName,e);
        }
        Method[]methods= clazz.getMethods();
        for(Method currentMethod:methods){
            if(Enum.class.isAssignableFrom(currentMethod.getReturnType())&&currentMethod.getName().matches("[get][\\w]*[S|s]tatus[\\w]*")){
                return currentMethod;
            }
        }
        return null;
    }
}
