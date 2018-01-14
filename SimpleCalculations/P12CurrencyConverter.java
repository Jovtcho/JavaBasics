import java.util.Scanner;

public class P12CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fixRateUsdToLev = 1.79549;
        double fixRateEurToLev = 1.95583;
        double fixRateGbpToLev = 2.53405;
        double currencyForConverting = Double.parseDouble(scanner.nextLine());
        String inputCurrency = scanner.nextLine();
        String outputCurrency = scanner.nextLine();

        double intermediateAmount = 0.0; // Convert any kind of currencies to leva.

        if ("BGN".equalsIgnoreCase(inputCurrency)) {
            intermediateAmount = currencyForConverting;
        } else if ("USD".equalsIgnoreCase(inputCurrency)) {
            intermediateAmount = currencyForConverting * fixRateUsdToLev;
        } else if ("EUR".equalsIgnoreCase(inputCurrency)) {
            intermediateAmount = currencyForConverting * fixRateEurToLev;
        } else if ("GBP".equalsIgnoreCase(inputCurrency)) {
            intermediateAmount = currencyForConverting * fixRateGbpToLev;
        } else {
            System.out.println("No such currency.");
        }

        double outputAmount = 0.0; // Calculate output value from intermediate amount

        if ("BGN".equalsIgnoreCase(outputCurrency)) {
            outputAmount = intermediateAmount;
        } else if ("USD".equalsIgnoreCase(outputCurrency)) {
            outputAmount = intermediateAmount / fixRateUsdToLev;
        } else if ("EUR".equalsIgnoreCase(outputCurrency)) {
            outputAmount = intermediateAmount / fixRateEurToLev;
        } else if ("GBP".equalsIgnoreCase(outputCurrency)) {
            outputAmount = intermediateAmount / fixRateGbpToLev;
        } else {
            System.out.println("No such currency.");
        }

        System.out.printf("%.2f %s%n", outputAmount, outputCurrency.toUpperCase());
    }
}

//BGN, USD, EUR, GBP