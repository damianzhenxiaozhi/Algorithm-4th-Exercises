package chapter1_1;

public class E1_1_30 {
    public static void main(String[] args) {
        int N = 20;
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                if (gcd(i, j) == 1) {
                    System.out.printf(true + "\t");
                } else {
                    System.out.printf(false + "\t");
                }
            }
            System.out.println();
        }
    }

    private static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }

        int r = p % q;
        return gcd(q, r);
    }
}
