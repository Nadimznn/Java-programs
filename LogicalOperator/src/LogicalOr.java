
import java.util.Scanner;


public class LogicalOr {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        char Character;//We use only character so data type is character.
        System.out.print("Give any Letter : ");
        Character = input.next().charAt(0);//For showing index value which is assign in input wwe use charAt(0) that meansthe input is in 0 index.
        if(Character=='a'||Character=='e'||Character=='i'||Character=='o'||Character=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonent");
        }
    }
    
}
