
package test_assignment;


public class Test_Assignment {


    public static void main(String[] args) {
        String firstName;
        firstName="Zannatul Naim";
        String lastName;
        lastName="Nadim";
        
        String fullName;
        fullName=firstName+lastName;
        System.out.println("Hello, my name is "+fullName+".");
        
        int A=fullName.length();
        System.out.println("There are "+A+" letters in my name.");
        
        int B=firstName.length()+lastName.length();
        System.out.println("There are "+B+" letters in my name.");
        

    }
    
}
