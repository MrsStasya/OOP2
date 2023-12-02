public class Nurse extends Personals implements NonCures{
    public Nurse() {super();}

       public Nurse(String name, String profession, String day) {
        super(name, profession, day);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void nonCure() {

    }

    @Override
    public String getNonCure() {
        return "Это неврачи";
    }

    @Override
    public void toDo() {
        System.out.println(getName() + " поставит укол");
    }
}

