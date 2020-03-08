package security;

import javax.ejb.Singleton;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Singleton
public class LoginManager implements Serializable {


    Map<String, Long> logHistory = new ConcurrentHashMap<String, Long>();

    private Integer loginCaptchaLessNumber=9;

    private Integer loginTotalNumber =3;

    public void invalidLogin(String username) {
        Long triedNumber = logHistory.get(username);
        if (triedNumber == null)
            triedNumber = 0l;
        triedNumber++;
        logHistory.put(username, triedNumber);
    }

    public boolean isLoginOverflowed(String username) {
        Long triedNumber = logHistory.get(username);
        if (triedNumber != null&&triedNumber>loginTotalNumber){
            return true;
        }
        return false;
    }

    public boolean isLoginRestricted(String username) {
        Long triedNumber = logHistory.get(username);
        if (triedNumber != null&&triedNumber>loginCaptchaLessNumber){
            return true;
        }
        return false;
    }

    public void removeHistory(String username) {
        logHistory.remove(username);
    }
}
