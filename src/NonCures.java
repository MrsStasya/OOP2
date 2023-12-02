public interface NonCures {
    public static final String type = "NonCure";
    void nonCure();
     default String getNonCure(){return "Младший персонал";
     }
}
