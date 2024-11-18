import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long fact = 1;
        for (int i = 1; i <= num; i++) 
        {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);

       
        int sum = 0;
        while (fact > 0) {
            sum += fact % 10;  
            fact /= 10;        
        }

        
        System.out.println("Sum of digits of the factorial: " + sum);

       
        scanner.close();
    }
}
