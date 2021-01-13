package Chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/11
 */
public class E1_1_21 {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();

            StdOut.println(String.format("%s %d %d %.3f", name, a, b, a * 1.0 / b));
        }
    }
}
