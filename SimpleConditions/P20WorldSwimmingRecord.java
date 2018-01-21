import java.util.Scanner;

public class P20WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());
        double periodMeter = 15.0;
        double lostTimeForPeriod = 12.5;

        double timeAllDistance = distance * timePerMeter;
        double lostTimeForDistance = Math.floor(distance / periodMeter) * lostTimeForPeriod;
        double totalTime = timeAllDistance + lostTimeForDistance;

        if (totalTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - worldRecord);
        }
    }
}
