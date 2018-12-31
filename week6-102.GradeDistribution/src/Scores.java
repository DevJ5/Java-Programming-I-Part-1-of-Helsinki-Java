import java.util.ArrayList;
import java.util.Scanner;

public class Scores {
    private ArrayList<Integer> scores;
    private int[] grades;

    public Scores() {
        this.scores = new ArrayList<Integer>();
        this.grades = new int[6];
    }

    public void inputScores(Scanner reader) {
        int input;
        while (true) {
            input = Integer.parseInt(reader.nextLine());
            if (input == -1) break;
            if (input > 0 && input < 61) this.scores.add(input);
        }
    }

    public void mapScoresToGrades() {
        for (int score : this.scores) {
            if (score < 30) this.grades[0]++;
            else if (score < 35) this.grades[1]++;
            else if (score < 40) this.grades[2]++;
            else if (score < 45) this.grades[3]++;
            else if (score < 50) this.grades[4]++;
            else if (score < 61) this.grades[5]++;
        }
    }

    public void printGrades() {
        int i = 5;
        while (i >= 0) {
            this.printLine(i);
            i--;
        }
    }

    public void printPercentage() {
        if (this.scores.size() > 0) {
            double percentage = 100 - ((double) this.grades[0] / this.scores.size() * 100);
            System.out.println("Acceptance percentage: " + percentage);
        }
    }

    public void printLine(int index) {
        System.out.print(index + ": ");
        for (int i = 0; i < this.grades[index]; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }
}
