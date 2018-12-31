
public class Main {

    public static void main(String[] args) {
        NightSky sky = new NightSky(0.1, 40, 1);
        sky.print();
        System.out.println(sky.starsInLastPrint());
    }
}
