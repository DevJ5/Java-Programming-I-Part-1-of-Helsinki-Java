
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Student> search(ArrayList<Student> list, String searchterm){
        ArrayList<Student> searchResults = new ArrayList<Student>();

        int i = 0;
        while(i < list.size()) {
            String name = list.get(i).getName();
            if(name.contains(searchterm)) searchResults.add(list.get(i));
            i++;
        }

        return searchResults;
    }

    public static void printResults(ArrayList<Student> list) {
        for(Student student : list) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        String name, studentNumber;

        while(true) {
            System.out.print("name: ");
            name = reader.nextLine();

            if(name.isEmpty()) break;

            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();

            list.add(new Student(name, studentNumber));
        }

        printResults(list);

        // Search feature
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        ArrayList<Student> searchResults = search(list, searchTerm);

        System.out.println("Result: ");
        printResults(searchResults);


    }
}
