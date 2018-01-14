import java.util.Scanner;

public class P11UsdToLev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fixRateUsdToLev = 1.79549;
        double usdAmount = Double.parseDouble(scanner.nextLine());
        double levAmount = usdAmount * fixRateUsdToLev;

        System.out.printf("%.2f BGN", levAmount);
    }
}
