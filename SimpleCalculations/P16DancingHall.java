import java.util.Scanner;

public class P16DancingHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancerPlaceArea = 40;       // centimeters2
        int dancerMovementArea = 7000;  // centimeters2

        double hallLength = Double.parseDouble(scanner.nextLine());
        double hallWidth = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());

        double hallArea = (hallLength * 100) * (hallWidth * 100);
        double benchArea = hallArea / 10.0;
        double wardrobeArea = (wardrobeSide * 100) * (wardrobeSide * 100);
        double usefulHallArea = hallArea - (benchArea + wardrobeArea);

        int dancerCount = (int) Math.floor(usefulHallArea / (dancerPlaceArea + dancerMovementArea));

        System.out.println(dancerCount);
    }
}
