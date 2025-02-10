package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    private void bfs(int node, List<Integer>[] adjLs, boolean[] vis){
        vis[node] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()){
            int i = q.poll();

            for(int adjNodes : adjLs[i]){
                if(!vis[adjNodes]){
                    vis[adjNodes] = true;
                    q.add(adjNodes);
                }
            }
        }
    }
}
