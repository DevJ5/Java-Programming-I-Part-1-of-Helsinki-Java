
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Input is a number
        System.out.println("Type a number:");
        int number =  Integer.parseInt(reader.nextLine());
        int total = 0;
        int i = 0;

        // Sum 2 to the power of n and all the powers before that up to 0.
        // Ex. Input  = 3; Output is 2^0 + 2^1 + 2^2 2^3;
        // 1 + 2 + 4 + 8 = 15
        while(i <= number) {
            total += Math.pow(2, i);
            i++;
        }

        System.out.println("The result is " + total);

    }
}
