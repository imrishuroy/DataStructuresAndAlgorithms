package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfProvinces2 {

    // TC -> O(V + E), SC -> O(V + E)
    public int numberOfProvinces(int[][] adj){

        int n = adj.length;
        List<List<Integer>> adjLs = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            adjLs.add(new ArrayList<>());
        }

        // convert adjacency matrix to adjacency list
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                // self nodes are not considered
                if(adj[i][j] == 1 && i != j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }

        boolean[] vis = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!vis[i]){
                count++;
                bfs(i, adjLs, vis);
            }
        }

        return count;
    }


    public static void dfs(int node, List<List<Integer>> adjLs, boolean[] vis){
        vis[node] = true;

        for(int it : adjLs.get(node)){
            if(!vis[it]){
                dfs(it, adjLs, vis);
            }
        }
    }

    public static void bfs(int node, List<List<Integer>> adjLs, boolean[] vis){
        vis[node] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            int it = queue.poll();
            for(int i : adjLs.get(it)){
                if(!vis[i]){
                    vis[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] adj = {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 0, 1}
            };

        NumberOfProvinces2 sol = new NumberOfProvinces2();

        /* Function call to find the
        provinces in the given graph */
        int ans = sol.numberOfProvinces(adj);

        System.out.println("The number of provinces in the given graph is: " + ans);

        }
    }

