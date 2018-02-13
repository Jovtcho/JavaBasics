import java.util.Scanner;

public class P11DrawFort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fortSize = Integer.parseInt(scanner.nextLine());
        int halfFortSize = fortSize / 2;

// First row
        System.out.print("/" + draw("^", halfFortSize) + "\\");
        if (fortSize % 2 != 0) {
            System.out.print(draw("_", fortSize - 3));
        } else {
            System.out.print(draw("_", fortSize - 4));
        }
        System.out.println("/" + draw("^", halfFortSize) + "\\");

//Middle rows
        for (int i = 0; i < fortSize - 3; i++) {
            System.out.println("|" + draw(" ", 2 * fortSize - 2) + "|");
        }

//Before last row
        System.out.print("|" + draw(" ", halfFortSize + 1));
        if (fortSize % 2 != 0) {
            System.out.print(draw("_", fortSize - 3));
        } else {
            System.out.print(draw("_", fortSize - 4));
        }
        System.out.println(draw(" ", halfFortSize + 1) + "|");

//Last row
        System.out.print("\\" + draw("_", halfFortSize) + "/");
        if (fortSize % 2 != 0) {
            System.out.print(draw(" ", fortSize - 3));
        } else {
            System.out.print(draw(" ", fortSize - 4));
        }
        System.out.println("\\" + draw("_", halfFortSize) + "/");
    }

    public static String draw(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}