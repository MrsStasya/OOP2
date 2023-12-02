import java.time.LocalDate;

public class Fish extends Animal implements Flyable, Swimable{
    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

 }
