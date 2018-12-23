
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Input is 2 numbers, lower and upper range.
        System.out.println("First:");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Last:");
        int lastNumber = Integer.parseInt(reader.nextLine());

        // Output is the sum of all the numbers in between, including min and max.
        // So for 3 and 5 it is: 3 + 4 + 5 = 12

        int sum = 0;
        while(firstNumber <= lastNumber) {
            sum += firstNumber;
            firstNumber++;
        }

        System.out.println("The sum" + sum);
    }
}
