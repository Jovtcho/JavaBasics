import java.text.DecimalFormat;
import java.util.Scanner;

public class P07RectangleAreaInPlane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#############");

        double point1x = Double.parseDouble(scanner.nextLine());
        double point1y = Double.parseDouble(scanner.nextLine());
        double point2x = Double.parseDouble(scanner.nextLine());
        double point2y = Double.parseDouble(scanner.nextLine());

        double length = Math.abs(point1x - point2x);
        double width = Math.abs(point1y - point2y);

        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        System.out.printf("%s%n", df.format(rectangleArea));
        System.out.printf("%s", df.format(rectanglePerimeter));
    }
}
