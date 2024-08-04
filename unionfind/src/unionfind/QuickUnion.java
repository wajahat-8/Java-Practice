package unionfind;

public class QuickUnion {
    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(10);

        // Performing some union operations
        qu.union(4, 3);
        qu.union(3, 8);
        qu.union(6, 5);
        qu.union(9, 4);
        qu.union(2, 1);

        // Checking if some elements are connected
        System.out.println("Connected (8, 9): " + qu.connected(8, 9)); // Should print true
        System.out.println("Connected (5, 4): " + qu.connected(5, 4)); // Should print false

        // Performing more union operations
        qu.union(5, 0);
        qu.union(7, 2);
        qu.union(6, 1);
        qu.union(7, 3);

        // Checking if some elements are connected
        System.out.println("Connected (0, 7): " + qu.connected(0, 7)); // Should print true
    }
}
