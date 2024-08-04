package unionfind;

public class WeightedQuickUnion {
	private int[] id;
	private int[] sz;
	public WeightedQuickUnion(int N) {
		id =new int[N];
		sz =new int[N];
		for(int i=0;i<N;i++) {
			id[i]=i;
			sz[i]=1;
		}
	}
	private int root(int i) {
		while(i!=id[i]){
			id[i]=id[id[i]];
			i=id[i];
		}
		return i;
	}
	public void union(int p,int q) {
		int i =root(p);
		int j=root(q);
		if(i==j) return;
		if(sz[i]<sz[j]) {
			id[i]=j;
			sz[j]+=sz[i];
			
		}
		else {
			id[j]=i;
			sz[i]+=sz[j];
		}
	}
	public boolean connected(int p,int q) {
		return root(p)==root(q);
	}
	  public static void main(String[] args) {
	        int N = 10; // Example size of the union-find structure
	        WeightedQuickUnion wqu = new WeightedQuickUnion(N);

	        // Perform some union operations
	        wqu.union(4, 3);
	        wqu.union(3, 8);
	        wqu.union(6, 5);
	        wqu.union(9, 4);
	        wqu.union(2, 1);

	        // Check if certain elements are connected
	        System.out.println("Connected (8, 9): " + wqu.connected(8, 9)); // Should print true
	        System.out.println("Connected (5, 4): " + wqu.connected(5, 4)); // Should print false

	        // Perform more union operations
	        wqu.union(5, 0);
	        wqu.union(7, 2);
	        wqu.union(6, 1);
	        wqu.union(7, 3);

	        // Check again if certain elements are connected
	        System.out.println("Connected (0, 7): " + wqu.connected(0, 7)); // Should print true
	    }

}
