import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (Integer number : list) {
            total += number;
        }
        return total;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double)sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double avg = average(list);

        // 3,2,7,2
        // (3 - avg)^2 + (2 - avg)^2..... / list.size() - 1
        double temp = 0;
        for (Integer number : list) {
            temp += Math.pow(number - avg, 2);
        }

        return temp / (list.size() - 1);

    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
