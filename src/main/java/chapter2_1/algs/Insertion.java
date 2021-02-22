package chapter2_1.algs;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Insertion extends SortAlgs {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            Comparable d = a[i];
            int j = i - 1;
            while (j >= 0 && less(d, a[j])) {
                a[j+1] = a[j];
                j--;
            }

            a[++j] = d;
        }
    }

    public static void sortSwap(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        Double[] a = new Double[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform();
        }

        sortSwap(a);
        show(a);
        StdOut.println("isSorted:" + isSorted(a));
    }
}
