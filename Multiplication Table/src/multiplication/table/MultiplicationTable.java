
package multiplication.table;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i;
        
        System.out.println("Give The Value Of n= ");
        n=input.nextInt();
        for(i=1;i<=10;i++){
            
            System.out.println(n+" X "+i + " = "+n*i);
            
        }
    }
    
}
