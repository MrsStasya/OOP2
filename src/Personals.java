import java.time.LocalDate;

public abstract class Personals {
    protected String name;
    protected String profession;
    protected String day;

    public Personals() {
    }

    public Personals(String name, String profession, String day) {
        this.name = name;
        this.profession = profession;
        this.day = day;
      }

    public abstract String getName();

    public void setName(String name){
        this.name = name;
    }

    public void toDo(){
        System.out.println(getClass().getSimpleName() + " проводят манипуляции");
    }


    @Override
    public String toString() { //переопределение метода toString для нормального возвращения
        return "Personal{" +
                "name ='" + name + '\'' +
                ", profession = " + profession +
                ", day = '" + day + '\'' +
                '}';
    }
}




