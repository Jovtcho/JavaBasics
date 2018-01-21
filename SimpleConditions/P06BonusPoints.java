import java.util.Scanner;

public class P06BonusPoints {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int score = Integer.parseInt(console.nextLine());

        double bonusScore = 0.0;
        double finalScore = 0.0;

        if (score <= 100) {
            bonusScore = 5.0;
        } else if (score < 1000) {
            bonusScore = score * 20.0 / 100;
        } else {
            bonusScore = score * 10.0 / 100;
        }

        if ((score % 2) == 0) {
            bonusScore = bonusScore + 1;
        } else if ((score % 10) == 5) {
            bonusScore = bonusScore + 2;
        }

        finalScore = score + bonusScore;
        System.out.printf("Bonus score is: %.1f%n", bonusScore);
        System.out.printf("Total score is: %.1f%n", finalScore);
    }
}