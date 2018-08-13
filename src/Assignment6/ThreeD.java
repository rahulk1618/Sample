package Assignment6;

import java.util.Scanner;

public class ThreeD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = in.nextInt();
        int[][][] x = new int[][][]{{{a}}, {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}}};
        System.out.println("Length of 1st row: " +x[1][0].length);
        System.out.println("length of 2nd row:"  +x[1][1].length);

        for(int i = 0; i < x[0][0].length; ++i) {
            System.out.println(x[0][0][i]);

            for(int y = 0; y < x[1][0].length; ++y) {
                System.out.println(x[1][0].length);
                System.out.println(x[1][1].length);

                for(int z = 0; z < x[1][1].length; ++z) {
                    System.out.println(x[0][0][i] + "*" + x[1][0][y] + "*" + x[1][1][z] + "= " + x[0][0][i] * x[1][0][y] * x[1][1][z]);
                }
            }
        }

    }
}
