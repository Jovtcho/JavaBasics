import java.util.Scanner;

public class P11Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String filmShow = console.nextLine().toLowerCase();
        int row = Integer.parseInt(console.nextLine());
        int column = Integer.parseInt(console.nextLine());
        double premierePrice = 12.00;
        double normalPrice = 7.50;
        double discountPrice = 5.00;
        double price = 0;

        switch (filmShow) {
            case "premiere":
                price = row * column * premierePrice;
                break;
            case "normal":
                price = row * column * normalPrice;
                break;
            case "discount":
                price = row * column * discountPrice;
                break;
            default:
                System.out.println("No such filmshow.");
                break;
        }

        if (price > 0) {
            System.out.printf("%.2f leva", price);
        }
    }
}
