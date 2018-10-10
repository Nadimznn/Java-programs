
package executionsteps;

public class ExecutionSteps {


    public static void main(String[] args) {
         //Using some data types.
         boolean b;//variable declaration
        char c;
        byte m = 127;
        int i =10;//dynamic initialization.
        short s =32477;
        float f =100.3f;
        double d =10.23;
        
        
        b = true; // initializing variable.
//        System.out.println("b = "+b);
       c = 'a';// when we initialize a character vaiable, ensure that we get a '' symble (single quote).
//        System.out.println("c = "+c);
//        System.out.println("m = "+m);
//        System.out.println("i = "+i);
//        System.out.println("s = "+s);
//        System.out.println("f = "+f);
//        System.out.println("d = "+d);
        
        //using "Format spacifier"
        System.out.printf("b = %b\n",b);
        System.out.printf("c = %c\n",c);
        System.out.printf("m = %d\n",m);
        System.out.printf("i = %d\n",i);
        System.out.printf("s = %d\n",s);
        System.out.printf("f = %.10f\n",f);
        System.out.printf("d = %.10f\n",d);

        
        
    }
    
}
