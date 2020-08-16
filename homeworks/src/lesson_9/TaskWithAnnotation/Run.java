package lesson_9.TaskWithAnnotation;

import java.lang.reflect.InvocationTargetException;

public class Run {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Inspect.inspectService(MyService.class);
    }

}
