

public class Main {
    public static int[] copy(int[] array) {
        int[] copiedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }

        return copiedArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] copiedArray = new int[array.length];

        for (int i = 0, j = array.length -1; i < array.length; i++, j--) {
            copiedArray[i] = array[j];
        }

        return copiedArray;

    }

    public static void main(String[] args) {

    }

}
