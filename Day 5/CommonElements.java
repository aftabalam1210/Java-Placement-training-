import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        // Input the elements of the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the size of the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        // Input the elements of the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Find common elements using a HashMap
        findCommonElements(array1, array2);
    }

    public static void findCommonElements(int[] array1, int[] array2) {
        Map<Integer, Boolean> map = new HashMap<>();

        // Store elements of the first array in the HashMap
        for (int num : array1) {
            map.put(num, true);
        }

        // Check for common elements in the second array
        System.out.println("Common elements:");
        boolean foundCommon = false;
        for (int num : array2) {
            if (map.containsKey(num)) {
                System.out.print(num + " ");
                foundCommon = true;
            }
        }

        if (!foundCommon) {
            System.out.println("No common elements found.");
        }
    }
}
