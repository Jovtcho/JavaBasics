import java.util.Scanner;

public class P13Stop3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        String point;
        String underscore;
        long start = System.currentTimeMillis();

//First row
        point = new String(new char[number + 1]).replace('\0', '.');
        underscore = new String(new char[2 * number + 1]).replace('\0', '_');
        System.out.printf("%s%s%s%n", point, underscore, point);

//Upper half
        for (int j = 1; j <= number; j++) {
            point = new String(new char[number + 1 - j]).replace('\0', '.');
            underscore = new String(new char[2 * (number + j) - 3]).replace('\0', '_');
            System.out.printf("%s//%s\\\\%s%n", point, underscore, point);
        }

//Stop row
        underscore = new String(new char[2 * number - 3]).replace('\0', '_');
        System.out.printf("//%sSTOP!%s\\\\%n", underscore, underscore);

//Below STOP row
        underscore = new String(new char[4 * number - 1]).replace('\0', '_');
        System.out.printf("\\\\%s//%n", underscore);

//Lower half
        for (int j = 1; j < number; j++) {
            point = new String(new char[j]).replace('\0', '.');
            underscore = new String(new char[2 * (2 * number - j) - 1]).replace('\0', '_');
            System.out.printf("%s\\\\%s//%s%n", point, underscore, point);
        }
        long end = System.currentTimeMillis();
        System.out.println("Concatenation = " + ((end - start)) + " millisecond");
    }
}
