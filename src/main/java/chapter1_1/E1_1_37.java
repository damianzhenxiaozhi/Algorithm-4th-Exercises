package chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

public class E1_1_37 {
    private static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(N);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    private static void init(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter N and M");
            return;
        }

        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        int[][] counts = new int[M][M];

        int[] a = new int[M];
        init(a);

        int k = N;
        while (k-- > 0) {
            shuffle(a);

            for (int i = 0; i < a.length; i++) {
                counts[i][a[i]]++;
            }

            init(a);
        }

        System.out.printf("%d/%d = %f\n", N, M, N * 1.0 / M);
        for(int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf(counts[i][j] + " ");
            }
            System.out.println();
        }
    }
}
