
import java.util.Scanner;


public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Base;
        double Height;
        double Area;
        
        System.out.print("Enter The Base = ");
        Base = input.nextInt();
        
        System.out.print("Enter The Height = ");
        Height = input.nextDouble();
        
        
        Area = 0.5*Base*Height;
        
        System.out.println("The Area is = "+Area );
        
    }
    
}
