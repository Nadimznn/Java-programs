
package array_demo;

public class Array_Demo7 {
    public static void main(String[] args) {
        int [][] A=new int [4][5];
        int k=0;
        
        //Assigning value to the 2d array
        
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <5; j++) {
                A [i][j]=k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  "+A[i][j]);
            }System.out.println();
        }
        
    }
    
}
