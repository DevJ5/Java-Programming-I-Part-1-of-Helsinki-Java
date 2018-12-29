
public class Main {

    public static void main(String[] args) {
        MyDate first = new MyDate(10, 3, 2012);
        MyDate second = new MyDate(10, 3, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println( second + " and " + first + " difference in years: " + second.differenceInYears(first) );


    }
}
