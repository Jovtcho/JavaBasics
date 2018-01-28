import java.util.Scanner;

public class P06OnRectangleBorder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        boolean checkX = ((x == x1) && (y1 <= y) && (y <= y2)) || ((x == x2) && (y1 <= y) && (y <= y2));
        boolean checkY = ((y == y1) && (x1 <= x) && (x <= x2)) || ((y == y2) && (x1 <= x) && (x <= x2));

        if (checkX || checkY) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
