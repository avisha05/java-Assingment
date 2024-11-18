import java.util.Scanner;

public class InvertedNumberTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of rows (n) from the user
        System.out.print("Enter the number of rows for the inverted triangle: ");
        int n = scanner.nextInt();

        // Print the inverted triangle
        for (int i = n; i >= 1; i--) {
            // Print numbers from i down to 1 for each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
