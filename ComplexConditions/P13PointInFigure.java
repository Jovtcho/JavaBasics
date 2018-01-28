import java.util.Scanner;

/**
 * Created by Jo on 1/25/2017.
 */
public class P13PointInFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int blockSize = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        int firstRectangleX1 = 0;
        int firstRectangleY1 = blockSize;
        int firstRectnagleX2 = 3 * blockSize;
        int firstRectangleY2 = 0;

        int secondRectangleX1 = blockSize;
        int secondRectangleY1 = 4 * blockSize;
        int secondRectnagleX2 = 2 * blockSize;
        int secondRectangleY2 = blockSize;

        boolean checkFirstRectangleIn = ((firstRectangleX1 < x) && (x < firstRectnagleX2) && (firstRectangleY2 < y) && (y < firstRectangleY1));
        boolean checkSecondRectangleIn = ((secondRectangleX1 < x) && (x < secondRectnagleX2) && (secondRectangleY2 < y) && (y < secondRectangleY1));
        boolean checkLineIn = ((secondRectangleX1 < x) && (x < secondRectnagleX2) && (y == secondRectangleY2));

        boolean checkFirstRectangleOut = ((firstRectangleX1 > x) || (x > firstRectnagleX2) || (firstRectangleY2 > y) || (y > firstRectangleY1));
        boolean checkSecondRectangleOut = ((secondRectangleX1 > x) || (x > secondRectnagleX2) || (secondRectangleY2 > y) || (y > secondRectangleY1));

        if (checkFirstRectangleIn || checkSecondRectangleIn || checkLineIn) {
            System.out.println("inside");
        } else if (checkFirstRectangleOut && checkSecondRectangleOut) {
            System.out.println("outside");
        } else {
            System.out.println("border");
        }
    }
}

