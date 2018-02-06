import java.util.Scanner;

public class P13Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;

        for (int i = 0; i < number; i++) {
            int numberForCheck = Integer.parseInt(console.nextLine());
            if (numberForCheck < 200) {
                p1++;
            } else if (numberForCheck < 400) {
                p2++;
            } else if (numberForCheck < 600) {
                p3++;
            } else if (numberForCheck < 800) {
                p4++;
            } else {
                p5++;
            }
        }

        p1 = (p1 / number) * 100;
        p2 = (p2 / number) * 100;
        p3 = (p3 / number) * 100;
        p4 = (p4 / number) * 100;
        p5 = (p5 / number) * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", p1, p2, p3, p4, p5);
    }
}
