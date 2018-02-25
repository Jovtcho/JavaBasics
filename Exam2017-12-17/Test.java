import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = Double.parseDouble(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());
        String isMember = scanner.nextLine();
        int currentYear = 0;
        double maxSalary = 5000.0;

        while (salary <= maxSalary) {
            currentYear++;
            double increase = salary * 6 / 100;
            salary += increase;
            if (currentYear % 10 == 0) {
                salary += 200;
            } else if (currentYear % 5 == 0) {
                salary += 100;
            } else {
                if ("yes".equalsIgnoreCase(isMember) && salary < maxSalary) {
                    salary -= salary * 1 / 100;
                }
            }

            if (salary > maxSalary) {
                break;
            }

            if (currentYear == years) {
                System.out.printf("Current salary: %.2f%n", salary);
            }
        }

        int leftYears = currentYear - years - 1;

        if (leftYears < 0) {
            System.out.printf("Current salary: %.2f%n", maxSalary);
            leftYears = 0;
        }

        System.out.printf("%d more years to max salary.", leftYears);

    }
}
