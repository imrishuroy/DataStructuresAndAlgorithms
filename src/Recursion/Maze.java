package Recursion;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
        int ans = count(3, 3);
        System.out.println(ans);

        path("", 3, 3);

    }

    static int count(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + 'D', r - 1, c);
        }

        if(c > 1){
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathRet(p + 'D', r - 1, c));
        }

        if(c > 1){
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
        return list;
    }
}
