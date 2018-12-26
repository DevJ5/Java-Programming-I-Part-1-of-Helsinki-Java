
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        // read the initial value of seconds from the user
        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());

        // read the initial value of minutes from the user
        System.out.println("minutes: ");
        int m = Integer.parseInt(reader.nextLine());

        // read the initial value of hours from the user
        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while(i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            if(minutes.getValue() == 59 && seconds.getValue() == 59) {
                minutes.next();
                hours.next();
            }
            else if(seconds.getValue() == 59) minutes.next();

            seconds.next();

            i++;
        }
    }
}
