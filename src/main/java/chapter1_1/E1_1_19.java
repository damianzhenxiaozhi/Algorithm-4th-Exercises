package chapter1_1;

public class E1_1_19 {
    public static long F(int N) {
        if (N < 0) {
            throw new RuntimeException("N can't be negative");
        }

        if (N < 2) {
            return N;
        }

        long[] tempResult = new long[N + 1];
        tempResult[0] = 0L;
        tempResult[1] = 1L;

        int i = 2;
        while (i <= N) {
            tempResult[i] = tempResult[i-1] + tempResult[i-2];
            i++;
        }

        return tempResult[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F(N));
        }
    }
}
