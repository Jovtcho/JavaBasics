import java.util.Scanner;

public class P02Lutenitsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tomatoKg = Double.parseDouble(scanner.nextLine());
        double boxCount = Integer.parseInt(scanner.nextLine());
        double jarCount = Integer.parseInt(scanner.nextLine());

        int lutenitsaOneKg = 5;
        double jarWithLutenitsa = 0.535;

        double allQuantityLutinitsa = tomatoKg * 1.0 / lutenitsaOneKg;
        double allJarQuantity = allQuantityLutinitsa / jarWithLutenitsa;
        double allBoxQuantity = allJarQuantity / jarCount;

        System.out.printf("Total lutenica: %.0f kilograms.\n", Math.floor(allQuantityLutinitsa));
        if (allBoxQuantity >= boxCount) {
            System.out.printf("%.0f boxes left.\n", Math.floor(allBoxQuantity - boxCount));
            System.out.printf("%.0f jars left.\n", Math.floor(allJarQuantity - boxCount * jarCount));
        } else {
            System.out.printf("%.0f more boxes needed.\n", Math.floor(boxCount - allBoxQuantity));
            System.out.printf("%.0f more jars needed.\n", Math.floor(boxCount * jarCount - allJarQuantity));
        }
    }
}
