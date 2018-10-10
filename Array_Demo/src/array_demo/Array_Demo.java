package array_demo;

public class Array_Demo {

    public static void main(String[] args) {
        int[] input = new int[5];
        input[0] = 15;
        input[1] = 25;
        input[2] = 35;
        input[3] = 55;
        input[4] = 50;
        int sum = input[0] + input[0];
        System.out.println("Sum of these number= " + sum);
        int len = input.length;
        System.out.println("The Length is= " + len);
        
        int max,min;
        max = input[0];
        min= input[0];
        for (int i = 1; i < input.length; i++) {
            if(max<input[i]){
                max=input[i];
            }
            if (min>input[i]) {
                min=input[i];
            }
                   
        }System.out.println("Maximum is= "+max);
        System.out.println("Minimum is= "+min);
    }

}
