package com.abhinaygarg.placement_2022_05_30;

public class RatMazeProblem {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, false, false},
                {false, true, true, false},
                {true, true, true, true},
                {false, false, true, true}
        };
        int count = 0;
        System.out.println(printPathsWithObstaclesCount("", board, 0, 0));
    }

    static int printPathsWithObstaclesCount(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return 1;
        }

        if(!maze[r][c]){
            return 0;
        }

        int count = 0;
        if(r < maze.length - 1) {
            count += printPathsWithObstaclesCount(p + 'D',maze, r + 1, c);
        }
        if(c < maze[0].length - 1) {
            count += printPathsWithObstaclesCount(p + 'R', maze, r, c + 1);
        }
        return count;
    }
}
