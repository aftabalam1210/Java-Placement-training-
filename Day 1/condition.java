import java.util.Scanner;
public class condition {
    //wap to convert marks into grade.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENter number");
        int n = scan.nextInt();

        if(n > 85){
            System.out.println("A grade");
        }else if(n>75 && n<85){
            System.out.println("B grade");

        } else if (n>65 && n<75) {
            System.out.println("C is grade");

        }else {
            System.out.println("D grade");
        }

    }
}
