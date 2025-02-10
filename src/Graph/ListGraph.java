package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class ListGraph {


    // SC - O(2 * E) - undirected graph
    // SC - O(E), where E denotes the number of edges,

    // This representation is much better than the adjacency matrix for sparse graphs
    // (where the number of edges is less), as matrix representation consumes n² locations,
    // and most of them are unused.
    public static void main(String[] args) {
        // Taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // adjacency list for undirected graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n + 1);

        // Initialize the adjacency list
        for (int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        // All the neighbors of a particular node were stored in its respective list.
        // In this representation, for an undirected graph, each edge data appears twice.
        // For example, nodes 1 and 2 are adjacent hence node 2 appears in the list of node 1,
        // and node 1 appears in the list of node 2.
        for(int i = 0; i < m; i++){

            // taking the input
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Adding the edges
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        sc.close();
    }
}
