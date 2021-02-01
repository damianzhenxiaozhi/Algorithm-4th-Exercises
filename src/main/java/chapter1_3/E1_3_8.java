package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class E1_3_8 {
    public static void main(String[] args) {
        DoublingStackOfStrings s = new DoublingStackOfStrings(50);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else {
                if (!s.isEmpty()) {
                    StdOut.print(s.pop() + " ");
                }
            }
        }

        StdOut.println();
        StdOut.println("size:" + s.size());
        while (!s.isEmpty()) {
            StdOut.print(s.pop() + " ");
        }
    }
    public static class DoublingStackOfStrings {
        private int N;
        private String[] a;

        public DoublingStackOfStrings(int cap) {
            a = new String[cap];
        }

        public void push(String item) {
            if (N == a.length) {
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

            if (N < a.length / 4) {
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
    }
}
