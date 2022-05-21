// Given an array that contains both positive and negative integers, find the product of the maximum product subarray. 
// Expected Time complexity is O(n) and only O(1) extra space can be used.

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 6};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr[i], min * arr[i]), arr[i]);
            min = Math.min(Math.min(temp * arr[i], min * arr[i]), arr[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}
