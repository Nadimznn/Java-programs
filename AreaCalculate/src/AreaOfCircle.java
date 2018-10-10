
import java.util.Scanner;


public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Radius, Area, Pie=3.1416;
        System.out.print("Enter The Radius = ");
        Radius = input.nextDouble();
        
        Area = Pie*Radius*Radius;
        System.out.println("The Area Of Circle is ="+Area);
        
        
    }
    
}
