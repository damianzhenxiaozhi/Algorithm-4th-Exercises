package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class E1_3_1 {
    public static void main(String[] args) {
        FixedCapacityStackOfString s = new FixedCapacityStackOfString(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else {
                if (!s.isEmpty()) {
                    StdOut.println(s.pop() + " ");
                }
            }
        }

        StdOut.println("(" + s.size() + " left on stack)");
    }

    public static class FixedCapacityStackOfString {
        private String[] a;
        private int N;
        public FixedCapacityStackOfString(int cap) {
            a = new String[cap];
        }

        public void push(String item) {
            if (isFull()) {
                resize(2 * a.length);
            }

            a[N++] = item;
        }

        private void resize(int max) {
            String[] temp = new String[max];
            for (int i = 0; i < N; i++) {
                temp[i] = a[i];
            }
            a = temp;
        }

        public String pop() {
            String item = a[--N];
            a[N] = null;
            if (N > 0 && N < a.length / 4) {
                resize(a.length / 2);
            }
            return item;
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

        public boolean isFull() {
            return N == a.length;
        }
    }
}
