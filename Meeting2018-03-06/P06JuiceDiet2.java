import java.text.DecimalFormat;
import java.util.Scanner;

public class P06JuiceDiet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#################");

        int rasp = Integer.parseInt(scanner.nextLine());
        int straw = Integer.parseInt(scanner.nextLine());
        int cherry = Integer.parseInt(scanner.nextLine());
        int juice = Integer.parseInt(scanner.nextLine());
        int cherryUsed = 0;
        int strawUsed = 0;
        int raspUsed = 0;
        double juiceTotal = 0.0;


        for (int i = 0; i <= rasp; i++) {
            for (int j = 0; j <= straw; j++) {
                for (int k = 0; k <= cherry; k++) {
                    double juiceCurrent = i * 4.5 + j * 7.5 + k * 15;
                    if (juiceCurrent <= juice) {
                        if (juiceCurrent > juiceTotal) {
                            juiceTotal = juiceCurrent;
                        }
                    }
                }
            }
        }

        for (int i = 0; i <= rasp; i++) {
            for (int j = 0; j <= straw; j++) {
                for (int k = 0; k <= cherry; k++) {
                    double juiceCurrent = i * 4.5 + j * 7.5 + k * 15;
                    if (juiceCurrent == juiceTotal) {
                        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %s ml.",
                                i, j, k, df.format(juiceCurrent));
                        return;
                    }
                }
            }
        }
    }
}
