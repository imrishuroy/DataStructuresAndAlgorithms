package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
    Number of provinces

    Given an undirected graph with V vertices. Two vertices u and v belong to a single province if there is a path from u to v or v to u.
    Find the number of provinces. The graph is given as an n x n matrix adj where adj[i][j] = 1 if the ith city and the jth city are directly connected, and adj[i][j] = 0 otherwise.
    A province is a group of directly or indirectly connected cities and no other cities outside the group.
 */

public class NumberOfProvinces {


    private void bfs(int node, List<Integer>[] adjLs, boolean[] vis){
        vis[node] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()){
            int i = q.poll();

            for(int adjNode : adjLs[i]){
                if(!vis[adjNode]){
                    vis[adjNode] = true;
                    q.add(adjNode);
                }
            }
        }
    }

    private void dfs(int node, List<Integer>[] adjLs, boolean[] vis){
        vis[node] = true;

        for(int it:  adjLs[node]){
            if(!vis[it]){
                dfs(it, adjLs, vis);
            }
        }
    }

    public int numProvinces(int[][] adj){

        int V = adj.length;

        // store/create adjacency list
        List<Integer>[] adjLs = new ArrayList[V];
        for(int i = 0; i < V; i++){
            adjLs[i] = new ArrayList<>();
        }

        // convert adjacency matrix to adjacency list
        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                // self nodes are not considered
                if(adj[i][j] == 1 && i != j){
                    adjLs[i].add(j);
                    adjLs[j].add(i);
                }
            }
        }

        // visited array
        boolean[] vis = new boolean[V];

        // variable to store number of provinces
        int count = 0;

        // start traversal
        for(int i = 0; i < V; i++){
            // if the node is not visited
            if(!vis[i]){
                // increment counter
                count++;
                bfs(i, adjLs, vis);
                // start traversal from current node


            }
        }
        return count;
    }
}
