import java.util.Arrays;
import java.util.Scanner;

public class minimumelemt {
    // Find the kth minimum element in the array.
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 12, 109, 56, 34, 89};
        Arrays.sort(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Check if k is within the valid range
        if (k > 0 && k <= arr.length) {
            System.out.println("Kth smallest term is " + arr[k - 1]);
        } else {
            System.out.println("Invalid value for k. It should be between 1 and " + arr.length);
        }

        sc.close(); // Closing the Scanner
    }
}
