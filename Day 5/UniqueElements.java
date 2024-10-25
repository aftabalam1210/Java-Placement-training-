import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Get unique elements using a Set
        Set<Integer> uniqueSet = getUniqueElements(array);

        // Output the unique elements
        System.out.println("Unique elements:");
        for (int element : uniqueSet) {
            System.out.print(element + " ");
        }
    }

    public static Set<Integer> getUniqueElements(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();

        // Add elements to the set (duplicates will be ignored)
        for (int num : array) {
            uniqueSet.add(num);
        }

        return uniqueSet;
    }
}
