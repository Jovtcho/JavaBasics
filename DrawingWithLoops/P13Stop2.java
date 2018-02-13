import java.util.Scanner;

public class P13Stop2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        String point;
        String underscore;
        long start = System.currentTimeMillis();

//First row
        point = String.format("%0" + (number + 1) + "d", 0).replace('0', '.');
        underscore = String.format("%0" + (2 * number + 1) + "d", 0).replace('0', '_');
        System.out.printf("%s%s%s%n", point, underscore, point);

//Upper half
        for (int j = 1; j <= number; j++) {
            point = String.format("%0" + (number + 1 - j) + "d", 0).replace('0', '.');
            underscore = String.format("%0" + (2 * (number + j) - 3) + "d", 0).replace('0', '_');
            System.out.printf("%s//%s\\\\%s%n", point, underscore, point);
        }

//Stop row
        underscore = String.format("%0" + (2 * number - 3) + "d", 0).replace('0', '_');
        System.out.printf("//%sSTOP!%s\\\\%n", underscore, underscore);

//Below STOP row
        underscore = String.format("%0" + (4 * number - 1) + "d", 0).replace('0', '_');
        System.out.printf("\\\\%s//%n", underscore);

//Lower half
        for (int j = 1; j < number; j++) {
            point = String.format("%0" + j + "d", 0).replace('0', '.');
            underscore = String.format("%0" + (2 * (2 * number - j) - 1) + "d", 0).replace('0', '_');
            System.out.printf("%s\\\\%s//%s%n", point, underscore, point);
        }
        long end = System.currentTimeMillis();
        System.out.println("Concatenation = " + ((end - start)) + " millisecond") ;
    }
}
