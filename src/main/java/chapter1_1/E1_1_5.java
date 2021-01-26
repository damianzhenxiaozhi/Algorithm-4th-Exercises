package chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class E1_1_5 {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String[] nums = StdIn.readLine().split("\\s+");
            double x = Double.parseDouble(nums[0]);
            double y = Double.parseDouble(nums[1]);
            StdOut.println(x > 0 && x < 1 && y > 0 && y < 1);
        }
    }
}
