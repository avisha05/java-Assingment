import java.util.Scanner;

public class SecondLargestNumber {

    // Method to find the second largest number in the array
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the largest and second largest numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = array[i];      // Update largest
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i]; // Update second largest
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of integers (n) from the user
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        // Declare an array to store the integers
        int[] numbers = new int[n];

        // Accept n integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find and display the second largest number
        int secondLargest = findSecondLargest(numbers);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number in the array.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }

        scanner.close();
    }
}


