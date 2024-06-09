package exceptionExample.simpleexception;
import java.util.Scanner;

public class Exception3 {
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        
        try {
            int result = divide(numerator, denominator);
            System.out.println("The result is: " + result);
        } 
	catch (ArithmeticException e) {
            System.out.println("divide by zero.");
        } 
	finally {
            scanner.close();
        }
    }
     public static int divide(int a, int b) {
        return a/b;
   }

}
