import java.time.LocalDate;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat(); //новая кошка
        cat.setName("Barsic"); //присвоили кличку кошке
        //System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"),"petr", LocalDate.of(3,12,21)); //новая собачка+все данные по ней
        //System.out.println(dog.getName());
        //System.out.println(dog.getIllness());
        Duck duck = new Duck("Busik",new Chumka("breake leg"),"Vasiliy", LocalDate.of(3,12,21));//новая утка+все данные по ней
        Fish fish = new Fish("FishFish",new Chumka("don't speak"),"Natali", LocalDate.of(3,12,21));//новая рыбка+все данные по ней
        //dog.getIllness().heal();
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(duck);
//        animals.add(fish);
//        cat.liveCircle();
//        cat.toGo();
//        duck.fly();
//        fish.fly();
        VeterinaryClinic clinic = new VeterinaryClinic(); //создаем вет.клинику
        Doctors doctor = new Doctors("Иванов Иван Петрович", "ветеринар", "понедельник и пятница"); //доктора добавляем
        Doctors doctor2 = new Doctors("Петров Петр Иванович", "ветеринар", "вторник и среда"); //доктора2 добавляем
        Nurse nurse = new Nurse("Сатинова Зухра Батьковна", "медсестра", "понедельник"); //медсестру добавляем
        Nurse nurse2 = new Nurse("Бухарова Ирина Павловна", "медсестра", "пятница"); //медсестру2 добавляем
        clinic.addPatient(cat).addPatient(dog).addPatient(duck).addPatient(fish).addPersonal(doctor).addPersonal(doctor2).addPersonal(nurse).addPersonal(nurse2); //добавляем все в клинику:персонал, пациентов
        System.out.println("Весь персонал клиники: " + clinic.getPersonal());
        System.out.println("Только врачи клиники: " + clinic.getCure());
        System.out.println("Только медсестры клиники: " + clinic.getNonCure());
        System.out.println("Только летающие пациенты клиники: " + clinic.getFlyable());
        System.out.println("Только плавающие пациенты клиники: " + clinic.getSwimable());
        System.out.println("Только бегающие пациенты клиники: " + clinic.getGoable());
        System.out.println("Все пациенты клиники: " +clinic.getPatients());

        doctor.toDo();
        nurse2.toDo();
        System.out.println(dog.getName() + " " + dog.getRunSpeed()); //получаем скорость собакии
        System.out.println(cat.getName() + " " + cat.getRunSpeed()); //получаем скорость кошки
        System.out.println(duck.getName() + " " + duck.getRunSpeed()); //получаем скорость утки(переопределение метода, утка не может бегать со скоростью собаки и кошки)
        System.out.println(duck.getName() + " " + duck.getSwimSpeed()); //получаем скорость при плаванье утки
        System.out.println(fish.getName() + " " + fish.getSwimSpeed()); //получаем скорость при плаванье рыбки
        System.out.println(fish.getName() + " " + fish.getFlySpeed()); //мне просто лень делать еще один класс, поэтому рыба у меня летает. Я честно поняла про переопределение, наследование и интерфейсы










    }
}
