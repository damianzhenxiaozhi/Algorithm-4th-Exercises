package chapter1_1;

public class E1_1_27 {
    private static double[][] temp;
    private static int count;

    public static double binomial(int N, int k, double p) {
        temp = new double[N + 1][k + 1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                temp[i][j] = -1.0;
            }
        }

        return binomialHelper(N, k, p);
    }

    private static double binomialHelper(int N, int k, double p) {
        count++;

        if (N == 0 && k == 0) {
            return 1.0;
        }

        if (N < 0 || k < 0) {
            return 0.0;
        }

        if (temp[N][k] >= 0) {
            return temp[N][k];
        }

        temp[N][k] = (1.0 - p) * binomialHelper(N - 1, k, p) + p * binomialHelper(N - 1, k - 1, p);
        return temp[N][k];
    }

    public static void main(String[] args) {
        System.out.println(binomial(10, 5, 0.1));
        System.out.println(count);
    }
}
