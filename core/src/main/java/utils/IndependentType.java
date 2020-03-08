package utils;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by shaghayegh on 8/2/17.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface IndependentType {
    String independentType();
}
