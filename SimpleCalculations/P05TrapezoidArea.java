import java.util.Scanner;

public class P05TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bottomBase = Double.parseDouble(scanner.nextLine());
        double topBase = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double trapezoidArea = (bottomBase + topBase) * height / 2;

        System.out.println(trapezoidArea);
    }
}
