package driver;

import java.util.Scanner;

import operations.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Operation operation = null;
        OperationType[] operationTypes = OperationType.values();

        System.out.println("Choose arithmetic operation (0: Addition, 1: Subtraction, 2: Multiplication, 3: Division): ");
        int choice = scanner.nextInt();

        if (choice >= 0 && choice < operationTypes.length) {
            switch (operationTypes[choice]) {
                case ADDITION:
                    operation = new Addition();
                    break;
                case SUBTRACTION:
                    operation = new Subtraction();
                    break;
                case MULTIPLICATION:
                    operation = new Multiplication();
                    break;
                case DIVISION:
                    operation = new Division();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            if (operation != null) {
                System.out.println("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("Result: " + operation.calculate(num1, num2));
            }
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
