
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ComplexAnnotation {
    public SimpleAnnotation simpleAnnotation();
    int    id();
    String synopsis();
    String engineer();
    String date();
    String[] values() default "default values";
    Class<? extends Number> integers();
    Level value();
}
