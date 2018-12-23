public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while(i++ < amount) System.out.print("*");
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while(i++ < amount) System.out.print(" ");

    }

    public static void printTriangle(int size) {
        // Input is 3, output is  * -> 2 spaces
        //                       ** -> 1 spaces
        //                      *** -> 0 spaces
        int i = 0;
        while(i++ < size) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // Input is 3, output is  *     -> 2 spaces, 1 star
        //                       ***    -> 1 spaces, 3 stars
        //                      *****   -> 0 spaces, 5 stars
        //                       ***
        //                       ***
        int i = 0;
        while(i < height) {
            printWhitespaces(height - (i + 1));
            printStars(2 * i + 1);
            i++;
        }
        // For the stand, there are whitespaces equal to the 2nd row.
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printStars(3);
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
