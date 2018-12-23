public class Printing {

    public static void printStars(int amount) {
        // input is 3
        int i = 0;
        while(i++ < amount) System.out.print("*");
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        // input is 4, output should be 4 times the printStars output.
        int i = 0;

        while(i++ < sideSize) printStars(sideSize);
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int i = 0;

        while(i++ < height) printStars(width);

    }

    public static void printTriangle(int size) {
        // 39.4
        int i = 0;
        while(i++ < size) printStars(i);

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
