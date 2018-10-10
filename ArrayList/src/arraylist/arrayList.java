package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.size();
        System.out.println("Size= " + number);
        System.out.println("Size= " + number.size());

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 50);

        for (int i : number) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Size= " + number.size());

        System.out.println(number);

        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
        System.out.println(" \n \n");

        number.remove(0);
        System.out.println(number);
        System.out.println("After removing one element then Size= " + number.size());

        number.removeAll(number);
        System.out.println(number);
        System.out.println("After removing All element then Size= " + number.size());

    }

}
