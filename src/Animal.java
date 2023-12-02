import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    private Illness illness;
    private String ownername;
    private LocalDate birthday;

    public Animal() {
    }

    public  Animal(String name, Illness illness, String ownername, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.ownername = ownername;
        this.birthday = birthday;
      }

    public abstract String getName();

    public void setName(String name){
        this.name = name;
    }

    public Illness getIllness() {
        return illness;
    }
    public  void toWakeUp(){
        System.out.println(getClass().getSimpleName()+" wake up");
    }
    private   void toWakeUp(String time){
        System.out.println(getClass().getSimpleName()+" wake up in " + time);
    }
    private   void eat(){
        System.out.println(getClass().getSimpleName()+" ate");
    }
    private void play(){
        System.out.println(getClass().getSimpleName()+" go to play");
    }
    private void sleep(){
        System.out.println(getClass().getSimpleName()+" go to sleep");
    }
    public void liveCircle(){
        toWakeUp();
        eat();
        play();
        sleep();
    }
    public void toGo(){
        System.out.println(getClass().getSimpleName() + " go very well");
    }
    public  void fly(){
        System.out.println(getClass().getSimpleName() + " fly");
    }
    public void swim(){
        System.out.println(getClass().getSimpleName() + " can swim");
    }

    @Override
    public String toString() { //переопределение метода toString для нормального возвращения
        return "Animal{" +
                "name='" + name + '\'' +
                ", illness=" + illness +
                ", ownername='" + ownername + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}




