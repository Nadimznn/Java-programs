package StringBuilder;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Zannatul");
        s1.append(" Naim");
        System.out.println("S1 = " + s1);
        s1.append(" Nadim");
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);

        s1.setLength(5);
        System.out.println(s1);

    }

}
