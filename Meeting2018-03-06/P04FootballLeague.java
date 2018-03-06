import java.util.Scanner;

public class P04FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int allFans = Integer.parseInt(scanner.nextLine());
        int sectorAFans = 0;
        int sectorBFans = 0;
        int sectorVFans = 0;
        int sectorGFans = 0;

        for (int i = 0; i < allFans; i++) {
            String currentSector = scanner.nextLine();

            switch (currentSector.toLowerCase()) {
                case "a":
                    sectorAFans++;
                    break;
                case "b":
                    sectorBFans++;
                    break;
                case "v":
                    sectorVFans++;
                    break;
                case "g":
                    sectorGFans++;
                    break;
            }
        }

        System.out.printf("%.2f%%\n", sectorAFans * 100.0 / allFans);
        System.out.printf("%.2f%%\n", sectorBFans * 100.0 / allFans);
        System.out.printf("%.2f%%\n", sectorVFans * 100.0 / allFans);
        System.out.printf("%.2f%%\n", sectorGFans * 100.0 / allFans);
        System.out.printf("%.2f%%\n", allFans * 100.0 / stadiumCapacity);
    }
}
