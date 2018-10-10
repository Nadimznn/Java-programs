
import java.util.Scanner;


public class MaximumMinimum {
    public static void main (String [] args){
        Scanner input =new Scanner (System.in);
        int a, b;
        System.out.print("Give the Value of a");
        a=input.nextInt();
        System.out.print("Give the Value of b");
        b=input.nextInt();
        if(a>b){
            System.out.println("a is The maximum value" +a);
        }
        else{
            System.out.println("a is the minimum value" +a);
        }
        if(a<b){
            System.out.println("b is The maximum value" +b);
        }
        else{
            System.out.println("b is the minimum value" +b);
        }
        
    }
}
