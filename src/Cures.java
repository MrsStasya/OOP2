public interface Cures {
    public static final String type = "Cure";
    void cure();
     default String getCure(){return "Проводит операции";
     }

}
