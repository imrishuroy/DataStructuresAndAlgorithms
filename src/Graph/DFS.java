package Graph;

import java.util.List;

public class DFS {

    private void dfs(int node, List<Integer>[] adjLs, boolean[] vis){

        // mark the node as visited
        vis[node] = true;

        for(int it : adjLs[node]){
            if(!vis[it]){
                dfs(it, adjLs, vis);
            }
        }
    }
}
