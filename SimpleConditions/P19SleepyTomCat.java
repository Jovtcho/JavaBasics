import java.util.Scanner;

public class P19SleepyTomCat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int holidays = Integer.parseInt(console.nextLine());
        int minutesForPlay = (365 - holidays) * 63 + holidays * 127;

        if (minutesForPlay < 30000) {
            System.out.println("Tom sleeps well");
            minutesForPlay = 30000 - minutesForPlay;
            System.out.printf("%d hours and %d minutes less for play", minutesForPlay / 60, minutesForPlay % 60);
        } else {
            System.out.println("Tom will run away");
            minutesForPlay = minutesForPlay - 30000;
            System.out.printf("%d hours and %d minutes more for play", minutesForPlay / 60, minutesForPlay % 60);
        }
    }
}
