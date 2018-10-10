
package array_demo;

import java.util.Arrays;

public class Array_Demo9 {
    public static void main(String[] args) {
        int [] number  = {-6,9,5,-3,25,0,100};
        Arrays.sort(number);
        
        System.out.print("Ascending  = ");
        for (int i = 0; i < 7; i++) {
            System.out.print(" "+number[i]);
        }
        
        System.out.println();
        
        System.out.print("Descending  = ");
        for (int i = 6; i >= 0; i--) {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        
        String [] name ={"Rasel","Asad","Nadim","Sharmin","Mou","Pollob"};
        Arrays.sort(name);
        
        for (int i = 0; i < 6; i++) {
            System.out.print(name[i]+" ");
        }
        System.out.println();
            for (int i = 5; i >=0; i--) {
                System.out.print(name[i]+" ");
        }
            System.out.println();
        
    }
    
}
