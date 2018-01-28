import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Jo on 1/30/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
        int bitcoin = Integer.parseInt(console.nextLine());
        double yuan = Double.parseDouble(console.nextLine());
        double commission = Double.parseDouble(console.nextLine());
        double euro = 0;

        double bitcoinToLev = bitcoin * 1168.0;
        double yuanToDollar = yuan * 0.15;
        double dollarToLev = yuanToDollar * 1.76;
        double euroToLev = 1.95;

        euro = (bitcoinToLev + dollarToLev) / euroToLev;
        euro -=   (euro * commission / 100);
//        System.out.println(euro);
        System.out.printf("%s", decimalFormat.format(euro));
    }
}
