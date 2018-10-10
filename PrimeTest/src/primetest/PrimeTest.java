
package primetest;

import java.util.Scanner;

public class PrimeTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,count=0,Total_Prime=0;
        System.out.println("Give The Value Of m= ");
        m = input.nextInt();
        System.out.println("Give the value Of n= ");
        n = input.nextInt();
        for (int i=m;i<=n;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
                Total_Prime++;
                       }
            count=0;
        }
        System.out.println("Numbers Of Total Prime= "+Total_Prime);
    }
    
}
