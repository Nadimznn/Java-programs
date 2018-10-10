package array_demo;

import java.util.Scanner;

public class Array_Demo6_Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sode = 0, soute = 0, solte = 0;

        System.out.println("Enter The Elements Of Matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]= ", row, col);
                A[row][col] = input.nextInt();

            }

        }
        System.out.println("\n");
        System.out.print("A= ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t" + A[row][col]);

            }
            System.out.println();
        }
        System.out.println("\n");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sode = sode + A[row][col];
                }

            }
        }
        System.out.println("Some Of Diagonal Elements= " + sode);

        System.out.println("\n");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row < col) {
                    soute = soute + A[row][col];
                }

            }
        }
        System.out.println("Some Of Upper Triangle Elements= " + soute);

        System.out.println("\n");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row > col) {
                    solte = solte + A[row][col];
                }

            }
        }
        System.out.println("Some Of Lower Triangle Elements= " + solte);
    }
}
