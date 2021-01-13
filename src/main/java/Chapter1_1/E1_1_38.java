package Chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.util.Arrays;
import java.util.Set;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/12
 */
public class E1_1_38 {
    public static int bruteForceSearch(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (a[middle] == key) {
                return middle;
            }

            if (a[middle] < key) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = new In("data\\" + args[0]).readAllInts();
        Arrays.sort(whitelist);
        long start = System.currentTimeMillis();
        long count = 0;
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (bruteForceSearch(key, whitelist) < 0) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("count:" + count);
        System.out.println("cost time(ms):" + (end - start));
    }
}
