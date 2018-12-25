
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        // Ask the user to input words
        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            // Break if empty string is entered
            if(word.equals("")) break;

            words.add(word);
        }

        // Sort the list alphabetically
        Collections.sort(words);
        // Print the list to the screen
        for (String word : words) {
            System.out.println(word);
        }
    }
}
