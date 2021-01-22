package Chapter1_2;

import edu.princeton.cs.algs4.*;

import java.awt.*;

import static edu.princeton.cs.algs4.Draw.BLUE;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/22
 */
public class E1_2_1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("enter N");
            return;
        }

        int N = Integer.parseInt(args[0]);

        StdDraw.setXscale(0, 2);
        StdDraw.setYscale(0, 2);
        StdDraw.setPenColor(BLUE);
        StdDraw.setPenRadius(0.01);
        Interval1D x1d = new Interval1D(0, 1);
        Interval1D y1d = new Interval1D(0, 1);
        Interval2D square = new Interval2D(x1d, y1d);
        square.draw();

        StdDraw.setPenColor(Color.RED);
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
            points[i].draw();
        }

        double minDistance = new Point2D(0, 0).distanceTo(new Point2D(1, 1));
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                minDistance = Math.min(minDistance, points[i].distanceTo(points[j]));
            }
        }

        StdOut.println(minDistance);
    }
}
