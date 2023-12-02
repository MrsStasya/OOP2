import java.time.LocalDate;

public class Duck extends Animal implements Swimable, Goable {
    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {

    }

    @Override
    public double getRunSpeed() {
        return 1.5;
    }
}
