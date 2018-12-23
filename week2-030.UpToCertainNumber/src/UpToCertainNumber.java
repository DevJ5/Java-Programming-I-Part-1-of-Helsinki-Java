
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int maxNumber = Integer.parseInt(reader.nextLine());
        int number = 1;

        while(number <= maxNumber) System.out.println(number++);

        
    }
}
