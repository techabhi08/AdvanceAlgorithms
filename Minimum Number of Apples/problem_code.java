// Problem Statement:
// There are different kinds of apple trees in the four directions (East, West, North, South), 
// which may grow both red and green apples such that each tree grows exactly K apples, in the following manner:

// N – number of trees to the north do not have red apples.
// S – number of trees to the south do not have green apples.
// W – number of trees in the west have some red apples.
// E – number of trees in the east have some green apples.
// However, the colors of apples can not be distinguished outside the house. 
// So, the task is to find the minimum number of apples to be collected from the trees to guarantee M red apples. 
// If it is not possible, print -1.


// // Solution:
// The steps to approach this problem is simple:
//1st, The priority is always given to the trees in south. 
// If the number of apples that can be taken from south are greater than or equal to those of required then we print the apple.

// Secondly we check for trees in east and west. The minimum red apples considered on each tree in east and west is 1. Hence we count them as 1 only.
public class AppleProblem {
    public static void main(String[] args) {
        int M = 10;
        int K = 15;
        int N = 0;
        int S = 1;
        int W = 0;
        int E = 0;
        int result = appleCount(M, K, N, S, W, E);
        System.out.println(result);
    }

    static int appleCount(int M, int K, int N, int S, int W, int E){
//        Checking for the apples in south
        if(M <= K*S){
            return M;
        }

//        Checking for East and West direction
        if(M <= S*K + E + W){
            return S * K + (M - S * K) * K;
        }

        else{
            return -1;
        }
    }
}
