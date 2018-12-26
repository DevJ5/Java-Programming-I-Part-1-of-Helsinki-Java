import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();
    private String alphabet= "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";

        int i = 0;
        while(i < this.length) {
            int number = random.nextInt(26);
            char symbol = this.alphabet.charAt(number);
            System.out.println(this.alphabet.charAt(0));

            password += symbol;
            i++;
        }

        return password;
    }
}
