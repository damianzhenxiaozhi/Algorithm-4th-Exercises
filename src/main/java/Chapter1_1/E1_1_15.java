package Chapter1_1;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/11
 */
public class E1_1_15 {
    public static int[] histogram(int a[], int M) {
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            if (a[i] >= 0 && a[i] <= M - 1) {
                result[a[i]]++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6};
        int[] b = histogram(a, 6);

        int count = 0;
        for (int i = 0; i < b.length; i++) {
            count += b[i];
            System.out.printf(b[i] + " ");
        }
        System.out.println();
        System.out.println("count:" + count);
    }
}
