import java.text.DecimalFormat;
import java.util.Scanner;

public class P06Juice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.######");
        int r = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int juiceLimit = Integer.parseInt(scanner.nextLine());
        double maxJuice = 0;

        double rJuice = 4.5;
        double sJuice = 7.5;
        double cJuice = 15;
        int rMax = 0;
        int sMax = 0;
        int cMax = 0;

        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= s; j++) {
                for (int k = 0; k <= c; k++) {
                    double currentJuice = i * rJuice + j * sJuice + k * cJuice;
                    if (currentJuice <= juiceLimit) {
                        if (currentJuice > maxJuice) {
                            maxJuice = currentJuice;
                            rMax = i;
                            sMax = j;
                            cMax = k;
                        }
                    }
                }
            }
        }

        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %s ml.",
                rMax, sMax, cMax, df.format(maxJuice));
    }
}
