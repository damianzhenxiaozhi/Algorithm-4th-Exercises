package chapter1_2;

import edu.princeton.cs.algs4.*;

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

        Interval2D[] rectangles = new Interval2D[N];
        Point2D[] leftTopArray = new Point2D[N];
        Point2D[] rightBottomArray = new Point2D[N];
        double left, right, top, bottom, a, b;
        for (int i = 0; i < N; i++) {
            a = StdRandom.uniform(min, max);
            b = StdRandom.uniform(min, max);
            if (a < b) {
                left = a;
                right = b;
            } else {
                left = b;
                right = a;
            }

            a = StdRandom.uniform(min, max);
            b = StdRandom.uniform(min, max);
            if (a < b) {
                bottom = a;
                top = b;
            } else {
                bottom = b;
                top = a;
            }

            leftTopArray[i] = new Point2D(left, top);
            rightBottomArray[i] = new Point2D(right, bottom);

            rectangles[i] = new Interval2D(new Interval1D(left, right), new Interval1D(bottom, top));
            rectangles[i].draw();
        }

        StdDraw.setScale(min, max);
        StdDraw.setPenColor(Color.RED);
        StdDraw.setPenRadius(0.001);
        int intersectCount = 0;
        int containCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (rectangles[i].intersects(rectangles[j])) {
                    intersectCount++;
                }

                if (rectangles[i].contains(leftTopArray[j]) && rectangles[i].contains(rightBottomArray[j])) {
                    containCount++;
                }

                if (rectangles[j].contains(leftTopArray[i]) && rectangles[j].contains(rightBottomArray[i])) {
                    containCount++;
                }
            }
        }

        System.out.println("intersect count:" + intersectCount);
        System.out.println("contain count:" + containCount);
    }
}
