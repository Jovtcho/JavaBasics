import java.util.Scanner;

public class P06Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());

        int levs = (int) Math.floor(change);
        //double test = change - levs;
        int stotinki = (int) Math.round((change - levs) * 100);
        int coins = 0;

        if (levs % 2 == 0) {
            coins = levs / 2;
        } else {
            coins = levs / 2 + 1;
        }

        while (stotinki > 0) {
            if (stotinki >= 50) {
                coins++;
                stotinki -= 50;
            } else if (stotinki >= 20) {
                coins++;
                stotinki -= 20;
            } else if (stotinki >= 10) {
                coins++;
                stotinki -= 10;
            } else if (stotinki >= 5) {
                coins++;
                stotinki -= 5;
            } else if (stotinki >= 2) {
                coins++;
                stotinki -= 2;
            } else {
                coins++;
                stotinki -= 1;
            }
        }

        System.out.println(coins);
    }
}