import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double previousDayKm = Double.parseDouble(scanner.nextLine());
        double totalDistance = previousDayKm;

        for (int i = 0; i < days; i++) {
            int procent = Integer.parseInt(scanner.nextLine());
            previousDayKm += previousDayKm * procent * 1.0 / 100;
            totalDistance += previousDayKm;
        }

        if (totalDistance >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!",
                    Math.ceil(totalDistance - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",
                    Math.ceil(1000 - totalDistance));
        }
    }
}
