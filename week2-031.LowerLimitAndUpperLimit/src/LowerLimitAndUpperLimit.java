
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First:");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Last:");
        int lastNumber = Integer.parseInt(reader.nextLine());

        while(firstNumber <= lastNumber) {
            System.out.println(firstNumber++);
        }

        // Input 2 numbers:  3,5
        // Output 3,4,5


    }
}
