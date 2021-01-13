package Chapter1_1;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/8
 */
public class E1_1_13 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}};

        int lineNum = matrix.length;
        int columnNum = matrix[0].length;

        for (int i = 0; i < lineNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("transpose matrix");
        int[][] transposeMatrix = new int[columnNum][lineNum];

        for (int i = 0; i < columnNum; i++) {
            for (int j = 0; j < lineNum; j++) {
                transposeMatrix[i][j] = matrix[j][i];
                System.out.printf(transposeMatrix + " ");
            }
            System.out.println();
        }
    }
}
