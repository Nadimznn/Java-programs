
import java.util.Scanner;


public class ElseIfLadder {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        int GetNumber;
        GetNumber = input.nextInt();
        if(GetNumber>=80){
        System.out.println("Your Grade is 'A+' " +GetNumber+ " Welcome,");
    }        
        else if(GetNumber>=60){
        System.out.println("Your Grade is 'B+' " +GetNumber+ " Welcome,");
        }
        else if(GetNumber>=50){
        System.out.println("Your Grade is 'C+' " +GetNumber+ " Welcome,");
        }
        else if(GetNumber>=40){
        System.out.println("Your Grade is 'D', " +GetNumber+ " Welcome,");
        }
        else if(GetNumber<=33){
        System.out.println("Your Grade is 'F' " +GetNumber+ " Better Luck Next Time,");
        }
    }
}
