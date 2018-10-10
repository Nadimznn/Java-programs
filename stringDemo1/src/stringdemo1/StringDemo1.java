package stringdemo1;

public class StringDemo1 {

    public static void main(String[] args) {
        String s1 = "Zannatul Naim Nadim";
        String s2;
        s2 = new String("Sharmin Akhter");
        String s3 = new String("zannatul Naim Nadim");

        char[] s4 = {'S', 'H', 'A', 'R', 'M', 'I', 'N'};
        System.out.println(s4);
        System.out.println("s1 = " + s1 + ".");
        System.out.println("s2 = " + s2 + ".");
        System.out.println("s3 = " + s3);

        int len = s1.length();
        System.out.println("Length of s1 = " + len);

        if (s1 == s3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        if (s1.equals(s3)) {
            System.out.println("Equal");

        } else {
            System.out.println("Not equal");
        }
        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("Equal");

        } else {
            System.out.println("Not equal");
        }
        
        boolean con = s1.contains("Naim");
        System.out.println(con);
        
        boolean check = s2.isEmpty();
        System.out.println(check);
                  
        

    }

}
