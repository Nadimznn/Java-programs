
package reverse;

import java.util.Scanner;

public class Reverse {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num,temp;
        System.out.println("Enter Any Number= ");
        num = input.nextInt();
        temp = num;
        int sum=0;
        
       while(temp!=0){
          int r= temp%10;
           sum = sum*10+r;
          temp= temp/10;
       }
        System.out.println("The Reverse of this number= "+sum);
    }
    
    
}
