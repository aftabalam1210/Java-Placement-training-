import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();

        // Use '==' for comparison
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }

        scan.close(); // Close the scanner to avoid resource leaks
    }
}
