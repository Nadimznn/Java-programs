
public class PalindromeDemo {

    public static void main(String[] args) {
        String s1 = "212";
        StringBuffer sb = new StringBuffer(s1);

        System.out.println("sb= " + sb);

        String s2 = sb.reverse().toString();
        System.out.println("s2= " + s2);

        if (s1.equals(s2)) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }

}
