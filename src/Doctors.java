import java.time.LocalDate;

public class Doctors extends Personals implements Cures{
    public Doctors() {
        super();
    }

    public Doctors(String name, String profession, String day) {
        super(name, profession, day);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void cure() {

    }

    @Override
    public String getCure() {
        return "Проводит операции";
    }

    @Override
    public void toDo() {
        System.out.println(getName() + " может проводить операции");;
    }
}
