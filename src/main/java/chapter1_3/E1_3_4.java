package chapter1_3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;

public class E1_3_4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");

        Stack<String> s = new Stack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (map.containsKey(item)) {
                if (s.isEmpty()) {
                    StdOut.println(false);
                }
                String top = s.pop();
                if (!top.equals(map.get(item))) {
                    StdOut.println(false);
                }
            } else {
                s.push(item);
            }
        }

        StdOut.println(s.isEmpty() ? true : false);
    }
}
