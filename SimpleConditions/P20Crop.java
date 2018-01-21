import java.util.Scanner;

public class P20Crop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grapesArea = Integer.parseInt(scanner.nextLine());
        double grapesPerMeter2 = Double.parseDouble(scanner.nextLine());
        int requiredWine = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        double production = 0.0;
        double productionForWine = 0.0;
        double winePerPerson = 0.0;

        production = grapesArea * grapesPerMeter2;
        double wineFromGrapes = 2.5;
        productionForWine = (production * 40 / 100) / wineFromGrapes;

        if (productionForWine >= requiredWine) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(productionForWine));
            winePerPerson = Math.ceil((productionForWine - requiredWine) / workersCount);
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(productionForWine - requiredWine), winePerPerson);
        } else {
            System.out.printf("It will be a tough winter! More %d liters wine needed.", (int) Math.floor(requiredWine - productionForWine));
        }
    }
}
