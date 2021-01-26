package chapter1_1;

import edu.princeton.cs.algs4.In;

import java.io.File;
import java.util.*;

public class E1_1_28 {
    public static void main(String[] args) {
        int[] whitelist = new In(new File(args[0])).readAllInts();
        Arrays.sort(whitelist);

        int[] distinct = new int[whitelist.length];
        distinct[0] = whitelist[0];
        int j = 1;

        for (int i = 1; i < whitelist.length; i++) {
            if (whitelist[i] != whitelist[i-1]) {
                distinct[j++] = whitelist[i];
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.printf(distinct[i] + " ");
        }
    }
}
