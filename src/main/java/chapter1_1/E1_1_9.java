package chapter1_1;

public class E1_1_9 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter one Integer");
        }

        int N = Integer.parseInt(args[0]);
        StringBuilder s = new StringBuilder();

        while (N > 0) {
            s.insert(0, N % 2);
            N = N / 2;
        }

        System.out.println(s);
    }
}
