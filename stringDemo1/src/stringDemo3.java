
public class stringDemo3 {

    public static void main(String[] args) {

        String country = "     Bangladesh is    our Country       ";
        System.out.println("Country = " + country);

        country = country.trim();
        System.out.println("Country = " + country);

        int len = country.length();
        System.out.println("Length is = " + len);

        char ch = country.charAt(5);
        System.out.println("In index 5 there are = " + ch);

        int value = country.codePointAt(0);
        System.out.println("Value = " + value);

        int pos = country.indexOf('a');
        System.out.println("Index of A = " + pos);

        pos = country.lastIndexOf('u');
        System.out.println("Last Index of U = " + pos);

    }
}
