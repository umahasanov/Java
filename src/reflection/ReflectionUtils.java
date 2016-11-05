package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReflectionUtils {

    public static List<Object> printMethodInfo(Object o) {
        Class<?> clazz = o.getClass();
        List<Object> fields = new ArrayList<>();
        while (clazz != null) {
            Field[] declaredFields = clazz.getDeclaredFields();
            Collections.addAll(fields, declaredFields);
            clazz = clazz.getSuperclass();
        }
        return fields;

    }

    public static List<Object> getFields(Object o) {
        Class<?> clazz = o.getClass();
        List<Object> fields = new ArrayList<>();

        while (clazz != null) {
            for (Field f : clazz.getDeclaredFields()) {
                try {
                    f.setAccessible(true);
                    Object e = f.get(o);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("impossible", e);
                }
            }
            clazz = clazz.getSuperclass();
        }

        return fields;
    }

    public static List<Object> getGetterValue(Object o) {
        Class<?> clazz = o.getClass();
        List<Object> list = new ArrayList<>();

        while (clazz != null) {
            for (Method method : clazz.getDeclaredMethods()) {

                if (method.getName().startsWith("get")
                        && method.getParameterCount() == 0
                        && method.getReturnType() != void.class) {
                    method.setAccessible(true);
                    try {
                        Object meth = method.invoke(o);
                        list.add(meth);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }

                }

            }
            clazz = clazz.getSuperclass();
        }

        return list;
    }
}
