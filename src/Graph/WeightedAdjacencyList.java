package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class WeightedAdjacencyList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>(n + 1);

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));

        }
        sc.close();
    }


}

class Pair{

    public int node;
    public int weight;

    public Pair(int node, int weight){
        this.node = node;
        this.weight = weight;
    }

    public int getNode(){
        return this.node;
    }

    public int getWeight(){
        return this.weight;
    }
}
