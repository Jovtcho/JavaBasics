import java.util.Scanner;

public class P17ThreeBrothers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double firstBroCleaningTime = Double.parseDouble(console.nextLine());
        double secondBroCleaningTime = Double.parseDouble(console.nextLine());
        double thirdBroCleaningTime = Double.parseDouble(console.nextLine());
        double fatherMissingTime = Double.parseDouble(console.nextLine());
        double restPercentTime = 15.0;

        double allBrothersCleaningTime = 1 / (1 / firstBroCleaningTime + 1 / secondBroCleaningTime + 1 / thirdBroCleaningTime);
        double allBrothersCleaningTimeWithRest = allBrothersCleaningTime + allBrothersCleaningTime * restPercentTime / 100;
        double timeLeft = allBrothersCleaningTimeWithRest - fatherMissingTime;

        if (timeLeft <= 0) {
            System.out.printf("Cleaning time: %.2f%n", allBrothersCleaningTimeWithRest);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.%n", Math.floor(Math.abs(timeLeft)));
        } else {
            System.out.printf("Cleaning time: %.2f%n", allBrothersCleaningTimeWithRest);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.%n", Math.ceil(timeLeft));
        }
    }
}
