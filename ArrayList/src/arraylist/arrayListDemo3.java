
package arraylist;

import java.util.ArrayList;

public class arrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> names1;
        names1= new ArrayList<>(); 
        ArrayList<String> names2;
        names2= new ArrayList<>(); 
        ArrayList<String> names3;
        names3= new ArrayList<>(); 
        
        names1.add("Nadim");
        names1.add("Pollob");
        names1.add("Uday");
        names1.add("Allen");
        System.out.println("In names1="+names1);
        
        names2.addAll(names1);
        System.out.println("In names2="+names2);
        
        names3.add("Sharmin");
        names3.add("Shurovi");
        names3.add("Jannat");
        names3.add("Bizli");
        System.out.println("In names3="+names3);
        
        boolean check = names3.equals(names1);
        System.out.println("This two variables are all same="+check);
        check = names2.equals(names1);
        System.out.println("This two variables are all same="+check);
        
    }
    
}
