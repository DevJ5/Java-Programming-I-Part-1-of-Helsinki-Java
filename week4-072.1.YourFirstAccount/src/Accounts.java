
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account jaysAccount = new Account("Jay", 100.00);
        jaysAccount.deposit(20.0);
        System.out.println(jaysAccount);

    }

}
