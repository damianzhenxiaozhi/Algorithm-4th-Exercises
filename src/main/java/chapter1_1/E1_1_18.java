package chapter1_1;

public class E1_1_18 {
    public static int mystery(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b/2);
        }
        return mystery(a + a, b/2) + a;
    }

    public static int mysteryByLoop(int a, int b) {
        int result = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                result += a;
            }
            a = a + a;
            b = b / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(mystery(2, 25));
        System.out.println(mysteryByLoop(2, 25));
    }
}
