package stringdemo1;

public class stringDemo2 {

    public static void main(String[] args) {
        String firstName = " Zannatul Naim";
        String lastName = " Nadim";

        String fullName = firstName + lastName;
        System.out.println("Full Name = " + fullName);

        fullName = firstName.concat(lastName);
        System.out.println("Again Full name = " + fullName);

        fullName = fullName.toUpperCase();
        System.out.println("Again Full name in Upper Case = " + fullName);

        fullName = fullName.toLowerCase();
        System.out.println("Again Full name in Lower Case = " + fullName);

        boolean a = firstName.startsWith(" Z");
        System.out.println("a = " + a);

        boolean b = firstName.endsWith("m");
        System.out.println("b = " + b);

        String[] students = {"Nadim", "Sharmin", "Shopnil"};

        for (String x : students) {
            System.out.println(x);
        }

    }

}
 