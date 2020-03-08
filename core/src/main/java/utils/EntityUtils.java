package utils;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

/**
 * Created by majid on 7/16/16.
 */
public class EntityUtils {
    private static Map<String, Class<?>> classBySimpleName = new HashMap<String, Class<?>>();
    private static Collection<String> packages;
    public static Class findClass(String simpleName) {
        if (packages == null) {
            packages = getPackages();
        }

        List<Class> classList = new ArrayList<Class>();
        for (String pack : packages) {
            try {
                String name = pack + "." + simpleName;
                classList.add(Class.forName(name));
            } catch (Exception e) {
                // Ignore
            }
        }
        return !classList.isEmpty() ? classList.get(0) : null;
    }
    public static String findClassName(String simpleName) {
        if (packages == null) {
            packages = getPackages();
        }

        List<String> stringList = new ArrayList<String>();
        for (String pack : packages) {
            try {
                String name = pack + "." + simpleName;
                Class.forName(name);
                stringList.add(name);
            } catch (Exception e) {
                // Ignore
            }
        }
        return stringList.get(0);
    }
    public static Collection<String> getPackages() {
        Set<String> packages = new HashSet<String>();
        for (Package pack : Package.getPackages()) {
            packages.add(pack.getName());
        }
        return packages;
    }


    public static Long findIdValue(Object obj) {
        try {
            Class clazz = obj.getClass();
            for (Method method : clazz.getMethods()) {
                if (method.getAnnotation(Id.class) != null) {
                    return (Long) method.invoke(obj, null);
                }
            }
            for (Field field : clazz.getFields()) {
                if (field.getAnnotation(Id.class) != null) {
                    return (Long) field.get(obj);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        return null;
    }
    public static Long findIdValue(Object obj, Class clazz) {
        try {
//            Class clazz = obj.getClass();
            for (Method method : clazz.getMethods()) {
                if (method.getAnnotation(Id.class) != null) {
                    return (Long) method.invoke(obj, null);
                }
            }
            for (Field field : clazz.getFields()) {
                if (field.getAnnotation(Id.class) != null) {
                    return (Long) field.get(obj);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        return null;
    }
    public static Object findGeneric(Class clazz, Serializable id, EntityManager entityManager){
        return entityManager.find(clazz,id);
    }

    public static Class[] findAllClass(String packageName)  {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            assert classLoader != null;
            String path = packageName.replace('.', '/');
            Enumeration resources = classLoader.getResources(path);
            List<File> dirs = new ArrayList();
            while (resources.hasMoreElements()) {
                URL resource = (URL) resources.nextElement();
                dirs.add(new File(resource.getFile()));
            }
            ArrayList classes = new ArrayList();
            for (File directory : dirs) {
                classes.addAll(findClasses(directory, packageName));
            }
            return (Class[]) classes.toArray(new Class[classes.size()]);
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
      return new Class[0];
    }
    private static List findClasses(File directory, String packageName) throws ClassNotFoundException {
        List classes = new ArrayList();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }
}
