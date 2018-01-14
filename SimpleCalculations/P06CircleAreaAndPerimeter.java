import java.util.Scanner;

public class P06CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());
        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;

        System.out.printf("Area = %.13f%n", circleArea);
        System.out.printf("Perimeter = %.13f", circlePerimeter);
    }
}
