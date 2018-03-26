package ComplexAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationEnumTypes {
    @interface Quality {
        enum Level { BAD, INDIFFERENT, GOOD }
        Level value();
    }
}