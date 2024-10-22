import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        int arr[] = {8,5,7,9,6,47,25,26};
        arr[3] = 4;// updation
        for(int x : arr){
            System.out.println(x);
        }

        //insertion at first arr[0]= value;

        //insertion at end

        int size = arr.length;
        System.out.println(size);
        arr[size] = 987;
        for(int x : arr){
            System.out.println(x);
        }





    }
}
