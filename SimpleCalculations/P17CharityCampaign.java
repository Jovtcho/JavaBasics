import java.util.Scanner;

public class P17CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cakePrice = 45.0;
        double gofferPrice = 5.80;
        double panCakePrice = 3.20;

        int campaignDays = Integer.parseInt(scanner.nextLine());
        int cookCount = Integer.parseInt(scanner.nextLine());
        int cakeCount = Integer.parseInt(scanner.nextLine());
        int gofferCount = Integer.parseInt(scanner.nextLine());
        int pancakeCount = Integer.parseInt(scanner.nextLine());

        double cakeMoneyOneDay = cakeCount * cakePrice;
        double gofferMoneyOneDay = gofferCount * gofferPrice;
        double pancakeMoneyOneDay = pancakeCount * panCakePrice;
        double moneyOneDay = cakeMoneyOneDay + gofferMoneyOneDay + pancakeMoneyOneDay;
        double incomeAllDays = moneyOneDay * campaignDays * cookCount;

        double moneyForCharity = incomeAllDays - incomeAllDays / 8.0;

        System.out.printf("%.2f%n", moneyForCharity);
    }
}
