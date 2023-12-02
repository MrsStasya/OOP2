import java.time.LocalDate;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsic");
        //System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"),"petr", LocalDate.of(3,12,21));
        //System.out.println(dog.getName());
        //System.out.println(dog.getIllness());
        Duck duck = new Duck("Busik",new Chumka("breake leg"),"Vasiliy", LocalDate.of(3,12,21));
        Fish fish = new Fish("FishFish",new Chumka("don't speak"),"Natali", LocalDate.of(3,12,21));
        dog.getIllness().heal();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(duck);
        animals.add(fish);
        cat.liveCircle();
        cat.toGo();
        duck.fly();
        fish.fly();
        VeterinaryClinic clinic = new VeterinaryClinic(); //создаем вет.клинику
        clinic.addPatient(cat).addPatient(dog).addPatient(duck); //добавляем пациента.
        Doctors doctor = new Doctors("Иванов Иван Петрович", "ветеринар", "понедельник и пятница");
        Doctors doctor2 = new Doctors("Петров Петр Иванович", "ветеринар", "вторник и среда");
        Nurse nurse = new Nurse("Сатинова Зухра Батьковна", "медсестра", "понедельник");
        Nurse nurse2 = new Nurse("Бухарова Ирина Павловна", "медсестра", "пятница");
        clinic.addPatient(cat).addPatient(dog).addPatient(duck).addPatient(fish).addPersonal(doctor).addPersonal(doctor2).addPersonal(nurse).addPersonal(nurse2); //добавляем пациента.
        System.out.println("Весь персонал клиники: " + clinic.getPersonal());
        System.out.println("Только врачи клиники: " + clinic.getCure());
        System.out.println("Только медсестры клиники: " + clinic.getNonCure());
        System.out.println("Только летающие пациенты клиники: " + clinic.getFlyable());
        System.out.println("Только плавающие пациенты клиники: " + clinic.getSwimable());
        System.out.println("Только бегающие пациенты клиники: " + clinic.getGoable());
        System.out.println("Все пациенты клиники: " +clinic.getPatients());

        doctor.toDo();
        nurse2.toDo();
        System.out.println(dog.getName() + " " + dog.getRunSpeed());
        System.out.println(cat.getName() + " " + cat.getRunSpeed());
        System.out.println(duck.getName() + " " + duck.getRunSpeed());
        System.out.println(duck.getName() + " " + duck.getSwimSpeed());
        System.out.println(fish.getName() + " " + fish.getSwimSpeed());
        System.out.println(fish.getName() + " " + fish.getFlySpeed()); //мне просто лень делать еще один класс. Я честно поняла про переопределение, наследование и интерфейсы










    }
}
