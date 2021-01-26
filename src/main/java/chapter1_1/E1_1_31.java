package chapter1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class E1_1_31 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter N and p");
            return;
        }

        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);

        double deltaR = 2 * Math.PI / N;
        double[] radians = new double[N];
        StdDraw.setPenRadius(0.05);
        StdDraw.setXscale(0, 50);
        StdDraw.setYscale(0, 50);
        double centerX = 25;
        double centerY = 25;
        double r = 20;
        for (int i = 0; i < N; i++) {
            radians[i] = i * deltaR;
            double x = centerX + r * Math.cos(radians[i]);
            double y = centerY + r * Math.sin(radians[i]);
            StdDraw.point(x, y);
        }

        StdDraw.setPenColor(Color.GRAY);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (StdRandom.bernoulli(p)) {
                    double x0 = centerX + r * Math.cos(radians[i]);
                    double y0 = centerY + r * Math.sin(radians[i]);
                    double x1 = centerX + r * Math.cos(radians[j]);
                    double y1 = centerY + r * Math.sin(radians[j]);
                    StdDraw.line(x0, y0, x1, y1);
                }
            }
        }
    }
}
