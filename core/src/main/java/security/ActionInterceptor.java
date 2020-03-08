package security;

import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * Created by majid on 7/16/17.
 */
@Interceptor
@ActionPermission
public class ActionInterceptor  {

    public void canAction (InvocationContext context) throws Exception {
        String name = new String();
        name =context.getMethod().getName();
        System.out.print(name);
    }

}
