import java.util.Scanner;

public class Movezero {
    public static int[] moveZeros(int n, int[] a) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }

        while (j < n) {
            a[j++] = 0;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc. nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
