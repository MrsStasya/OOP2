import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>(); //Список пациентов. Состояние
    public  List<Animal> getPatients(){ //повиденеи.Метод для получения списка пациентов.
        // List<Animal> - возвращаемые параметры, т.е. список пациентов животных

        return patients;
    }
   // public void addPatient(Animal patient){
    //    patients.add(patient);
    //}
    public VeterinaryClinic addPatient(Animal patient){ //поведение. Добавляем пациентов
        patients.add(patient); //обращаемся к списку пациентов. Добавляем
        return this;
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    } //удаляем пациента из списка
    public List<Goable> getGoable(){ //получать только тех пациентов, которые могут ходить
        List<Goable> result = new ArrayList<>(); //создаем список с результатом ходящих
        for (Animal animal:patients){ //проходим по списку животных по массиву пациентов
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable(){ //получать только тех пациентов, которые могут летать
        List<Flyable> result = new ArrayList<>(); //создаем список с результатом ходящих
        for (Animal animal:patients){ //проходим по списку животных по массиву пациентов
            if (animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable(){ //получать только тех пациентов, которые могут плавать
        List<Swimable> result = new ArrayList<>(); //создаем список с результатом ходящих
        for (Animal animal:patients){ //проходим по списку животных по массиву пациентов
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    private List<Personals> personals = new ArrayList<>(); //Список персонала
    public  List<Personals> getPersonal(){ //Метод для получения списка персонала.
        return personals;
    }

    public VeterinaryClinic addPersonal(Personals personal){ //Добавляем персонал
        personals.add(personal); //обращаемся к списку персонала. Добавляем
        return this;
    }
    public void removePersonal(Animal patient){
        patients.remove(patient);
    } //удаляем персонал из списка
    public List<Cures> getCure(){ //получать только тот персонал, который может лечить(врачи)
        List<Cures> result = new ArrayList<>(); //создаем список с результатом лечащих
        for (Personals personal:personals){ //проходим по списку животных по массиву пациентов
            if (personal instanceof Cures){
                result.add((Cures) personal);
            }
        }
        return result;
    }

    public List<NonCures> getNonCure(){ //получать только тот персонал, который неможет лечить(медсестры)
        List<NonCures> result = new ArrayList<>(); //создаем список с результатом лечащих
        for (Personals personal:personals){ //проходим по списку животных по массиву пациентов
            if (personal instanceof NonCures){
                result.add((NonCures) personal);
            }
        }
        return result;
    }

}
