
package numberof.digits;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number ");;
        int n=input.nextInt();
        int temp,r,sum=0;
         temp=n;
         while(temp!=0){
         r=temp%10;
         sum=sum+r;
         temp=temp/10;
         }
         System.out.println("Sum of your digits are "+sum);

    }
    
}
