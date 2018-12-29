
public class Main {

    public static void main(String[] args) {
        MyDate datex = new MyDate(20,2,1990);
        MyDate datey = new MyDate(19, 2, 1990);

        System.out.println("is it true?" + datey.earlier(datex));

        datex.advance(5);
        System.out.println(datex);
    }
}
