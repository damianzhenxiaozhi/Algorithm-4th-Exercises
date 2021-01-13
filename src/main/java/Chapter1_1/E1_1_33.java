package Chapter1_1;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/12
 */
public class E1_1_33 {
    public static double dot(double[] x, double[] y) {
        double result = 0.0;
        for (int i = 0; i < x.length; i++) {
            result += x[i] * y[i];
        }
        return result;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        double[][] result = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return result;
    }

    public static double[][] transpose(double[][] a) {
        double[][] result = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }

    public static double[] mult(double[][] a, double[] x) {
        double[] result = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i] += (a[i][j] * x[j]);
            }
        }

        return result;
    }

    public static double[] mult(double[] y, double[][] a) {
        double[] result = new double[y.length];

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i] += (y[j] * a[j][i]);
            }
        }

        return result;
    }

    public static void printMatrix(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] a = new double[][] {{1, 2, 3}, {4, 5, 6}};
        double[][] b = new double[][] {{1, 4}, {2, 5}, {3, 6}};
        double[] x = new double[] {2, 3, 4};
        double[] y = new double[] {4, 6, 8};
        double[] d = new double[] {2, 3};

        System.out.println(dot(x, y));
        double[][] trans = transpose(a);
        printMatrix(trans);

        double[][] multMatrix = mult(a, b);
        printMatrix(multMatrix);

        double[] dMultM = mult(d, a);
        for (int i = 0; i < dMultM.length; i++) {
            System.out.printf(dMultM[i] + "\t");
        }
        System.out.println();

        double[] mMultD = mult(b, y);
        for (int i = 0; i < mMultD.length; i++) {
            System.out.printf(mMultD[i] + "\t");
        }
        System.out.println();
    }
}
