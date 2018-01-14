import java.util.Scanner;

public class P15TailorFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tableCoverPricePerM2 = 7.0;
        double tableCenterPricePerM2 = 9.0;
        double usdToLev = 1.85;

        int tableCount = Integer.parseInt(scanner.nextLine());
        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWidth = Double.parseDouble(scanner.nextLine());

        double allCoverArea = tableCount * (tableLength + 2 * 0.3) * (tableWidth + 2 * 0.3);
        double allCenterArea = tableCount * (tableLength / 2.0) * (tableLength / 2.0);

        double allCoverAreaPriceUsd = allCoverArea * tableCoverPricePerM2;
        double allCenterAreaPriceUsd = allCenterArea * tableCenterPricePerM2;
        double allTableFabricPriceUsd = allCoverAreaPriceUsd + allCenterAreaPriceUsd;
        double allTableFabricPriceBgn = allTableFabricPriceUsd * usdToLev;

        System.out.printf("%.2f USD%n", allTableFabricPriceUsd);
        System.out.printf("%.2f BGN%n", allTableFabricPriceBgn);
    }
}
