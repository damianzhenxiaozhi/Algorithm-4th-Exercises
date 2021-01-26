package chapter1_1;

public class E1_1_29 {
    public static int rank(int key, int[] a) {
        int i = binarySearch(key, a, 0, a.length - 1);

        int j = i - 1;
        while (j >= 0 && a[j] == a[i]) {
            j--;
        }

        if (j == 0 && a[j] == a[i]) {
            return 0;
        }

        return j + 1;
    }

    private static int binarySearch(int key, int[] a, int low, int high) {
        if (low > high) {
            return -1;
        }

        int middle = low + (high - low) / 2;
        if (a[middle] < key) {
            return binarySearch(key, a, middle + 1, high);
        } else if (a[middle] > key) {
            return binarySearch(key, a, low, middle - 1);
        } else {
            return middle;
        }
    }

    public static int count(int key, int[] a) {
        int i = binarySearch(key, a, 0, a.length - 1);

        int count = 1;

        int j = i - 1;
        while (j >= 0 && a[j] == a[i]) {
            count++;
            j--;
        }

        j = i + 1;
        while (j < a.length && a[j] == a[i]) {
            count++;
            j++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 5, 5, 7, 7, 9, 11};
        int key = 5;
        System.out.println(rank(key, a));
        System.out.println(count(key, a));
    }
}
