import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
    }
}

public class CalculatorProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calc.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calc.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + calc.divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice! Please select again.");
            }
        }
    }
}
