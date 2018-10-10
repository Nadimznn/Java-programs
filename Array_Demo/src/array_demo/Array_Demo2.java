package array_demo;

import java.util.Scanner;

public class Array_Demo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        System.out.print("Please Enter ten integer numbers= ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("The sum is= " + sum);
        int avg = sum / number.length;
        System.out.println("The Average is= " + avg);

        //another step to solve anything like this.
        System.out.println("The square of all numbers=" + sum * sum);
        int max, min;
        max = number[0];
        min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }

        }
        System.out.println("Maximum is= " + max);
        System.out.println("Minimum is= " + min);

    }
}
