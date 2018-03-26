package CustomAnnotatedMethod;

public class AnnotationMethodClass {
    @AnnotationMethod(author = "Truextend", date = "2016-05-01", description = "this is a description for this mehod annotated")
    public String annotatedMethod(){
        return "HelloWorld";
    }

    @AnnotationMethod(author = "Truextend", date = "2016-04-06", description = "this is a description for this mehod annotated")
    public String annotatedMethodFromFriend(){
        return "Hello my friend";
    }
}
