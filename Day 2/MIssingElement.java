//given array of size n-1 such it contains the integeer in lenght of 1 to n. find the missing elemnt.
// ex n=5, arr={1 2 3 5} output 4;

import java.util.*;
import java. util.Scanner;
import java. util.Arrays;
public class MIssingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] ={1,2,3,4,6};
        int n = arr.length +1;

        int expectedSum = n * (n + 1) / 2;
        int actualsum = 0;
        for(int x : arr){
            actualsum+=x;
        }

        int difference =expectedSum - actualsum;
        System.out.println("The missing value is "+difference);
    }
}
