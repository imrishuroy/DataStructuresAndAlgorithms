package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '1', '0', '1'},
                {'1', '0', '0', '0', '0'},
                {'1', '1', '1', '0', '1'},
                {'0', '0', '0', '1', '1'}
        };

        // Creating an instance of Solution class
        NumberOfIslands sol = new NumberOfIslands();

        /* Function call to find the
        number of islands in given grid */
        int ans = sol.numIslands(grid);

        System.out.println("The total islands in given grids are: " + ans);

    }


    private boolean isValid(int i, int j, int n, int m){
        if(i < 0 || i >= n) return false;
        if(j < 0 || j >= m) return false;

        return true;
    }

    private void bfs(int i, int j, boolean[][] vis, char[][] grid){
        vis[i][j] = true;

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{i, j});

        int n = grid.length;
        int m = grid[0].length;

        // Until the queue becomes empty
        while(!q.isEmpty()){
            // Get the cell from queue
            int[] cell = q.poll();

            // Determine its row & column
            int row = cell[0];
            int col = cell[1];

            for(int delRow = -1; delRow <= 1; delRow++){
                for(int delCol = -1; delCol <= 1; delCol++){

                    int newRow = row + delRow;
                    int newCol = col + delCol;

                    // check if the new cell is valid, unvisted and a land cell
                    if(isValid(newRow, newCol, n, m)
                            && grid[newRow][newCol] == '1'
                            && !vis[newRow][newCol]){

                        // Mark the node as visted
                        vis[newRow][newCol] = true;

                        q.add(new int[]{newRow, newCol});

                    }
                }
            }

        }
    }

    // TC -> O(n * m)
    // SC -> O(n * m)
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        // visited array
        boolean[][] vis = new boolean[n][m];

        int count = 0;

        // traverse the grid
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // if not visited and is a land, start a new traversal
                if(!vis[i][j] && grid[i][j] == '1'){
                    count++;
                    bfs(i, j, vis, grid);
                }
            }
        }

        return count;

    }

}
