import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words =  new ArrayList<String>();

        // Ask user to input words until a empty string is inputted.
        System.out.println("Type a word: ");
        while(true) {
            String word = reader.nextLine();
            // Break on an empty string
            if(word.isEmpty()) break;

            words.add(word);
        }

        // Reverse the array
        Collections.reverse(words);

        // Print the array
        for (String word : words) {
            System.out.println(word);
        }

    }
}
