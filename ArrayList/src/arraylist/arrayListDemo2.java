
package arraylist;

import java.util.ArrayList;

public class arrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> number;
        number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        
        System.out.println("Total List of Array= "+number);
        number.clear();
        System.out.println("After Clearing ArrayList Contains="+number);
        boolean check=number.isEmpty();
        System.out.println("Array List is Empty= "+check);
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        System.out.println("Total List of Array= "+number);
        check = number.isEmpty();
        System.out.println("Array List is Empty= "+check);
        
        boolean contain=number.contains(30);
        System.out.println("Is there is the 30 element = "+contain);
        
        int i = number.indexOf(40);
        System.out.println("Index of 40 is= "+i);

        number.set(2, 25);
        System.out.println("Array List is = "+number);
        
        int a = number.get(2);
        System.out.println("In the index 2 there is= "+a);

    }
    
}
