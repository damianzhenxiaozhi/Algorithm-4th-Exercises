package Chapter1_1;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/8
 */
public class E1_1_11 {
    public static void main(String[] args) {
        boolean[][] data = new boolean[][]{{true, false, true}, {false, true, false}};

        int line = data.length;
        int column = data[0].length;

        System.out.printf("  ");
        for (int i = 0; i < column; i++) {
            System.out.printf(i + " ");
        }
        System.out.println();

        for (int i = 0; i < line; i++) {
            System.out.printf(i + " ");
            for (int j = 0; j < column; j++) {
                if (data[i][j]) {
                    System.out.printf("* ");
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }
}
