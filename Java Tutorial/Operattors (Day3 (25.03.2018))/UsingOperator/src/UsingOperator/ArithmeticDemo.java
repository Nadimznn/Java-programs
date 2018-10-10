package UsingOperator;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
//        int a,b,c;
//        a=20;
//        b=15;
//        
//        c=a+b;
//        System.out.println("Summation is = "+c);
//        
//        c=a-b;
//        System.out.println("Summation is = "+c);
//        
//        c=a*b;
//        System.out.println("Summation is = "+c);
//        
//        c=a/b;
//        System.out.println("Summation is = "+c);
//       
//        c=a%b;
//        System.out.println("Summation is = "+c);
        
        
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("Enter a = ");
        a=input.nextInt();
        System.out.print("Enter b = ");
        b=input.nextInt();
        
        c=a+b;
        System.out.println("Summation = "+c);
        c=a-b;
        System.out.println("Subtraction = "+c);
        c=a*b;
        System.out.println("Multiplication = "+c);
        
        double c1 =(double) a/b;
        System.out.println("Division = "+c1);
        c=a%b;
        System.out.println("Remainder = "+c);
        
    }
    
    
    
}
