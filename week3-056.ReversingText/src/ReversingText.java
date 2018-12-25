
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // reverse the text argument.
        // Ex. text = hello, return olleh
        String reversedStr = "";

        int i = text.length() -1;
        while(i > -1) {
            reversedStr += text.charAt(i);
            i--;
        }

        return reversedStr;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
