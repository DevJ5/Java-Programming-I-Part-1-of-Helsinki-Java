import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scores scores = new Scores();

        System.out.println("Type exam scores, -1 completes:");
        scores.inputScores(reader);

        scores.mapScoresToGrades();
        System.out.println("Grade distribution:");
        scores.printGrades();
        scores.printPercentage();

    }
}
