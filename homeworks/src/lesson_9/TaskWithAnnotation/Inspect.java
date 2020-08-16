package lesson_9.TaskWithAnnotation;

import java.lang.reflect.*;

public class Inspect {
    public static void inspectService(Class<?> serviceClass) throws InvocationTargetException, IllegalAccessException {
        if (serviceClass.isAnnotationPresent(Version.class)) {
            Method[] allMethods = serviceClass.getDeclaredMethods();

            for (Method m : allMethods) {
                if (m.getName().equals("thisClassInfo")) {
                    m.setAccessible(true);
                    m.invoke(new MyService(23754,10000,
                            "Vasya Inc", "pants"), null);
                }
            }
        }
    }
}
