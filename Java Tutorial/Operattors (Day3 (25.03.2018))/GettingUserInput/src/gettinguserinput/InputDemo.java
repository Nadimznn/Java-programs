//User Input, how can we use that?
package gettinguserinput;

import java.util.Scanner;

public class InputDemo {
    
    //Another shortcurt to create a main class just write "psvm" and then push 'Tab' button.
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int Number;
        double Number1;
        float Number2;
        String Name;
        
        /*for Integer:-*/
        Number = input.nextInt();
        /*Shortcut to write print method just write "sout" and push 'Tab' button.*/ 
        System.out.println("Integer Number is : "+Number);
        /**for double*/
        Number1 = input.nextDouble();
        System.out.println("Double Number1 is : "+Number1);
        /**for Float*/
        Number2 = input.nextFloat();
        System.out.println("Float Number2 is : "+Number2);
        /*For String*/
        Name = input.next();
        System.out.println("String Name is"+Name);
        Name = input.nextLine();
        System.out.println("String Name is"+Name);
        /* We use next for getting a output just one word and full input is going to show output uses
        of nextLine.*/
        
        
    }
    
}
