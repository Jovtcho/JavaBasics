import java.util.Scanner;

public class P15SmartLily {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = Integer.parseInt(console.nextLine());
        double priceWashingMachine = Double.parseDouble(console.nextLine());
        int priceToy = Integer.parseInt(console.nextLine());
        double money = 0;
        int oddBirthDay = age - age / 2;

        for (int i = 1; i <= (age / 2); i++) {
            money += i * 10 - 1;
        }

        money += oddBirthDay * priceToy;
        if (money >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", money - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - money);
        }
    }
}
