package com.abhinaygarg.placement_2022_05_31;

public class WornsdorffAlgo {
    public static void main(String[] args) {
        solveKnightTour();
    }

    static boolean isSafe(int[][] ans, int nextX, int nextY){
        if(nextX >= 0 && nextX < 8 && nextY >= 0 && nextY < 8 && ans[nextX][nextY] == -1){
            return true;
        }
        return false;
    }

    static boolean solveKnightTour(){
        int[][] ans = new int[8][8];

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                ans[i][j] = -1;
            }
        }

        int[] moveX = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] moveY = {1, 2, 2, 1, -1, -2, -2, -1};

        ans[0][0] = 0;

        if(!isSolvable(0, 0, 1, ans, moveX, moveY)){
            System.out.println("The tour cannot be solved");
            return false;
        }else{
            printBoard(ans);
        }
        return true;
    }

    private static void printBoard(int[][] ans) {
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans.length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isSolvable(int x, int y, int count, int[][] ans, int[] moveX, int[] moveY){
        int knights, nextX, nextY;
        if(count == 64){
            return true;
        }
        for(knights = 0; knights < 8; knights++){
            nextX = x + moveX[knights];
            nextY = y + moveY[knights];
            if(isSafe(ans, nextX, nextY)){
                ans[nextX][nextY] = count;
                if(isSolvable(nextX, nextY, count + 1, ans, moveX, moveY)){
                    return true;
                }else{
                    ans[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }
}
