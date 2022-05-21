// Given a 2D matrix, the task is to find the maximum sum of an hourglass.

// An hour glass is made of 7 cells
// in following form.
//     A B C
//       D
//     E F G

// Input : 1 1 1 0 0 
//         0 1 0 0 0 
//         1 1 1 0 0 
//         0 0 0 0 0 
//         0 0 0 0 0 
// Output : 7
// Below is the hour glass with
// maximum sum:
// 1 1 1 
//   1
// 1 1 1

// mat[][] = 2 3 0 0 0 
//           0 1 0 0 0
//           1 1 1 0 0 
//           0 0 2 4 4
//           0 0 0 2 0
// Possible hour glass are :
// 2 3 0  3 0 0   0 0 0  
//   1      0       0 
// 1 1 1  1 1 0   1 0 0 

// 0 1 0  1 0 0  0 0 0 
//   1      1      0  
// 0 0 2  0 2 4  2 4 4 

// 1 1 1  1 1 0  1 0 0
//   0      2      4
// 0 0 0  0 0 2  0 2 0


public class MaximumSumOfHourGlass {

    public static void main(String[] args) {
        int[][] mat = {{0, 3, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 0, 2, 4, 4},
                {0, 0, 0, 2, 4}};
        find_max(mat);
    }

    private static int find_max(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
//        int[][] hour_glass = {{0,0}, {0,1}, {0,2}, {1,1}, {2,0}, {2, 1}, {2,2}};
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < r - 2; i++){
            for(int j = 0; j < c - 2; j++){
                int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);
                if(sum > max_sum){
                    max_sum = sum;
                }
            }
        }
        return max_sum;
    }


}
