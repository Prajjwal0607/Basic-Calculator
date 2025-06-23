import java.util.*;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Divide by zero error");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;

        while (cont) {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                cont = false;
                System.out.println("calculator closed");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double res = 0;

            switch (choice) {
                case 1:
                    res = add(num1, num2);
                    System.out.println("Result: " + res);
                    break;
                case 2:
                    res = subtract(num1, num2);
                    System.out.println("Result: " + res);
                    break;
                case 3:
                    res = multiply(num1, num2);
                    System.out.println("Result: " + res);
                    break;
                case 4:
                    res = divide(num1, num2);
                    System.out.println("Result: " + res);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
