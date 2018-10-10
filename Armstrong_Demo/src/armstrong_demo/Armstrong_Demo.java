
package armstrong_demo;

import java.util.Scanner;

public class Armstrong_Demo {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, temp, sum=0, r;
        System.out.print("Enter The Number= ");
        num=input.nextInt();
        temp=num;
        
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp= temp/10;
            
        }System.out.println("Result"+sum);
        if(sum==num){
            System.out.print("This is the Armstrong");          
        }else{
            System.out.println("This is Not Armstrong");
        }

    }
    
}
