import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of rows (n) from the user
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int n = scanner.nextInt();

        // Initialize a variable to keep track of consecutive numbers
        int number = 1;

        // Generate Floyd's Triangle
        for (int i = 1; i <= n; i++) {
            // For each row, print i numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the number for the next print
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}

