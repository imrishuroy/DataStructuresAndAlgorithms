package GoogleOnsite;

import java.util.LinkedList;
import java.util.Queue;


/**
 * Approach: Multi-Source BFS

 * 1. **Identify Torch Nodes:** Push all `16` nodes into a queue.
 * 2. **Breadth-First Search (BFS):**
 *    - For each node `(i, j)`, propagate power to its **unvisited adjacent nodes**.
 *    - The adjacent node gets `matrix[i][j] - 1`.
 *    - If a node already has a value, **store the maximum of the old and new values**.
 * 3. **Continue BFS Until No More Updates:**
 *    - Stop when all nodes are either visited or no further updates are possible.

 * Time Complexity: O(m * n) → Every node is processed once.
 * Space Complexity: O(m * n) → For the queue and visited array.

 */

public class LatticePowerPropagation {

    /**
     * Multi-source BFS to propagate power from torch nodes (16) to wire nodes (0).
     */
    public static int[][] latticeCube(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] vis = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Add all torch nodes (16s) to the queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 16) { // torch
                    queue.add(new int[]{i, j});
                    vis[i][j] = true;
                }
            }
        }

        // Possible directions: Right, Down, Up, Left
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        // Step 2: Multi-source BFS propagation
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] dir : directions) {
                int nRow = row + dir[0];
                int nCol = col + dir[1];

                // Step 3: Check if new position is valid and unvisited
                if (isValid(nRow, nCol, m, n) && !vis[nRow][nCol]) {
                    int newValue = matrix[row][col] - 1;

                    // Only update if newValue is greater than the current value
                    if (matrix[nRow][nCol] < newValue) {
                        matrix[nRow][nCol] = newValue;
                        queue.add(new int[]{nRow, nCol});
                        vis[nRow][nCol] = true;
                    }
                }
            }
        }

        return matrix;
    }

    /**
     * Checks if a given cell is within bounds of the matrix.
     */
    public static boolean isValid(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {16, 0, 16}, // Expected: {16, 15, 16}
                {0, 0, 0},   //           {15, 14, 15}
                {16, 0, 16}  //           {16, 15, 16}
        };

//        int[][] graph = {
//                {0, 0, 0, 0, 0},
//                {0, 16, 0, 16, 0},
//                {0, 0, 0, 0, 0}
//        };
//        14  15  14  15  14
//        15  16  15  16  15
//        14  15  14  15  14

        int[][] ans = latticeCube(graph);

        // Print the updated matrix
        for (int[] an : ans) {
            for (int i : an) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
    Why Multi-Source BFS?
    =====================

    Multi-source BFS is chosen because:

    1. **Simultaneous Power Propagation:**
       - All torch nodes (16s) act as sources of power and should start propagating at the same time.
       - A normal BFS (single-source) would process only one torch node at a time, which doesn't reflect real power propagation happening concurrently.

    2. **Shortest Path Nature:**
       - The BFS ensures each wire node receives power in the shortest number of steps from the nearest torch node.
       - If multiple torch nodes are influencing a wire node, it always gets the highest possible power value.

    3. **Avoiding Redundant Computation:**
       - If we did a separate BFS for every torch node, we would end up visiting the same nodes multiple times, making the approach inefficient.
       - Multi-source BFS queues all torch nodes initially, allowing all of them to propagate power in parallel.

    Why Not DFS?
    ------------
    DFS is **not** suitable because:
    - It doesn't guarantee shortest path propagation.
    - It can lead to incorrect power transmission order, as it explores one path deeply before others.
    - It might result in suboptimal power values in some cases.

    Visualization of Multi-Source BFS
    ---------------------------------
    **For input:**
        16  0  16
         0  0   0
        16  0  16

    **Initial Queue State (Multi-Source BFS):**
        Queue = [(0,0), (0,2), (2,0), (2,2)]

    **Step-by-Step Power Propagation:**
    - All 16s spread power to their adjacent 0s, setting them to 15.
    - The 15s then spread to their adjacent 0s, setting them to 14.
    - This continues until no more updates are possible.

    **Final Grid After BFS:**
        16  15  16
        15  14  15
        16  15  16

    **Conclusion:**
    - Multi-source BFS ensures optimal power propagation in parallel.
    - It guarantees the shortest path approach, making it the best choice for this problem.
    */
