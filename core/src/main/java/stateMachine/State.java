package stateMachine;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by majid on 11/30/16.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface State {
    String stateMethod() default "getState";
}
