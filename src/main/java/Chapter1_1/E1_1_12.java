package Chapter1_1;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/11
 */
public class E1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
            System.out.printf(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
            System.out.printf(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf(i + " ");
        }
    }
}
