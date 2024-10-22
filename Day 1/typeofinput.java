//given an input by user print the type of data given in input.
//for example if input is 4 print int type. if "hadad" print string.



import java.util.Scanner;
public class typeofinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            System.out.println("Int");}
        else if(sc.hasNextDouble()){
            System.out.println("Double");
        }
        else{
            System.out.println("String");
        }
    }



}


