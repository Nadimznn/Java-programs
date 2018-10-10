
package testsakib;

import java.util.Scanner;


public class TestSakib {

    public static void main(String[] args) {
        Scanner onlineData = new Scanner(System.in);
        System.out.println("You enter here only 5 variables");
        int a,b,c,d,e;
        System.out.print("Enter first variable ");
        a = onlineData.nextInt();
        System.out.print("Enter Second variable ");
        b = onlineData.nextInt();
        System.out.print("Enter third variable ");
        c = onlineData.nextInt();
        System.out.print("Enter fourth variable ");
        d = onlineData.nextInt();
        System.out.print("Enter fifth variable ");
        e = onlineData.nextInt();
        
        int Sum= (a+b+c+d+e);
        int avg= Sum/5;
        System.out.println("Total Summation is "+Sum);
        System.out.println("Total variable average is "+avg);
        
    }
    
}
