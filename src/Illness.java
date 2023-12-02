public class Illness {
    public Illness(String illnessName) {
        this.illnessName = illnessName;
    }

    public String illnessName;

    public void heal(){
        System.out.println("Drink water with paracetamol");
    }

    @Override
    public String toString() {
        return illnessName;
    }
}
