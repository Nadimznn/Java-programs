
package series_1;

import java.util.Scanner;

public class Series_1 {

    public static void main(String[] args) //1+2+3+....+n
             
    {
        Scanner input = new Scanner(System.in);
        int Result=0,i, n;
        System.out.print("Give The Last Number = ");
        n = input.nextInt();
        
        for ( i = (int) 1; i <=n; i++) {
            Result= Result+i*i;
            System.out.print(i+"X"+i+" ");
            
        }
        System.out.println();
        System.out.print("The Sum of These Numbers: = "+Result);
    
        
        }
        
    }
    

