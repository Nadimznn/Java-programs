
import java.util.Scanner;


public class SwitchStatements {
    public static void main(String[] args) {
        Scanner Value = new Scanner(System.in);
        char ch;
        System.out.print("Enter The Value= ");
        ch=Value.next().charAt(0);
        
        switch (ch){
            case 'a':
                System.out.println("Vowel");
                break;
            
                case 'e':
                System.out.println("Vowel");
                break;
                case 'i':
                System.out.println("Vowel");
                break;
                case 'o':
                System.out.println("Vowel");
                break;
                case 'u':
                System.out.println("Vowel");
                break;
                default:
                System.out.println("Consonant");

                    
                        

    }
    }
}
