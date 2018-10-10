
import java.util.Scanner;


public class ElseStatements {
    public static void main(String[]args){
        Scanner get = new Scanner(System.in);
        int variable;
        variable = get.nextInt();
        if(variable>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
    
}
