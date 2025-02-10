package Recursion;

public class TowerOfHanoi {

    /*
    The Tower of Hanoi problem involves moving a stack of disks from one peg to another, following these rules:


    Only one disk can be moved at a time.
    A disk can only be placed on top of a larger disk or an empty peg.
    All disks start on one peg and need to be moved to another peg using an intermediate peg.
    For 𝑛=3 disks, the goal is to move all disks from the source peg (A) to the
    destination peg (C) using the helper peg (B).

     https://assets.leetcode.com/users/images/38641515-cbb8-4a80-a9a5-19e564ff6129_1717739212.600768.png

      Explanation
    Problem: Move n disks from peg A (source) to peg C (destination) using peg B (helper).

    Rules:

    Move one disk at a time.
    A larger disk cannot be placed on a smaller disk.
    Program Breakdown

    Main Method:

    Initializes the number of disks (n = 3).
    Calls towerOfHanoi to solve the puzzle.
    towerOfHanoi Method:

    Base Case: If there is only 1 disk, move it directly from the source peg to the destination peg.


    Recursive Steps:

    Move n−1 disks from the source peg to the helper peg.
    Move the nth disk from the source peg to the destination peg.
    Move the n−1 disks from the helper peg to the destination peg.

     */

    public static void main(String[] args) {

        int n = 3; // number of disk
        towerOfHanoi(n, "A", "B", "C");

    }

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer from src to helper
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        // transfer from helper to dist
        towerOfHanoi(n - 1, helper, src, dest);
    }
}
