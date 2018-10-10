package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListDemo4 {

    public static void main(String[] args) {
        ArrayList<Integer> number;
        number = new ArrayList<>();
        number.add(100);
        number.add(10);
        number.add(1);
        number.add(-5);
        number.add(0);
        number.add(25);
        number.add(62);
        System.out.println("Ordered ArrayList= " + number);

        Collections.sort(number);
        System.out.println("After sorting the Array List in Ascending=" + number);
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After sorting the Array List in Descending=" + number);

    }
}
