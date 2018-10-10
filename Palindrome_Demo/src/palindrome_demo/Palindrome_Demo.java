
package palindrome_demo;
//If a reverse number will be the same of the main number then it called a palindrome number.

import java.util.Scanner;


public class Palindrome_Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum=0, temp, r;
        System.out.print("Enter Any Number: ");
        num = input.nextInt();
        
        temp=num;
        while(temp!=0){
            r = temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }if(sum==num){
            System.out.println("This is palindrome number");
        }else{
            System.out.println("This is not a Palindrome Number");
        }
    }
    
}
