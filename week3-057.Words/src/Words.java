import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        // Input is words until an empty string is inputted.
        System.out.println("Type a word: ");

        String input;
        while(true) {
            input = reader.nextLine();
            if(input.isEmpty()) break;

            words.add(input);
        }

        // After an empty string is inputted, the output is a list of all the words entered.
        for (String word : words) {
            System.out.println(word);
        }
    }
}
