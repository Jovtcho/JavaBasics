import java.util.Scanner;

public class P01SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter square side: ");
        double sideA = Double.parseDouble(scanner.nextLine());
        double squareArea = sideA * sideA;

        System.out.println(squareArea);
    }
}
