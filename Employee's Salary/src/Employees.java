
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
public class Employees {

    Scanner input = new Scanner(System.in);
    private int Id;
    private String Name;
    private int Basic_Salary;
    private int House_Rent;
    private int Month_Salary;

    public Employees( int Id, String Name, int Basic_Salary, int House_Rent ) {
        this.Id = Id;
        this.Name = Name;
        this.Basic_Salary = Basic_Salary;
        this.House_Rent = House_Rent;

    }
     public void Input_Employee(){
        System.out.println("Enter your Id:");
        Id = input.nextInt();
        System.out.println("Enter your Name:");
        Name = input.next();
        System.out.println("Enter your Basic_Salary:");
        Basic_Salary = input.nextInt();
        System.out.println("Enter your House_Rent:");
        House_Rent = input.nextInt();
}
    public void HouseRent_Calculate() {
        if (Basic_Salary > 20000) {
            House_Rent = ((Basic_Salary * 50) / 100);
        } else {
            House_Rent = ((Basic_Salary * 60) / 100);
        }
    }

    public void Display() {
        Month_Salary = (Basic_Salary + House_Rent);
        System.out.println("your Id: " + Id);
        System.out.println("your Name: " + Name);
        System.out.println("your Basic_Salary: " + Basic_Salary);
        System.out.println("your Month_Salary: " + Month_Salary);

    }

    public static void main(String[] args) {
        Employees nadim = new Employees(1, "Sam", 12000, 4000);
        nadim.HouseRent_Calculate();
        nadim.Display();

    }
}
