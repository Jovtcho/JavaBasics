import java.util.Scanner;

public class P06Coins1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int coinsCounter = 0;

        int lev = (int) Math.floor(change);
        coinsCounter = lev / 2;
        if (lev  % 2 != 0) {
            coinsCounter++;
        }

        int stotinki = (int) Math.round((change - lev) * 100);

        while (stotinki >= 50) {
            stotinki -= 50;
            coinsCounter++;
        }

        while (stotinki >= 20) {
            stotinki -= 20;
            coinsCounter++;
        }

        while (stotinki >= 10) {
            stotinki -= 10;
            coinsCounter++;
        }

        while (stotinki >= 5) {
            stotinki -= 5;
            coinsCounter++;
        }

        while (stotinki >= 2) {
            stotinki -= 2;
            coinsCounter++;
        }

        while (stotinki >= 1) {
            stotinki -= 1;
            coinsCounter++;
        }

        System.out.println(coinsCounter);
    }
}
