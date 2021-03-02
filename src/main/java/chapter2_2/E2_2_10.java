package chapter2_2;

import chapter2_1.algs.SortAlgs;

public class E2_2_10 extends SortAlgs {
    public static void sort(Comparable[] a) {

        sort(a, 0, a.length-1);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        Comparable[] aux = new Comparable[hi - lo + 1];

        int mid = lo + (hi - lo) / 2;

        sort(a, lo, mid);
        sort(a, mid+1, hi);

        merge(a, aux, lo, mid, hi);
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        for (int i = lo; i <= mid; i++) {
            aux[i] = a[i];
        }

        for (int i = mid+1; i <=hi; i++) {
            aux[i] = a[hi + mid + 1 - i ];
        }

        int i = lo;
        int j = hi;
        for (int k = lo; k <= hi; k++) {
            if (i == j) return;
            else if (less(aux[i], aux[j])) a[k] = aux[i++];
            else a[k] = aux[j--];
        }
    }
}
