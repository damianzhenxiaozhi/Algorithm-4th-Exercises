package chapter1_2;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class E1_2_2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("enter N");
            return;
        }

        int N = Integer.parseInt(args[0]);
        StdDraw.setPenColor(Color.RED);
        StdDraw.setPenRadius(0.001);
        double[] data = StdIn.readAllDoubles();

        Interval1D[] intervals = new Interval1D[data.length / 2];
        for (int i = 0; i < intervals.length; i++) {
            intervals[i] = new Interval1D(data[2 * i], data[2 * i + 1]);
        }

        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    StdOut.println(intervals[i] + "-" + intervals[j]);
                }
            }
        }
    }
}
