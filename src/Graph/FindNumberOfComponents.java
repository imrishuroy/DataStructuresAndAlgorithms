package Graph;

import java.util.*;

public class FindNumberOfComponents {

    // TC -> O(V + E)
    // SC -> O(V + E)
    public int findNumberOfComponent(int E, int V, List<List<Integer>> edges){

        List<List<Integer>> adjList = new ArrayList<>(V);

        // to store adjacency list
        for(int i = 0; i < V; i++){
            adjList.add(new ArrayList<>());
        }

        // Add edges to adjacency list
        for(int i = 0; i < E; i++){
            adjList.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            adjList.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }

        boolean[] vis = new boolean[V];

        int count = 0;
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                count++;
                // search
                dfs(i, adjList, vis);
//               bfs(i, adjList, vis);
            }
        }

        return count;
    }

    private void dfs(int node, List<List<Integer>> adjLs, boolean[] vis){
        // make the node as visited
        vis[node] = true;

        // traverse its unvisited neighbours
        for(int it : adjLs.get(node)){
            if(!vis[it]){
                dfs(it, adjLs, vis);
            }
        }
    }

    private void bfs(int node, List<List<Integer>> adjLs, boolean[] vis){
        // mark the node as visited
        vis[node] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()){

            int i = q.poll();

            for(int adjNode: adjLs.get(i)){
                if(!vis[adjNode]){
                    vis[adjNode] = true;
                    q.add(adjNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 4, E = 2;
        List<List<Integer>> edges = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 2)
        );

        /* Creating an instance of
        Solution class */
        FindNumberOfComponents sol = new FindNumberOfComponents();

        /* Function call to find the number of
        connected components in the given graph */
        int ans = sol.findNumberOfComponent(E, V, edges);

        System.out.println("The number of components in the given graph is: " + ans);
    }
}
