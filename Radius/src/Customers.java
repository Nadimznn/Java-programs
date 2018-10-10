
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Customers {
    Scanner input = new Scanner(System.in);
    double discount;
    double display;
    double total_bill;
    int ID;
    String Name;
    int bill;
    
    public Customers( ){
        System.out.println("Enter Customers Id No:");
        ID=input.nextInt();
        System.out.println("Enter Customers Name:");
        Name=input.next();
        System.out.println("Enter Customers bill:");
        bill=input.nextInt();
    }
    public void discount(){
        if(bill>=2000){
            discount=((bill*10)/100);
        }
        else{
            discount=0;
        }
    }
    public void display(){
        total_bill= (bill-discount);
        System.out.println("Customers Id No is:"+ID);
        System.out.println("Customers Name:"+Name);
        System.out.println("Customers total bill:"+total_bill);
    }
    public static void main(String[] args){
        
        Customers user = new Customers(); 
        user.discount();
        user.display();
                
    }
}
