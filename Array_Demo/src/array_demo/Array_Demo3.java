
package array_demo;

public class Array_Demo3 {
    public static void main (String []args){
        int [] number = {10,20,30,40,50};
        System.out.println("The Size of Array= "+number.length);
        int sum=0;
        
        for(int a:number){
            System.out.println(a);
            sum=sum+a;
        }System.out.println("Summation is= "+sum);
    }
}
