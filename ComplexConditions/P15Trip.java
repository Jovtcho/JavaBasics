import java.util.Scanner;

public class P15Trip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();

        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if (season.equals("summer")) {
                budget = budget * 30 / 100;
                System.out.printf("Camp - %.2f", budget);
            } else {
                budget = budget * 70 / 100;
                System.out.printf("Hotel - %.2f", budget);
            }
        } else if ((100 < budget) && (budget <= 1000)) {
            System.out.println("Somewhere in Balkans");
            if (season.equals("summer")) {
                budget = budget * 40 / 100;
                System.out.printf("Camp - %.2f", budget);
            } else {
                budget = budget * 80 / 100;
                System.out.printf("Hotel - %.2f", budget);
            }
        } else {
            System.out.println("Somewhere in Europe");
            budget = budget * 90 / 100;
            System.out.printf("Hotel - %.2f", budget);
        }
    }
}

