import java.util.Scanner;

public class Palindromi {

    public static String reverseString(String text) {
        String revstr = "";
        int i = text.length() - 1;

        while(i > -1) {
            revstr += text.charAt(i);
            i--;
        }
        System.out.println(revstr);
        return revstr;
    }

    public static boolean palindrome(String text) {
        if(reverseString(text).equals(text)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
