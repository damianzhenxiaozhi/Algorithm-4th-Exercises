package chapter1_1;

public class E1_1_7 {
    public static double sqrt(double n) {
        double err = 1e-3;
        double t = n;
        while (Math.abs(t - n/t) > err) {
            t = (n/t + t) / 2.0;
        }
        return t;
    }

    public static int guassSum() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static int logSum() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(E1_1_7.sqrt(9.0));
        System.out.println(E1_1_7.guassSum());
        System.out.println(E1_1_7.logSum());
    }
}
