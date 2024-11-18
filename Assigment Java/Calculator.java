import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                continueCalculation = false;
            } else if (choice >= 1 && choice <= 4) {
               
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

               
                if (choice == 1) {
                    System.out.println("Result: " + (num1 + num2));
                } else if (choice == 2) {
                    System.out.println("Result: " + (num1 - num2));
                } else if (choice == 3) {
                    System.out.println("Result: " + (num1 * num2));
                } else if (choice == 4) {
                  
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
            } else {
                System.out.println("Invalid choice! Please select a valid option from the menu.");
            }
        }
        scanner.close();
    }
}
