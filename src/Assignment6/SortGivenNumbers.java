package Assignment6;

import java.util.TreeSet;

public class SortGivenNumbers {
    public static void main(String[] args) {
        int[] x = new int[]{1, 9, 4, 11, 2};
        TreeSet<Integer> ts = new TreeSet();

        for(int i = 0; i < x.length; ++i) {
            ts.add(x[i]);
        }

        System.out.println(ts);
    }
}
