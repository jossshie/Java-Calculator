import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying operation choices to the use
        
                // Displaying operation choices to the user
                System.out.println("Select an operation:");
                System.out.println("1: Addition (+)");
                System.out.println("2: Subtraction (-)");
                System.out.println("3: Multiplication (*)");
                System.out.println("4: Division (/)");
        
                // Getting the user's operation choice
                int operation = scanner.nextInt();


                if (operation == 0 || operation > 4) {
                    System.out.println("Exit");
                    System.exit(0); // Exiting the program
                }
        
        
                // Getting the two numbers from the user
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
        
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
        
                double result;
        
                // Performing the calculation based on the user's choice
                if (operation == 1) {
                    // Addition
                    result = num1 + num2;
                } else if (operation == 2) {
                    // Subtraction
                    result = num1 - num2;
                } else if (operation == 3) {
                    // Multiplication
                    result = num1 * num2;
                } else if (operation == 4) {
                    // Division
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        scanner.close();
                        return;
                    }
                } else {
                    // Invalid operation
                    System.out.println("Invalid operation selected.");
                    scanner.close();
                    return;
                }
        
                // Checking if the result is a whole number
                if (result % 1 == 0) {
                    System.out.println("Result: " + (int) result);
                } else {
                    System.out.println("Result: " + result);
                }
        
                scanner.close();
            }
        }