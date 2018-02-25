import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P03IvanoviHoliday {
    public static void main(String[] args) throws IOException {
//          Scanner scanner = new Scanner(System.in);
//        int accommodation = Integer.parseInt(scanner.nextLine());
//        String destination = scanner.nextLine();
//        String transport = scanner.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int accommodation = Integer.parseInt(br.readLine());
        String destination = br.readLine();
        String transport = br.readLine();
        double adultPrice = 0.0;
        double childPrice = 0.0;

        if (accommodation < 11) {
            if ("Miami".equalsIgnoreCase(destination)) {
                adultPrice = 24.99;
                childPrice = 14.99;
            } else if ("Canary Islands".equalsIgnoreCase(destination)) {
                adultPrice = 32.50;
                childPrice = 28.50;
            } else if ("Philippines".equalsIgnoreCase(destination)) {
                adultPrice = 42.99;
                childPrice = 39.99;
            }
        } else if (accommodation < 16) {
            if ("Miami".equalsIgnoreCase(destination)) {
                adultPrice = 22.99;
                childPrice = 11.99;
            } else if ("Canary Islands".equalsIgnoreCase(destination)) {
                adultPrice = 30.50;
                childPrice = 25.60;
            } else if ("Philippines".equalsIgnoreCase(destination)) {
                adultPrice = 41.00;
                childPrice = 36.00;
            }
        } else {
            if ("Miami".equalsIgnoreCase(destination)) {
                adultPrice = 20.00;
                childPrice = 10.00;
            } else if ("Canary Islands".equalsIgnoreCase(destination)) {
                adultPrice = 28.00;
                childPrice = 22.00;
            } else if ("Philippines".equalsIgnoreCase(destination)) {
                adultPrice = 38.50;
                childPrice = 32.40;
            }
        }

        double peopleExpense = accommodation * (2 * adultPrice + 3 * childPrice);
        double peopleExpensePlusDog = peopleExpense + peopleExpense * 25 / 100;

        double adultTransport = 0.0;
        double childTransport = 0.0;
        if ("train".equalsIgnoreCase(transport)) {
            adultTransport = 22.30;
            childTransport = 12.50;
        } else if ("bus".equalsIgnoreCase(transport)) {
            adultTransport = 45.00;
            childTransport = 37.00;
        } else if ("airplane".equalsIgnoreCase(transport)) {
            adultTransport = 90.00;
            childTransport = 68.50;
        }

        double transportExpense = 2 * adultTransport + 3 * childTransport;
        double allExpense = peopleExpensePlusDog + transportExpense;

        System.out.printf("%.3f", allExpense);
    }
}