import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdDatabase = new BirdDatabase();

        while(true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if(command.equalsIgnoreCase("Quit")) break;

            else if(command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();

                Bird bird = new Bird(name, latinName);
                birdDatabase.addBird(bird);
            }

            else if(command.equalsIgnoreCase("Observation")){
                System.out.print("What was observed? ");
                String birdName = scanner.nextLine();
                birdDatabase.observation(birdName);
            }

            else if(command.equalsIgnoreCase("Statistics")) birdDatabase.statistics();

            else if(command.equalsIgnoreCase("Show")) {
                System.out.print("What?");
                String birdName = scanner.nextLine();
                birdDatabase.show(birdName);
            }

        }


    }

}
