import java.text.DecimalFormat;
import java.util.Scanner;

public class P06JuiceDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.################");

        int r = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int juiceLimit = Integer.parseInt(scanner.nextLine());

        double rJuice = 4.5;
        double sJuice = 7.5;
        double cJuice = 15;

        double maxJuice = 0;
        int maxR = 0;
        int maxS = 0;
        int maxC = 0;

        for (int rCounter = 0; rCounter <= r; rCounter++) {
            for (int sCounter = 0; sCounter <= s; sCounter++) {
                for (int cCounter = 0; cCounter <= c; cCounter++) {
                    double currentJuice = rCounter * rJuice + sCounter * sJuice + cCounter * cJuice;
                    if (currentJuice <= juiceLimit) {
                        if (currentJuice > maxJuice) {
                            maxJuice = currentJuice;
                            maxR = rCounter;
                            maxS = sCounter;
                            maxC = cCounter;
                        }
                    }
                }
            }
        }

        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %s ml.", maxR, maxS, maxC, df.format(maxJuice));
    }
}