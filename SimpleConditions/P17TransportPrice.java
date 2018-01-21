import java.util.Scanner;

public class P17TransportPrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int distance = Integer.parseInt(console.nextLine());
        String time = console.nextLine().toLowerCase();
        double price = 0.0;

        if (distance < 20) {
            double initialPriceTaxi = 0.7;

            if ("day".equals(time)) {
                price = initialPriceTaxi + distance * 0.79;
            } else {
                price = initialPriceTaxi + distance * 0.9;
            }
        } else if (distance < 100) {
            price = distance * 0.09;
        } else {
            price = distance * 0.06;
        }

        System.out.printf("%.2f", price);
    }
}

