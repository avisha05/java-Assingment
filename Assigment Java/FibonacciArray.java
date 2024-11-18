import java.util.Scanner;

public class FibonacciArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of Fibonacci terms to display: ");
        int n = scanner.nextInt();

       
        int[] fibonacci = new int[n];

       
        if (n > 0) {
            fibonacci[0] = 0; 
        }
        if (n > 1) {
            fibonacci[1] = 1; 
        }

        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        
        System.out.println("The first " + n + " terms of the Fibonacci sequence are:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        
        scanner.close();
    }
}

