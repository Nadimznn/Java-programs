
import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Give a Positive Value");
        a = input.nextInt();
        
        if(a%2==0){
            System.out.println("This is Even Number");
            
        }
        else if(a%2==1){
            System.out.println("This is Odd Number");
        }
    }
    
}
