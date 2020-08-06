package lesson_9.TaskWithAnnotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Version{
    double versionNumber();
    String codeName() default "Simple version";
}
