package Chapter1_1;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/11
 */
public class E1_1_16 {
    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }

        return exR1(n-3) + n + exR1(n-2) + n;
    }

    public static void main(String[] args) {
        System.out.println(exR1(6));
    }
}
