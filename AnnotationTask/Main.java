
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        complexAnnotation();
    }

    public static void complexAnnotation(){
        Class<ComplexAnnotationClass> object = ComplexAnnotationClass.class;
        Annotation[] annotations = object.getAnnotations();
        for (Annotation annotation : annotations){
            System.out.println(annotation);
        }
    }
}
