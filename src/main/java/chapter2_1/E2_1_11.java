package chapter2_1;

import chapter2_1.algs.SortAlgs;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class E2_1_11 extends SortAlgs {
    private static int MAX_H_SIZE = 1000;
    private static int[] H_ARRAY = new int[MAX_H_SIZE];

    static {
        H_ARRAY[0] = 1;
        for(int i = 1; i < MAX_H_SIZE; i++) {
            H_ARRAY[i] = 3*H_ARRAY[i-1] + 1;
        }
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        for (int i = 0; i < MAX_H_SIZE; i++) {
            if (H_ARRAY[i] > N/3) {
                h = H_ARRAY[i];
                break;
            }
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }

        assert isSorted(a);
    }


    public static void main(String[] args) {
        Double[] a = new Double[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform();
        }

        sort(a);

        show(a);
        StdOut.println("isSorted:" + isSorted(a));
    }
}
