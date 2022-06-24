package com.abhinaygarg.placement_2022_05_25;

public class maneuveringACave {
    public static void main(String[] args) {
        int[][] res = new int[3][3];
        System.out.println(countPathsDP(res, 3, 3));
    }

//    public static int countNumberOfPaths(int[][] res, int r , int c){
//        if(m == 1 || n == 1){
//            return 1;
//        }
//        return countNumberOfPaths(m - 1, n) + countNumberOfPaths(m, n - 1);

        //Method 2
//        if(r > res.length - 1 || c > res[0].length - 1){
//            return 0;
//        }
//        if(res[r][c] >= 1){
//            return res[r][c];
//        }
//
//        if(r == res.length - 1 && c == res[0].length - 1){
//            res[r][c] += 1;
//            return res[r][c];
//        }
//
//        return countNumberOfPaths(res, r + 1, c) + countNumberOfPaths(res, r, c + 1);

//    }

    public static int countPathsDP(int[][] res, int r , int c){
        if(r == 1 || c == 1){
            return res[r][c] = 1;
        }
        if(res[r][c] == 0){
            res[r][c] = countPathsDP(res, r - 1, c) + countPathsDP(res, r, c - 1);
        }
        return res[r][c];
    }
}
