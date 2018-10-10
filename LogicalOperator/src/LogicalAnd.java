
import java.util.Scanner;


public class LogicalAnd {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in); 
        char Character;
        System.out.print("Enter the Letter");
        Character = input.next().charAt(0);
        
        if(Character>='a'&&Character<='z'){//this is logical operator.
            System.out.println("Small Letter");
        } else if (Character>='A' && Character<='Z'){
                    System.out.println("Capital");
                    }else{
            System.out.println("This is not a Letter");
        }
    }
    
}
