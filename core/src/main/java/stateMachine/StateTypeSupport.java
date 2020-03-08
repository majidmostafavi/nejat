package stateMachine;



import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by majid on 5/29/17.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface StateTypeSupport {
    String stateType() default "getType";
}
