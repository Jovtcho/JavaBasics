import java.util.Scanner;

public class P12Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String year = console.nextLine().toLowerCase();
        int p = Integer.parseInt(console.nextLine());
        int h = Integer.parseInt(console.nextLine());
        double countGames = 0;

        countGames = 48 - h;
        countGames = countGames * 3.0 / 4;
        countGames = countGames + h;
        countGames = countGames + p * 2.0 / 3;

        if (year.equals("leap")) {
            countGames = countGames * 1.15;
            countGames = (int) countGames;
            System.out.printf("%.0f%n", countGames);
        } else {
            countGames = (int) countGames;
            System.out.printf("%.0f%n", countGames);
        }
    }
}
