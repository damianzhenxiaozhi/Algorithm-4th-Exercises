package Chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/12
 */
public class E1_1_35 {
    public static double[] theory() {
        int SIDES = 6;
        double[] dist = new double[2*SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i+j] += 1.0;
            }
        }

        for (int k = 2; k <= 2*SIDES; k++) {
            dist[k] /= 36.0;
        }

        return dist;
    }

    public static void main(String[] args) {
        long N = StdIn.readLong();

        long[] counts = new long[13];
        long k = N;
        while (k-- > 0) {
            int n = 2 + StdRandom.uniform(6) + StdRandom.uniform(6);
            counts[n]++;
        }

        double[] p = new double[13];
        for (int i = 0; i < counts.length; i++) {
            p[i] = 1.0 * counts[i] / N;
        }

        System.out.println("test:");
        for (int i = 2; i < p.length; i++) {
            System.out.printf("%.3f ", p[i]);
        }
        System.out.println();
        System.out.println("theory:");
        double[] t = theory();
        for (int i = 2; i < p.length; i++) {
            System.out.printf("%.3f ", t[i]);
        }
    }
}
