
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Ask the user for a number input
        System.out.println("Type the points [0-60]:");
        int number = Integer.parseInt(reader.nextLine());

        // Write a conditional for all the point ranges
        String grade;
        if(number < 30) grade = "failed";
        else if(number < 35) grade = "1";
        else if(number < 40) grade = "2";
        else if(number < 45) grade = "3";
        else if(number < 50) grade = "4";
        else if(number < 61) grade = "5";
        else grade = null;

        // Output Grade:
        if(grade != null) System.out.println("Grade: " + grade);
    }
}
