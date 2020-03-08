package utils;

import java.util.regex.Pattern;

/**
 * Created by majid on 12/20/16.
 */
public class ExceptionUtils {

    public static String isForeignKeyException(Throwable throwable) {
        if (Pattern.compile(Pattern.quote("foreign key constraint"), Pattern.CASE_INSENSITIVE).matcher(throwable.getMessage()).find()
                || Pattern.compile(Pattern.quote("integrity constraint"), Pattern.CASE_INSENSITIVE).matcher(throwable.getMessage()).find()) {
            int fkIndex = throwable.getMessage().toLowerCase().indexOf("fk_");
            int endIndex = throwable.getMessage().indexOf(')', fkIndex);
            if (endIndex < 0) {
                endIndex = throwable.getMessage().indexOf('"', fkIndex);
            }
            if (endIndex < 0) {
                endIndex = throwable.getMessage().indexOf('\'', fkIndex);
            }
            return throwable.getMessage().substring(fkIndex, endIndex).toUpperCase();
        } else {
            Throwable cause = throwable.getCause();
            if (cause == null) {
                return null;
            } else {
                return isForeignKeyException(cause);
            }
        }
    }
    public static String isUniqueException(Throwable throwable) {
        if (Pattern.compile(Pattern.quote("unique"), Pattern.CASE_INSENSITIVE).matcher(throwable.getMessage()).find()
                || Pattern.compile(Pattern.quote("duplicate"), Pattern.CASE_INSENSITIVE).matcher(throwable.getMessage()).find()) {
            int ukIndex = throwable.getMessage().toLowerCase().indexOf("uk_");
            int endIndex = throwable.getMessage().indexOf(')', ukIndex);
            if (endIndex < 0) {
                endIndex = throwable.getMessage().indexOf('"', ukIndex);
            }
            if (endIndex < 0) {
                endIndex = throwable.getMessage().indexOf('\'', ukIndex);
            }
            return throwable.getMessage().substring(ukIndex, endIndex).toUpperCase();
        } else {
            Throwable cause = throwable.getCause();
            if (cause == null) {
                return null;
            } else {
                return isUniqueException(cause);
            }
        }
    }
}
