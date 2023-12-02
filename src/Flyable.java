public interface Flyable {
    public static final String type = "Flyable";
    void fly();

    default double getFlySpeed () {
        return 4;
    }
}
