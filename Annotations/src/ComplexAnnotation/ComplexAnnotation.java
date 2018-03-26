package ComplexAnnotation;

public @interface ComplexAnnotation {
    public SimpleAnnotation simpleAnnotation();
    int    id();        // Unique ID number associated with RFE
    String synopsis();  // Synopsis of RFE
    String engineer();  // Name of engineer who implemented RFE
    String date();      // Date RFE was implemented
    String[] values();
    Class<? extends Number> integers();
    enum Level { BAD, INDIFFERENT, GOOD }
    Level value();
}
