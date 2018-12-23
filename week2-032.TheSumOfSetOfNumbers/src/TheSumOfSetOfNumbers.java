
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Input is a number from the user
        System.out.println("Until what?");
        int startingNumber = 1;
        int maxNumber = Integer.parseInt(reader.nextLine());
        int sum = 0;

        while(startingNumber <= maxNumber) {
            sum += startingNumber;
            startingNumber++;
        }

        System.out.println("Sum is " + sum);
    }
}
