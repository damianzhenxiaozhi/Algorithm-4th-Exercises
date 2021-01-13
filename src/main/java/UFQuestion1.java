import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UFQuestion1 {
    private int[] parent;
    private int[] sz;
    private int count;

    public UFQuestion1(int n) {
        count = n;
        parent = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            sz[n] = 1;
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int p) {
        while (parent[p] != p) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }

        return p;
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (rootP == rootQ) {
            return;
        }

        if (sz[rootP] > sz[rootQ]) {
            parent[rootQ] = rootP;
            sz[rootP] += sz[rootQ];
        } else {
            parent[rootP] = rootQ;
            sz[rootQ] += sz[rootP];
        }

        count--;
    }

    public boolean allConnected() {
        return count == 0;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UFQuestion1 uf = new UFQuestion1(N);
        while (!StdIn.isEmpty()) {
            String timestamp = StdIn.readString();
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            uf.union(p, q);
            if (uf.allConnected()) {
                StdOut.println(timestamp);
                break;
            }
        }
    }
}
