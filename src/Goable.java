public interface Goable {
    public static final String type = "Goable";
    void run();
     default double getRunSpeed(){
         return 5.5;
     } //получение скорости животного
}
