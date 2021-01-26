package chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.io.File;
import java.util.Arrays;

public class E1_1_23 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 1);
    }

    public static int rank(int key, int[] a, int low, int high, int depth) {
        if (low > high) {
            return -1;
        }

        int middle = low + (high - low) / 2;
        if (a[middle] == key) {
            return middle;
        }

        if (a[middle] < key) {
            return rank(key, a, middle + 1, high, depth + 1);
        } else {
            return rank(key, a, low, middle - 1, depth + 1);
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please Enter '+' or '-' and file name");
            return;
        }

        int[] whitelist = new In(new File(args[0])).readAllInts();
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int index = rank(key, whitelist);

            if ("+".equals(args[1])) {
                if (index < 0) {
                    System.out.println(key);
                }
            } else {
                if (index > 0) {
                    System.out.println(key);
                }
            }
        }
    }
}
