import java.util.Scanner;

public class P18AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskyPrice = Double.parseDouble(scanner.nextLine());
        double beerQuantity = Double.parseDouble(scanner.nextLine());
        double wineQuantity = Double.parseDouble(scanner.nextLine());
        double rakiaQuantity = Double.parseDouble(scanner.nextLine());
        double whiskyQuantity = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskyPrice / 2.0;
        double winePrice = rakiaPrice - rakiaPrice * 40.0 / 100;
        double beerPrice = rakiaPrice - rakiaPrice * 80.0 / 100;

        double moneyForWhisky = whiskyPrice * whiskyQuantity;
        double moneyForRakia = rakiaPrice * rakiaQuantity;
        double moneyForWine = winePrice * wineQuantity;
        double moneyForBeer = beerPrice * beerQuantity;

        double totalNeededMoney = moneyForWhisky + moneyForRakia + moneyForWine + moneyForBeer;

        System.out.printf("%.2f%n", totalNeededMoney);
    }
}
