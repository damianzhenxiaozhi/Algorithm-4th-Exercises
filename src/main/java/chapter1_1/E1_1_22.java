package chapter1_1;

public class E1_1_22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 1);
    }

    public static int rank(int key, int[] a, int low, int high, int depth) {
        System.out.println(String.format("low:%d, high:%d, depth:%d", low, high, depth));

        if (low > high) {
            return -1;
        }

        int middle = low + (high - low) / 2;
        if (a[middle] == key) {
            return middle;
        }

        if (a[middle] < key) {
            return rank(key, a, middle + 1, high, depth + 1);
        } else {
            return rank(key, a, low, middle - 1, depth + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 8, 10, 12, 15, 96, 101};
        int key = 3;
        System.out.println(rank(key, a));
    }
}
