import java.util.Scanner;

public class P19Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsCount = Integer.parseInt(scanner.nextLine());
        int dancersCount = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());
        int stepPercentLimitPerDay = 13;

        double percentStepsPerDay = Math.ceil((stepsCount * 1.0 / daysCount) / stepsCount * 100);
        double percentStepsPerDayPerDancer = percentStepsPerDay / dancersCount;

        if (percentStepsPerDay < stepPercentLimitPerDay) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", percentStepsPerDayPerDancer);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.",
                    percentStepsPerDayPerDancer);
        }
    }
}
