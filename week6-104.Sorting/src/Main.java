import java.util.Arrays;

public class Main {

    public static int smallest(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < temp) temp = array[i];
        }
        return temp;
    }

    public static int indexOfTheSmallest(int[] array) {
        int temp = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] < temp) {
                temp = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int temp = array[index];
        int tempIndex = index;
        for (int i = index + 1; i < array.length; i++) {
            if(array[i] < temp) {
                temp = array[i];
                tempIndex = i;
            }
        }
        return tempIndex;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    public static void sort(int[] array) {
        int i = 0;
        while(i < array.length) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            i++;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1,5,8,9,0,-1};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

}
