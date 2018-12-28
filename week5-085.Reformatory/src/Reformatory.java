public class Reformatory {

    private int countMeasurements = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.countMeasurements++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int currentWeight =  person.getWeight();
        person.setWeight(currentWeight + 1);
    }

    public int totalWeightsMeasured(){
        return this.countMeasurements;
    }

}
