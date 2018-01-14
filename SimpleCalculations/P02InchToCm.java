import java.util.Scanner;

public class P02InchToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inchToCm = 2.54;
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * inchToCm;

        System.out.println(centimeters);
    }
}
