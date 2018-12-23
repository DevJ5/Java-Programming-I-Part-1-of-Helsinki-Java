import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Input is a number
        System.out.println("Type a number");
        int number = Integer.parseInt(reader.nextLine());

        // Output is factorial of this number
        // Ex. input 4, output 1*2*3*4 = 24
        int total = 1;
        int i = 1;
        while(i <= number) {
            total *= i;
            i++;
        }

        System.out.println("Factorial is " +  total);


    }
}
