
public class WrapperClassDemo1 {

    public static void main(String[] args) {
        //primitive to object (AutoBoxing)
        int x = 100;

        Integer y = Integer.valueOf(x);
        /*we can similarly write that directly
        Integer y = x;
         */
        System.out.println("y = " + y);

        char a = '9';
        Character b = a;
        System.out.println("b = " + a);

        //Object to Primitive (Unboxing)
        Double d = 10.25;
        double c = d;
        System.out.println("c = " + d);

        Float f = new Float(2.03);
        float e = f.floatValue();
        System.out.println("e = " + e);

    }

}
