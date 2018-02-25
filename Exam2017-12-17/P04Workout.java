import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P04Workout {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int workoutDays = Integer.parseInt(br.readLine());
        double previousDayKm = Double.parseDouble(br.readLine());
        double totalDistance = previousDayKm;

        for (int i = 0; i < workoutDays; i++) {
            int percent = Integer.parseInt(br.readLine());
            double currentDayDistance = previousDayKm + previousDayKm * percent / 100;
            totalDistance += currentDayDistance;
            previousDayKm = currentDayDistance;
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