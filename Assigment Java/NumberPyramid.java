import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of rows (n) from the user
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();

        // Print the number pyramid
        for (int i = 1; i <= n; i++) {
            // For each row, print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
