import java.util.Scanner;

public class P17MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String ticketType = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());
        double ticketPriceVIP = 499.99;
        double ticketPriceNormal = 249.99;
        double transportExpense = 0.0;

        if (peopleCount <= 4) {
            transportExpense = budget * 75.0 / 100.0;
        } else if (peopleCount <= 9) {
            transportExpense = budget * 60.0 / 100.0;
        } else if (peopleCount <= 24) {
            transportExpense = budget * 50.0 / 100.0;
        } else if (peopleCount <= 49) {
            transportExpense = budget * 40.0 / 100.0;
        } else {
            transportExpense = budget * 25.0 / 100.0;
        }

        double moneyLeftForTickets = budget - transportExpense;
        double moneyForAllTicketsAllPeople = 0.0;

        if ("vip".equalsIgnoreCase(ticketType)) {
            moneyForAllTicketsAllPeople = peopleCount * ticketPriceVIP;
        } else {
            moneyForAllTicketsAllPeople = peopleCount * ticketPriceNormal;
        }

        double diffLeftMoneyNeeded = moneyLeftForTickets - moneyForAllTicketsAllPeople;

        if (diffLeftMoneyNeeded >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", diffLeftMoneyNeeded);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(diffLeftMoneyNeeded));
        }
    }
}