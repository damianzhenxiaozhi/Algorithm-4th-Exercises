package Chapter1_2;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_7 {
    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(a) + mystery(b);
    }

    public static void main(String[] args) {
        System.out.println(mystery("ABCDE"));
    }
}
