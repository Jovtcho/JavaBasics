import java.util.Scanner;

public class P08TradeCommission {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String town = console.nextLine().toLowerCase();
        double salesNumber = Double.parseDouble(console.nextLine());
        double commission = -1;

        if (town.equals("sofia")) {
            if ((0 <= salesNumber) && (salesNumber <= 500)) {
                commission = 0.05;
            } else if ((500 < salesNumber) && (salesNumber <= 1000)) {
                commission = 0.07;
            } else if ((1000 < salesNumber) && (salesNumber <= 10000)) {
                commission = 0.08;
            } else if (10000 < salesNumber) {
                commission = 0.12;
            }
        } else if (town.equals("varna")) {
            if ((0 <= salesNumber) && (salesNumber <= 500)) {
                commission = 0.045;
            } else if ((500 < salesNumber) && (salesNumber <= 1000)) {
                commission = 0.075;
            } else if ((1000 < salesNumber) && (salesNumber <= 10000)) {
                commission = 0.1;
            } else if (10000 < salesNumber) {
                commission = 0.13;
            }
        } else if (town.equals("plovdiv")) {
            if ((0 <= salesNumber) && (salesNumber <= 500)) {
                commission = 0.055;
            } else if ((500 < salesNumber) && (salesNumber <= 1000)) {
                commission = 0.08;
            } else if ((1000 < salesNumber) && (salesNumber <= 10000)) {
                commission = 0.12;
            } else if (10000 < salesNumber) {
                commission = 0.145;
            }
        }

        if (commission < 0) {
            System.out.println("error");
        } else {
            commission = salesNumber * commission;
            System.out.printf("%.2f", commission);
        }
    }
}
