package Chapter1_1;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/11
 */
public class E1_1_20 {
    public static double recursiveLn(int N) {
        if (N == 0) {
            return 0;
        }

        return Math.log(N) + recursiveLn(N - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveLn(10));
        System.out.println(Math.log(factorial(10)));
    }

    public static long factorial(int N)
    {
        if (N==0 || N==1)
        {
            return 1;
        }

        return factorial(N - 1) * N;
    }
}
