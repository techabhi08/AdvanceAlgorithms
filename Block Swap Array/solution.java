// Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements. 

// Initialize A = arr[0..d-1] and B = arr[d..n-1]
// 1) Do following until size of A is equal to size of B

//   a)  If A is shorter, divide B into Bl and Br such that Br is of same 
//        length as A. Swap A and Br to change ABlBr into BrBlA. Now A
//        is at its final place, so recur on pieces of B.  

//    b)  If A is longer, divide A into Al and Ar such that Al is of same 
//        length as B Swap Al and B to change AlArB into BArAl. Now B
//        is at its final place, so recur on pieces of A.

// 2)  Finally when A and B are of equal size, block swap them.


import java.util.Arrays;

public class BlockSwapArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        block_swap(arr, 2, 7);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int start, int end, int d){
        for(int i = 0; i < d; i++){
            int temp = arr[start + i];
            arr[start + i] = arr[end + i];
            arr[end + i] = temp;
        }
    }

    public static void block_swap(int[] arr, int d, int n){
        rotate_array(arr, 0, d, n);
    }

    private static void rotate_array(int[] arr, int i, int d, int n) {
        if(d == 0 || d == n){
            return;
        }
        if(n - d == d)
        {
            swap(arr, i, n - d + i, d);
            return;
        }

        /* If A is shorter*/
        if(d < n - d)
        {
            swap(arr, i, n - d + i, d);
            rotate_array(arr, i, d, n - d);
        }
        else /* If B is shorter*/
        {
            swap(arr, i, d, n - d);
            rotate_array(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
        }
    }
}
