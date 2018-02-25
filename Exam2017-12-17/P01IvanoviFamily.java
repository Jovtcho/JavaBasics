import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P01IvanoviFamily {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double budget = Double.parseDouble(br.readLine());
        double firstChildPresentPrice = Double.parseDouble(br.readLine());
        double secondChildPresentPrice = Double.parseDouble(br.readLine());
        double thirdChildPresentPrice = Double.parseDouble(br.readLine());

        double allPresentsPrice = firstChildPresentPrice + secondChildPresentPrice + thirdChildPresentPrice;
        double leftMoney = budget - allPresentsPrice;
        double tax = leftMoney*1.0 * 10 / 100;

        double moneyForCharity = leftMoney - tax;

        System.out.printf("%.2f", moneyForCharity);
    }
}