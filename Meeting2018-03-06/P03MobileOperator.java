import java.util.Scanner;

public class P03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractPeriod = scanner.nextLine();
        String contractType = scanner.nextLine();
        String addedInternet = scanner.nextLine();
        int monthsForPay = Integer.parseInt(scanner.nextLine());
        double discount = 3.75;

        double monthlyPrice = 0.0;

        if ("Small".equalsIgnoreCase(contractType)) {
            if ("one".equalsIgnoreCase(contractPeriod)) {
                monthlyPrice = 9.98;
            } else {
                monthlyPrice = 8.58;
            }
        } else if ("Middle".equalsIgnoreCase(contractType)) {
            if ("one".equalsIgnoreCase(contractPeriod)) {
                monthlyPrice = 18.99;
            } else {
                monthlyPrice = 17.09;
            }
        } else if ("Large".equalsIgnoreCase(contractType)) {
            if ("one".equalsIgnoreCase(contractPeriod)) {
                monthlyPrice = 25.98;
            } else {
                monthlyPrice = 23.59;
            }
        } else {
            if ("one".equalsIgnoreCase(contractPeriod)) {
                monthlyPrice = 35.99;
            } else {
                monthlyPrice = 31.79;
            }
        }


        double monthlyInternetPrice = 0.0;
        if ("yes".equalsIgnoreCase(addedInternet)) {
            if (monthlyPrice <= 10) {
                monthlyInternetPrice = 5.50;
            } else if (monthlyPrice <= 30) {
                monthlyInternetPrice = 4.35;
            } else {
                monthlyInternetPrice = 3.85;
            }
        }

        double totalMonthlyPrice = monthlyPrice + monthlyInternetPrice;
        if ("two".equalsIgnoreCase(contractPeriod)) {
            totalMonthlyPrice -= totalMonthlyPrice * discount / 100;
        }

        double totalPrice = monthsForPay * totalMonthlyPrice;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
