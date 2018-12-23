
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Ask user for input username
        System.out.println("Type your username:");
        String username = reader.nextLine();
        // Ask user for input password
        System.out.println("Type your password:");
        String password = reader.nextLine();

        // If username is alex and if password is mightyducks, output logged into system.
        if(username.equals("alex") && password.equals("mightyducks")) System.out.println("You are now logged into the system!");
        else if(username.equals("emily") && password.equals("cat")) System.out.println("You are now logged into the system!");

        // Else output username or password is invalid.
        else System.out.println("Your username or password was invalid!");
    }
}
