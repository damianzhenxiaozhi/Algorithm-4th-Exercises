package Chapter1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class E1_2_3 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("enter N, min, max");
            return;
        }

        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);

        Interval2D[] i2ds = new Interval2D[N];
        Interval1D[] edges = new Interval1D[2 * N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                double eachMin = StdRandom.uniform(min, max);
                double eachMax = StdRandom.uniform(eachMin, max);
                edges[2 * i + j] = new Interval1D(eachMin, eachMax);
            }

            i2ds[i] = new Interval2D(edges[2 * i], edges[2 * i + 1]);
        }

        StdDraw.setScale(min, max);
        StdDraw.setPenColor(Color.RED);
        StdDraw.setPenRadius(0.001);
        int intersectCount = 0;
        int containCount = 0;
        for (int i = 0; i < N; i++) {
            i2ds[i].draw();
            for (int j = i + 1; j < N; j++) {
                if (i2ds[i].intersects(i2ds[j])) {
                    intersectCount++;
                }

                if (contain(edges[i], edges[i + 1], edges[j], edges[j + 1])) {
                    containCount++;
                }

                if (contain(edges[j], edges[j + 1], edges[i], edges[i + 1])) {
                    containCount++;
                }
            }
        }

        System.out.println("intersect count:" + intersectCount);
        System.out.println("contain count:" + containCount);
    }

    private static boolean contain(Interval1D aWidth, Interval1D aHeight, Interval1D bWidth, Interval1D bHeight) {
        if (!aWidth.contains(bWidth.min())) {
            return false;
        }

        if (!aWidth.contains(bWidth.max())) {
            return false;
        }

        if (!aHeight.contains(bHeight.min())) {
            return false;
        }

        if (!aHeight.contains(bHeight.max())) {
            return false;
        }

        return true;
    }

}
