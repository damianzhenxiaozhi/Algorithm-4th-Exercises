package chapter1_3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class E1_3_9 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if (!item.equals(")")) {
                s.push(item);
            } else {
                String op2 = s.pop();
                String sign = s.pop();
                String op1 = s.pop();
                String combo = String.format("( %s %s %s )", op1, sign, op2);
                s.push(combo);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!s.isEmpty()) {
            res.insert(0, s.pop());
        }

        StdOut.println(res);
    }
}
