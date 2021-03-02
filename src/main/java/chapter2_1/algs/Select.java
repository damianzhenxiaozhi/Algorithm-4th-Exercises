package chapter2_1.algs;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Select extends SortAlgs {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[minIndex])) {
                    minIndex = j;
                }
            }

            exch(a, i, minIndex);
        }

        assert isSorted(a);
    }

    public static void main(String[] args) {
        Double[] a = new Double[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform();
        }

        sort(a);
    }
}
