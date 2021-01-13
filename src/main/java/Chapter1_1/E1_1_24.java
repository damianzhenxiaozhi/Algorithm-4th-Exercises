package Chapter1_1;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/11
 */
public class E1_1_24 {
    public static int euclid(int p, int q) {
        System.out.println(String.format("p:%d, q:%d", p, q));
        // p < q时第一次计算会颠倒两个，所以不需要判断p和q的大小
        if (q == 0) {
            return p;
        }

        // 整除时也不需要判断r == 0，下一次计算会返回结果
        int r = p % q;
        return euclid(q, r);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter two number");
        }
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        System.out.println(euclid(p, q));
    }
}
