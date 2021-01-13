package Chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/12
 */
public class E1_1_39 {
    private static int binarySearch(int key, int[] a) {
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
        if (args.length < 1) {
            System.out.println("Please enter T");
            return;
        }

        int T = Integer.parseInt(args[0]);
        int N = 1000;
        long[] counts = new long[4];
        double[] result = new double[4];
        for (int i = 0; i <= 3; i++) {
            N = N * (i + 1);
            int[] a = new int[N];
            int[] b = new int[N];

            int t = T;
            while (t-- > 0) {
                for (int j = 0; j < N; j++) {
                    a[j] = StdRandom.uniform(1000000);
                    b[j] = StdRandom.uniform(1000000);
                }

                Arrays.sort(a);
                Arrays.sort(b);

                int x = 0, y = 0;
                int lastEqual = -1;
                while (x < a.length && y < b.length) {
                    while (x < a.length && a[x] < b[y]) {
                        x++;
                    }

                    while (x < a.length && a[x] == b[y]) {
                        if (a[x] != lastEqual) {
                            counts[i]++;
                            lastEqual = a[x];
                            x++;
                        } else {
                            x++;
                        }
                    }

                    while (x < a.length && y < b.length && a[x] > b[y]) {
                        y++;
                    }
                }
            }
            result[i] = 1.0 * counts[i] / T;
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf(result[i] + " ");
        }
    }
}
