package Chapter1_2;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_18 {
    public static void main(String[] args) {
        Accumulator a = new Accumulator();
        for (int i = 0; i < 1000; i++) {
            a.addDataValue(i);
        }

        System.out.println(a.mean());
        System.out.println(a.var());
        System.out.println(a.stddev());
    }

    public static class Accumulator {
        private double m;
        private double s;
        private int N;

        public void addDataValue(double x) {
            N++;
            s = s + 1.0 * (N-1) / N * (x-m) * (x-m);
            m = m + (x-m) / N;
        }

        public double mean() {
            return m;
        }

        public double var() {
            return s / (N-1);
        }

        public double stddev() {
            return Math.sqrt(this.var());
        }
    }
}
