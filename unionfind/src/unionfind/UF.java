package unionfind;  // Ensure this matches your directory structure

import java.util.Scanner;

public class UF {

  private int[] id;
  private int count;  // Number of components

  public UF(int N) {
    id = new int[N];
    count = N;  // Initially, each element is its own component
    for (int i = 0; i < N; i++) {
      id[i] = i;  // Each element is its own root
    }
  }

  // Find with path compression
  private int find(int p) {
    while (p != id[p]) {
      id[p] = id[id[p]]; // Path compression
      p = id[p];
    }
    return p;
  }

  // Check if two elements are connected
  public boolean connected(int p, int q) {
    return find(p) == find(q);
  }

  // Union by directly connecting all elements with root p to root q
  public void union(int p, int q) {
    if (connected(p, q)) return;

    int rootP = find(p);
    int rootQ = find(q);
    for (int i = 0; i < id.length; i++) {
      if (id[i] == rootP) id[i] = rootQ;
    }
    count--;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number of elements:");
    while (!scanner.hasNextInt()) {
      System.out.println("Please enter a valid integer:");
      scanner.next(); // Discard invalid input
    }
    int N = scanner.nextInt();
    UF uf = new UF(N);

    System.out.println("Enter pairs (enter -1 -1 to stop):");

    while (true) {
      System.out.println("Enter first integer of the pair:");
      while (!scanner.hasNextInt()) {
        System.out.println("Please enter a valid integer:");
        scanner.next(); // Discard invalid input
      }
      int p = scanner.nextInt();

      System.out.println("Enter second integer of the pair:");
      while (!scanner.hasNextInt()) {
        System.out.println("Please enter a valid integer:");
        scanner.next(); // Discard invalid input
      }
      int q = scanner.nextInt();

      if (p == -1 && q == -1) {
        break;
      }

      if (!uf.connected(p, q)) {
        System.out.println("Connecting " + p + " and " + q);
        uf.union(p, q);
      } else {
        System.out.println(p + " and " + q + " are already connected");
      }
    }

    scanner.close();
  }
}

