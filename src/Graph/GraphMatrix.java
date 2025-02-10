package Graph;

import java.util.Scanner;

public class GraphMatrix {

    // undirected Graph

    // SC - O(N*N)
    // it is preferred for dense graphs where the number of edges is more
    public static void main(String[] args) {

        // Taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // adjacency matrix for undirected graph
        int[][] adj = new int[n + 1][n + 1];

        // add the edge to the matrix
        for(int i = 0; i < m; i++){
            // taking the input
            int u = sc.nextInt();
            int v = sc.nextInt();

            // adding the edges
            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        sc.close();
    }
}
