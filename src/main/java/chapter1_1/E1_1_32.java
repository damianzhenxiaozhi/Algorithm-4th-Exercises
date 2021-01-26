package chapter1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class E1_1_32 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please enter N, l and r");
            return;
        }

        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        double delta = (r - l) / N;
        int[] counts = new int[N];
        double[] data = StdIn.readAllDoubles();
        for (double n : data) {
            counts[(int)((n - l) / delta)] += 1;
        }

        int maxY = counts[0];
        for (int i = 1; i < N; i++) {
            maxY = Math.max(maxY, counts[i]);
        }

        StdDraw.setXscale(l, maxY + 1);
        StdDraw.setYscale(0, r + 0.5);
        for (int i = 0; i < N; i++) {
            double x = delta / 2 + i * delta;
            double y = counts[i] / 2.0;
            double rw = delta / 2;
            double rh = counts[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
