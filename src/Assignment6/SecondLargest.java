package Assignment6;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SecondLargest {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 32, 545, 0, -3, 24};
        List<Integer> l = Arrays.asList(a);
        //1,32,545,0,-3,24
        TreeSet<Integer> ts = new TreeSet();
        ts.addAll(l);
        //System.out.print(ts);
        Object[] b = ts.toArray();

        for(int i = 0; i < b.length; ++i) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        System.out.println("The Second Largest value is: " + b[b.length - 2]);
    }
}
