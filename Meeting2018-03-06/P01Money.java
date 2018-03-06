import java.util.Scanner;

public class P01Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yuans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine()) / 100.00;

        double bitcoinsInLeva = bitcoins * 1168.0;
        double yuansToDollars = yuans * 0.15;
        double dollarsToLeva = yuansToDollars * 1.76;

        double levas = bitcoinsInLeva + dollarsToLeva;
        double euros = levas / 1.95;
        euros -= commission * euros;
        System.out.printf("%.2f", euros);
    }
}
