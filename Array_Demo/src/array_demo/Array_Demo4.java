package array_demo;

public class Array_Demo4 {

    public static void main(String[] args) {
        //2-dimwnsional array
        int[][] number = new int[2][3];
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 50;
        number[1][1] = 60;
        number[1][2] = 70;
        

        System.out.print("  " + number[0][0]);
        System.out.print("  " + number[0][1]);
        System.out.print("  " + number[0][2]);
        System.out.println();
        System.out.print("  " + number[1][0]);
        System.out.print("  " + number[1][1]);
        System.out.println("  " + number[1][2]);

        System.out.println();

        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.print("  " + number[row][col]);
                
            }
            System.out.println();

        }
    }

}
