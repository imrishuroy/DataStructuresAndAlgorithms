package AlgoMonster;

/*
    Approach & Intuition
    Instead of storing the entire board (O(n²) space) and checking for a win after every move (O(n) time complexity), we can optimize the process to O(1) time per move by keeping track of row, column, and diagonal scores.

    Key Observations
    Each row, column, and diagonal should contain only one player's marks for a win.
    We use integer arrays (rows and cols) to track the sum of marks per row and column:

    Player 1 contributes +1.
    Player 2 contributes -1.

    If any row/column sum reaches +n (player 1) or -n (player 2), that player wins.
    Similarly, track diagonal and anti-diagonal:

    Specifically for diagonals, we can observe two properties:

    The indices for the primary diagonal (row == col) are the same,
    so we can use a single counter for the entire diagonal.

    The indices for the secondary diagonal (row + col == n - 1) also form a unique pattern,
    allowing us to use another single counter.

        Main diagonal: (0,0) → (1,1) → (n-1,n-1).
        Anti-diagonal: (0,n-1) → (1,n-2) → (n-1,0).

    If either reaches +n or -n, a player wins.
    Optimized Solution
    Each move:

    Updates row, column, diagonal, or anti-diagonal counts in O(1).
    Checks if any of them reached ±n, declaring a winner instantly.
 */

class TicTacToe {
    private final int[] rows;
    private final int[] cols; // Track sum of marks per row and column
    private int diag, antiDiag; // Track main diagonal and anti-diagonal sums
    private final int n; // Board size

    /** Initialize the game board of size n x n */
    public TicTacToe(int n) {
        this.n = n;
        rows = new int[n]; // Stores row-wise sum of marks
        cols = new int[n]; // Stores column-wise sum of marks
        diag = 0; // Sum for the main diagonal
        antiDiag = 0; // Sum for the anti-diagonal
    }

    /**
     * Player {player} makes a move at (row, col).
     * @return 0 if no one wins yet, else return the winning player (1 or 2).
     */
    // TC - O(1)
    // SC - O(n)
    public int move(int row, int col, int player) {
        int mark = (player == 1) ? 1 : -1; // Player 1 uses +1, Player 2 uses -1

        // Update row and column counters
        rows[row] += mark;
        cols[col] += mark;

        // Update diagonal counters if applicable
        if (row == col) diag += mark; // Main diagonal condition
        if (row + col == n - 1) antiDiag += mark; // Anti-diagonal condition

        // If any row, column, or diagonal has n or -n, player wins
        if (Math.abs(rows[row]) == n || Math.abs(cols[col]) == n ||
                Math.abs(diag) == n || Math.abs(antiDiag) == n) {
            return player; // Declare the winner
        }

        return 0; // No winner yet
    }

    public static void main(String[] args) {
        TicTacToe toe = new TicTacToe(3);
        System.out.println(toe.move(0, 0, 1)); // Player 1 moves at (0,0) -> No win
        System.out.println(toe.move(0, 2, 2)); // Player 2 moves at (0,2) -> No win
        System.out.println(toe.move(2, 2, 1)); // Player 1 moves at (2,2) -> No win
        System.out.println(toe.move(1, 1, 2)); // Player 2 moves at (1,1) -> No win
        System.out.println(toe.move(2, 0, 1)); // Player 1 moves at (2,0) -> No win
        System.out.println(toe.move(1, 0, 2)); // Player 2 moves at (1,0) -> No win
        System.out.println(toe.move(2, 1, 1)); // Player 1 moves at (2,1) -> **Wins**

    }

}
