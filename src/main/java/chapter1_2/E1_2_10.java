package chapter1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class E1_2_10 {
    public static void main(String[] args) {
        VisualCounter vCounter = new VisualCounter(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        for (int i = 0; i < 1000; i++) {
            if (StdRandom.bernoulli(0.7)) {
                vCounter.increment();
            } else {
                vCounter.decrement();
            }
        }
    }

    public static class VisualCounter {
        private int N;
        private int max;
        private int operationCount = 0;
        private int count = 0;

        public VisualCounter(int N, int max) {
            this.N = N;
            this.max = max;

            StdDraw.setXscale(0, N+1);
            StdDraw.setYscale(-max-1, max+1);
            StdDraw.setPenRadius(.005);
        }

        public void increment() {
            if (operationCount >= N) {
                throw new RuntimeException("operation count exceed " + N + " times");
            }

            if (count >= max) {
                throw new RuntimeException("count exceed " + max);
            }

            operationCount++;
            count++;
            StdDraw.point(operationCount, count);
        }

        public void decrement() {
            if (operationCount >= N) {
                throw new RuntimeException("operation count exceed " + N + " times");
            }

            if (count < 0 && Math.abs(count) >= max) {
                throw new RuntimeException("count exceed " + max);
            }

            operationCount++;
            count--;
            StdDraw.point(operationCount, count);
        }
    }
}
