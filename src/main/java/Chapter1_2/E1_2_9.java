package Chapter1_2;


import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_9 {
    public static void main(String[] args) {
        Counter counter = new Counter("binarySearch");
        int key = Integer.parseInt(args[0]);
        int[] a = StdIn.readAllInts();
        Arrays.sort(a);
        System.out.println(indexOf(a, key, counter));
        System.out.println(counter);
    }

    public static int indexOf(int[] a, int key, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            counter.increment();
            int mid = lo + (hi - lo) / 2;
            System.out.println("mid:" + a[mid]);
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
