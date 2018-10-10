
import java.util.Scanner;


public class CelciusToFarenhiet {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double Celcius, Farenhiet;
        System.out.println("Give the Celcius value = ");
        Celcius = input.nextDouble();
        
        Farenhiet = 1.8*Celcius+32;
        System.out.println("The Farenhiet Value is = "+Farenhiet);
    }
           
    
}
