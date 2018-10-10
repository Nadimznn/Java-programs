
package factorial_number;

import java.util.Scanner;


public class Factorial_Number {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,fact=1;
        System.out.print("Give the positive value of n= ");
        n = input.nextInt();
        for (int i=n; i>=1; i--) {
            fact=fact*i;
            System.out.print(i+" ");
            System.out.println();
        }
        System.out.print(fact);
        
    }
    
    
}
