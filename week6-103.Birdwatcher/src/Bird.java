public class Bird {
    private String name;
    private String latinName;
    private int amountOfObservations;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.amountOfObservations = 0;
    }

    public void incrementObservation(){
        this.amountOfObservations++;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getAmountOfObservations() {
        return amountOfObservations;
    }
}
