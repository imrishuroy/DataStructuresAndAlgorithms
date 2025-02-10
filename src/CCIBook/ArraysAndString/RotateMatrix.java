package CCIBook.ArraysAndString;

public class RotateMatrix {

    public static void main(String[] args) {

    }

    // TC -> O(N^2)
    public static void rotate(int[][] matrix){
        if(matrix.length == 0 || matrix.length != matrix[0].length) {
            return; // not a square matrix;
        }

        int n = matrix.length;
        for(int layer = 0; layer < n / 2; layer++){
            int last = n - 1 - layer;
            for(int i = layer; i < last; i++){
                int offset = i - layer;
                int top = matrix[layer][i]; // save top

                // left -> top
                matrix[layer][i] = matrix[last - offset][layer];

                // bottom -> left
                matrix[last - offset][layer] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }
    }
}
