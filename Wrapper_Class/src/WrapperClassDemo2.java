
public class WrapperClassDemo2 {

    public static void main(String[] args) {

        //Primitive to String
        int i = 123;
        String s = Integer.toString(i);
        System.out.println("s = " + i);

        double d = 10.23;
        String m = Double.toString(d);
        System.out.println("m = " + m);

        //String to primitive
        String s1 = "151";
        int a = Integer.valueOf(s1);
        System.out.println("a = " + s1);

        //String s2 = "100.12";
        double e = Double.parseDouble(s1);
        System.out.println("e = " + e);

    }

}
