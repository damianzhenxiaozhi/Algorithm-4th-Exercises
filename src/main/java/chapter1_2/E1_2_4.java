package chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class E1_2_4 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1;
        s1 = "world";
        StdOut.println(s1);
        StdOut.println(s2);
    }
}
