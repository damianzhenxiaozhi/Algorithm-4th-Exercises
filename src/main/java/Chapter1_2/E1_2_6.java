package Chapter1_2;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/25
 */
public class E1_2_6 {
    public static boolean isCircularRotation(String a, String b) {
        return a.length() == b.length() && (b + b).indexOf(a) != -1;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("enter two string");
            return;
        }

        String string1 = args[0];
        String string2 = args[1];
        System.out.println(isCircularRotation(string1, string2));
    }
}
