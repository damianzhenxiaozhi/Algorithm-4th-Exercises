package chapter1_1;

import java.io.BufferedInputStream;
import java.util.Scanner;

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
