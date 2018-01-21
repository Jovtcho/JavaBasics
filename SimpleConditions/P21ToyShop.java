import java.util.Scanner;

public class P21ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzlePrice = 2.60;
        double dollPrice = 3.00;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double lorryPrice = 2.00;
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int lorriesCount = Integer.parseInt(scanner.nextLine());

        double totalPuzzlePrice = puzzlePrice * puzzlesCount;
        double totalDollPrice = dollPrice * dollsCount;
        double totalTeddyBearPrice = teddyBearPrice * teddyBearsCount;
        double totalMinionPrice = minionPrice * minionsCount;
        double totalLorryPrice = lorryPrice * lorriesCount;
        int totalToysCount = puzzlesCount + dollsCount + teddyBearsCount + minionsCount + lorriesCount;

        double totalIncome = totalPuzzlePrice + totalDollPrice + totalTeddyBearPrice + totalMinionPrice + totalLorryPrice;

        if (totalToysCount >= 50) {
            totalIncome -= totalIncome * 25 / 100;
        }

        totalIncome -= totalIncome * 10 / 100;

        if (totalIncome >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", totalIncome - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - totalIncome);
        }
    }
}
