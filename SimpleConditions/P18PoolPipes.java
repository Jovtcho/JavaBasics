import java.text.DecimalFormat;
import java.util.Scanner;

public class P18PoolPipes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int poolCapacity = Integer.parseInt(console.nextLine());
        int pipeCapacity1 = Integer.parseInt(console.nextLine());
        int pipeCapacity2 = Integer.parseInt(console.nextLine());
        double time = Double.parseDouble(console.nextLine());
        double poolFull = time * (pipeCapacity1 + pipeCapacity2);

        if (poolCapacity >= poolFull) {
            double poolFullPercent = Math.floor(poolFull / poolCapacity * 100);
            double pipe1Percent = Math.floor((time * pipeCapacity1 / poolFull) * 100);
            double pipe2Percent = Math.floor((time * pipeCapacity2 / poolFull) * 100);
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.", poolFullPercent, pipe1Percent, pipe2Percent);
        } else {
            double poolOverFlow = poolFull - poolCapacity;
            System.out.printf("For %.1f hours the pool overflows with %.1f liters.", time, poolOverFlow);
        }
    }
}
