import java.net.Inet4Address;
import java.util.Scanner;

public class P07FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine().toLowerCase();
        String dayOfWeek = console.nextLine().toLowerCase();
        Double quantity = Double.parseDouble(console.nextLine());

        boolean checkWeekDay = ((dayOfWeek.equals("monday")) || (dayOfWeek.equals("tuesday")) || (dayOfWeek.equals("wednesday"))
                || (dayOfWeek.equals("thursday")) || (dayOfWeek.equals("friday")));
        boolean checkWeekendDay = ((dayOfWeek.equals("saturday")) || (dayOfWeek.equals("sunday")));

        double totalPrice = -1;

        if (checkWeekDay) {
            if (fruit.equals("banana")) {
                totalPrice = quantity * 2.50;
            } else if (fruit.equals("apple")) {
                totalPrice = quantity * 1.20;
            } else if (fruit.equals("orange")) {
                totalPrice = quantity * 0.85;
            } else if (fruit.equals("grapefruit")) {
                totalPrice = quantity * 1.45;
            } else if (fruit.equals("kiwi")) {
                totalPrice = quantity * 2.70;
            } else if (fruit.equals("pineapple")) {
                totalPrice = quantity * 5.50;
            } else if (fruit.equals("grapes")) {
                totalPrice = quantity * 3.85;
            }
        } else if (checkWeekendDay) {
            if (fruit.equals("banana")) {
                totalPrice = quantity * 2.70;
            } else if (fruit.equals("apple")) {
                totalPrice = quantity * 1.25;
            } else if (fruit.equals("orange")) {
                totalPrice = quantity * 0.90;
            } else if (fruit.equals("grapefruit")) {
                totalPrice = quantity * 1.60;
            } else if (fruit.equals("kiwi")) {
                totalPrice = quantity * 3.00;
            } else if (fruit.equals("pineapple")) {
                totalPrice = quantity * 5.60;
            } else if (fruit.equals("grapes")) {
                totalPrice = quantity * 4.20;
            }
        }

        System.out.println(totalPrice == -1 ? "error" : totalPrice);
    }
}
