import java.util.Scanner;

public class P08MeasureConverter {
    public static void main(String[] args) {
        double meterToMm = 1000.0;
        double meterToCm = 100.0;
        double meterToMile = 0.000621371192;
        double meterToInch = 39.3700787;
        double meterToKm = 0.001;
        double meterToFeet = 3.2808399;
        double meterToYard = 1.0936133;

        Scanner console = new Scanner(System.in);

        double inputValue = Double.parseDouble(console.nextLine());
        String inputMeasure = console.nextLine();
        String outputMeasure = console.nextLine();
        double result = 0.0;

        if (inputMeasure.equals("m")) {
            result = inputValue;
        } else if (inputMeasure.equals("mm")) {
            result = inputValue / meterToMm;
        } else if (inputMeasure.equals("cm")) {
            result = inputValue / meterToCm;
        } else if (inputMeasure.equals("mi")) {
            result = inputValue / meterToMile;
        } else if (inputMeasure.equals("in")) {
            result = inputValue / meterToInch;
        } else if (inputMeasure.equals("km")) {
            result = inputValue / meterToKm;
        } else if (inputMeasure.equals("ft")) {
            result = inputValue / meterToFeet;
        } else if (inputMeasure.equals("yd")) {
            result = inputValue / meterToYard;
        }

        if (outputMeasure.equals("m")) {
            result = result;
        }
        if (outputMeasure.equals("mm")) {
            result = result * meterToMm;
        }
        if (outputMeasure.equals("cm")) {
            result = result * meterToCm;
        }
        if (outputMeasure.equals("mi")) {
            result = result * meterToMile;
        }
        if (outputMeasure.equals("in")) {
            result = result * meterToInch;
        }
        if (outputMeasure.equals("km")) {
            result = result * meterToKm;
        }
        if (outputMeasure.equals("ft")) {
            result = result * meterToFeet;
        }
        if (outputMeasure.equals("yd")) {
            result = result * meterToYard;
        }

        System.out.printf("%.8f %s", result, outputMeasure);
    }
}
