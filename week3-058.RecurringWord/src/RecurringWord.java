
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();
        // Ask user for a word input
        System.out.println("Type a word: ");
        String input;

        while(true) {
            input = reader.nextLine();
            if(words.contains(input)) break;

            words.add(input);
        }
        // If the array already includes the word - > break and
        // output which word was given twice

        System.out.println("You gave the word " + input + " twice");
        
    }
}
