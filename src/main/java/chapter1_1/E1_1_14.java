package chapter1_1;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class E1_1_14 {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(new BufferedInputStream(System.in));
            int N = s.nextInt();
            if (N < 1) {
                System.out.println("Number can't be less than 1");
                continue;
            }

            int n = 1;
            int result = 0;
            while (n <= N) {
                result++;
                n *= 2;
            }

            System.out.println(result - 1);
        }
    }
}
