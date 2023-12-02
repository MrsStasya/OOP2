import java.time.LocalDate;

public class Dog extends Animal implements Goable{
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("do not make it up");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }
}
