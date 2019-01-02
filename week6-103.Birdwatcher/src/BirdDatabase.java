import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase(){
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(Bird bird){
        this.birds.add(bird);
    }

    public void observation(String birdName) {
        for (Bird bird : birds) {
            if(bird.getName().equals(birdName)) {
                bird.incrementObservation();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void statistics(){
        for (Bird bird : birds) {
            System.out.println(
                    bird.getName() + " (" + bird.getLatinName() + "): " + bird.getAmountOfObservations() + " observations"
            );
        }
    }

    public void show(String birdName){
        for (Bird bird : birds) {
            if(bird.getName().equals(birdName)) {
                System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " +
                        bird.getAmountOfObservations() + " observations");
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

}
