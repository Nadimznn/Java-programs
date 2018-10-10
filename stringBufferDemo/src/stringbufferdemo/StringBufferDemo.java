
package stringbufferdemo;

public class StringBufferDemo {

    public static void main(String[] args) {
        //Variable Declaretion and using string in String Buffer.
        String s1 = "Zannatul Naim";
        StringBuffer s = new StringBuffer(s1);
        System.out.println(s);
        //in append method we can add any kind of variable in any dataType.
        s.append(" Nadim");
        System.out.println(s);
        s.append(25);
        System.out.println(s);
        //in this reverse method then reverse that any variables.
        s.reverse();
        System.out.println(s);
        
        
        s.reverse();
        System.out.println(s);
        
        //s.delete(1, 3);
        //System.out.println(s);
        //and last setlength set 0 to 4 index in print out.  
        s.setLength(5);
        System.out.println(s);
    }
    
}
