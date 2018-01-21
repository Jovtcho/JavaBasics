import java.util.Scanner;

public class P13FiguresArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String figure = console.nextLine();
        double figureArea = 0.0;

        if ("square".equalsIgnoreCase(figure)) {
            double a = Double.parseDouble(console.nextLine());
            figureArea = a * a;
        } else if ("rectangle".equalsIgnoreCase(figure)) {
            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());
            figureArea = a * b;
        } else if ("circle".equalsIgnoreCase(figure)) {
            double a = Double.parseDouble(console.nextLine());
            figureArea = Math.PI * a * a;
        } else if ("triangle".equalsIgnoreCase(figure)) {
            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());
            figureArea = a * b / 2;
        }

        System.out.printf("%.3f%n", figureArea);
    }
}