package Assignment6;

import java.util.Scanner;

public class TwoD {
    public static void main (String[]args){
        System.out.println("Enter a value: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[][] x = new int[][]{{a}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        System.out.println("Table Length : "+x[1].length);

        for (int i = 0; i < x[0].length; ++i) {
            System.out.println("Two dimensional Multiplication for : " +x[0][i]);

            for (int y = 0; y < x[1].length; ++y) {
                System.out.println(x[0][i] + "*" + x[1][y] + "= " + x[0][i] * x[1][y] + " ");
            }
        }

    }
}
