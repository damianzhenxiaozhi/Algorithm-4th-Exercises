package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class E1_1_3 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        if (i == j && j == k) StdOut.println("equal");
        else StdOut.println("not equal");
    }
}
