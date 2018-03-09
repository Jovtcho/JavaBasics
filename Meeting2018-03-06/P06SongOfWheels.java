import java.util.Scanner;

public class P06SongOfWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkPoint = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String password = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i < j && k > l && (i * j + k * l) == checkPoint) {
                            String str = "" + i + j + k + l;
                            System.out.print(str + " ");
                            counter++;
                            if (counter == 4) {
                                password = str;
                            }
                        }
                    }
                }
            }
        }


//        System.out.printf("".equals(password) ? "\nNo!" : "\nPassword: %s ", password);

        if (counter == 0) {
            System.out.println("No!");
            return;
        }

        if (counter < 4) {
            System.out.println("\nNo!");
        } else {
            System.out.printf("\nPassword: %s ", password);
        }
    }
}
