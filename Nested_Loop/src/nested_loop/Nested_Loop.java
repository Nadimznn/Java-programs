
package nested_loop;

import java.util.Scanner;

public class Nested_Loop {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1,num2;
        System.out.print("Enter the First Number= ");
        num1=input.nextInt();
        System.out.print("Enter the Last Number= ");
        num2=input.nextInt();
        
        System.out.println("The Multiplication table of those are==\n");
        for (int i=num1;i<=num2;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" X "+j + " = "+i*j);
            }
            System.out.println("\n \n"); 
        }
       
    }
    
}
