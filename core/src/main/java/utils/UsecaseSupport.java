package utils;

import enumeration.SubSystem;
import enumeration.UsecaseType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by majid on 5/20/17.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface UsecaseSupport {
    UsecaseType usecaseType();
    SubSystem subSystem();
}
