
package prime_number;

import java.util.Scanner;


public class Prime_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Any Number= ");
        int num=input.nextInt();
        int count=0;
        
        
        for(int i=2; i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
            if(count==0){
            System.out.println("This is a prime Number");
            }else{
                    System.out.println("This is not a prime number");
                   }
            }
            }
        

