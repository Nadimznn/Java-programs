
package temparatureconverter;

import java.util.Scanner;

public class FarenhietToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Farenhiet, Celcius;
           //  double a = 5/9   ;
        
        System.out.println("Give the Value of Farenhiet = ");
        Farenhiet = input.nextDouble();
        
        Celcius = 0.56*Farenhiet-32;
        System.out.println("The Celcius is = "+Celcius);
        
        
        
    }
    
}
