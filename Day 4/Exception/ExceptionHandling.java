package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter second integer: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result is " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

