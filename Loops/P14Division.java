import java.util.Scanner;

public class P14Division {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        double countNumberDiv2 = 0.0;
        double countNumberDiv3 = 0.0;
        double countNumberDiv4 = 0.0;

        for (int i = 0; i < number; i++) {
            int numberForCheck = Integer.parseInt(console.nextLine());
            if ((numberForCheck % 2) == 0) {
                countNumberDiv2++;
            }
            if ((numberForCheck % 3) == 0) {
                countNumberDiv3++;
            }
            if ((numberForCheck % 4) == 0) {
                countNumberDiv4++;
            }
        }

        countNumberDiv2 = (countNumberDiv2 / number) * 100;
        countNumberDiv3 = (countNumberDiv3 / number) * 100;
        countNumberDiv4 = (countNumberDiv4 / number) * 100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n", countNumberDiv2, countNumberDiv3, countNumberDiv4);
    }
}
