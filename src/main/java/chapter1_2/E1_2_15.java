package chapter1_2;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class E1_2_15 {
    public static int[] readInts(String name) {
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }
    public static void main(String[] args) {
        int[] ints = readInts("mydata/e1_2_15.txt");
        System.out.println(Arrays.toString(ints));
    }
}
