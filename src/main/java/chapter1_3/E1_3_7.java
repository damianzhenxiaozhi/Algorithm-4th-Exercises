package chapter1_3;

import edu.princeton.cs.algs4.StdOut;

public class E1_3_7 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("a");
        StdOut.println(s.peek());
    }

    public static class Stack<Item> {
        private Node first;
        private int N;

        private class Node {
            Item item;
            Stack.Node next;
        }

        public boolean isEmpty() {
            return first == null;
        }

        public int size() {
            return N;
        }

        public void push(Item item) {
            Stack.Node oldFirst = first;
            first = new Stack.Node();
            first.item = item;
            first.next = oldFirst;
            N++;
        }

        public Item pop() {
            Item item = first.item;
            first = first.next;
            N--;
            return item;
        }

        public Item peek() {
            return first.item;
        }
    }
}
