package Chapter1_1;

import edu.princeton.cs.algs4.StdIn;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/8
 */
public class E1_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if ((x > 0 && x < 1) && (y > 0 && y < 1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
