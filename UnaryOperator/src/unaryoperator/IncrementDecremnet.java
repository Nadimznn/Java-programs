
package unaryoperator;

public class IncrementDecremnet {
    /*
    Now Increment and Decrement both have two hand, that is-
    Prefix and Postfix.
    ++a or --a is a prefix Increment or Decrement, In lieu of postfix is a++ or a--. 
    */
    
    public static void main(String[]args){
        int x = 10,y;
        y= x++; //This is Postfix Increment(That means Increment after getting the value).
        System.out.println(y);//x=10
        
        y=++x; //This is Prefix Increment(That means at first increment then show The value) .
        System.out.println(y);//x=12
        
        y=x--; //This is Postfix Decrement(That means Decrement after getting the value).
        System.out.println(y);//x=12
       
        y=--x; //This is Prefix Decrement(That means at first Decrement then show The value).
        System.out.println(y);//10
        
        //Checking 
        
//        y= ++x; //This is Postfix Increment(That means Increment after getting the value).
//        System.out.println(y);//x=10
//        
//        y=x++; //This is Prefix Increment(That means at first increment then show The value) .
//        System.out.println(y);//x=12
//        
//        y=x--; //This is Postfix Decrement(That means Decrement after getting the value).
//        System.out.println(y);//x=12
//       
//        y=--x; //This is Prefix Decrement(That means at first Decrement then show The value).
//        System.out.println(y);//10
        

        
        
    }
    
}
