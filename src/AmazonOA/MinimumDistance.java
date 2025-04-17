package AmazonOA;

/*
    Amazon Fresh is grocery delivery service that offers consumers the option of purchasing their groceries online and having them delivered on schedule.
    The Amazon Fresh team is planning a route for a delivery truck to deliver customer orders in the city of Techlandia.
    The planner will create a delivery area for each order to effectively plan the route. The area is abstracted as a grid.
    Not all locations are accessible by road. The truck only need to make a single delivery.

    Write an algorithm to determine the minimum distance required for the truck to deliver the order.

    Assumptions:
    Some places in the delivery area cannot be accessed by the driver, as there are no roads in those locations.
    The delivery area can be represented as the two-dimensional grid of Integer, where each integer represents one cell.
    The truck must start from top-left corner of the area, which is always accessible and can move one cell up, down, left or right at a time.
    The truck must navigate around the areas without roads and cannot leave the area.
    The accessible areas are represented as 1, areas without roads are represented by 0 and the order designated is represented by 9.

    Input
    The Input to the function/method consists of one argument:
    area, representing the two-dimensional grid of Integers.

    Output:
    Return an Integer representing the total distance traversed to deliver the order else return -1;

    Constraints:
    1 <= rows, columns, <= 10^3

    Example

    Input:
    area =
    [[1, 0, 0],
    [1, 0, 0],
    [1, 9, 1]]

    Output:
    3

    Explanation:
    Starting from the top-left corner, the truck traversed the cell (0, 0) -> (1, 0) -> (2, 0) -> (2, 1),
    The truck traversed the total distance to deliver the order.
    So, the output is 3.


 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumDistance {

    public static void main(String[] args) {

        List<List<Integer>> area = Arrays.asList(
                Arrays.asList(1, 0, 0),
                Arrays.asList(1, 0, 0),
                Arrays.asList(1, 9, 1)
        );

        int minDistance = minimumDistance(area);
        System.out.println(minDistance);
    }

    public static int minimumDistance(List<List<Integer>> area){

        int rows = area.size();
        int cols = area.get(0).size();

        if(area.get(0).get(0) == 0) return -1;

        boolean[][] visited = new boolean[rows][cols];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 0});
        visited[0][0] = true;

        int[][] directions = { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int dist = current[2];

            if(area.get(row).get(col) == 9){
                return dist;
            }

            for(int [] dir: directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !visited[newRow][newCol] && area.get(newRow).get(newCol) != 0){
                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol, dist + 1});
                }

            }
        }
        return -1;
    }
}
