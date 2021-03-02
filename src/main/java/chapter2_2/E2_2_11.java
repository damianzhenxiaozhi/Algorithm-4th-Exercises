package chapter2_2;

import chapter2_1.algs.SortAlgs;
import edu.princeton.cs.algs4.StdRandom;

public class E2_2_11 extends SortAlgs {
    private static Comparable[] aux;
    private static final int CUTOFF = 10;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        for (int k = 0; k <= a.length; k++) {
            aux[k] = a[k];
        }

        sort(aux, a, 0, a.length-1);

        assert isSorted(a);
    }

    private static void sort(Comparable[] src, Comparable[] dst, int lo, int hi) {
        if (hi - lo <= CUTOFF) {
            insertion(dst, lo, hi);
            return;
        }

        int mid = lo + (hi-lo)/2;

        sort(dst, src, lo, mid);
        sort(dst, src, mid+1, hi);

        if (less(src[mid], src[mid+1])) {
            for (int i = lo; i <= hi; i++) {
                dst[i] = src[i];
            }
            return;
        }

        merge(src, dst, lo, mid, hi);
    }

    private static void merge(Comparable[] src, Comparable[] dst, int lo, int mid, int hi) {
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) dst[k] = src[j++];
            else if (j > hi) dst[k] = src[i++];
            else if (less(src[i], src[j])) dst[k] = src[i++];
            else dst[k] = src[j++];
        }
    }

    private static void insertion(Comparable[] a, int lo, int hi) {
        for (int i = lo+1; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        Double[] a = new Double[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform();
        }

        sort(a);
        show(a);
    }
}
