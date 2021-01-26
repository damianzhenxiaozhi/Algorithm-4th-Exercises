package chapter1_1;

public class E1_1_3 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Enter at least 3 numbers");
            return;
        }

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        if (i == j && j == k) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
