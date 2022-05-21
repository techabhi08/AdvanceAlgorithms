// Given an array arr[]. Find the maximum value of prefix sum which is also suffix sum for index i in arr[].


public class MaximumEquilibriumSumInArray {
    public static void main(String[] args) {
        int[] arr = {-2, 5, 3, 1, 2, 6, -4, 2};
        System.out.println(findMaxSum(arr));
    }

    public static int findMaxSum(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int prefix = 0;
        int suffix = 0;
        int max_sum = Integer.MIN_VALUE;

        while(i -1 <= j){
            if(prefix > suffix){
                suffix += arr[j];
                j--;
//                System.out.println("A");
            }
            else if(prefix < suffix){
                prefix += arr[i];
                i++;
//                System.out.println("B");
            }else if(prefix == suffix){
                max_sum =  Math.max(max_sum, prefix);
                suffix += arr[j--];
                prefix += arr[i++];
//                System.out.println("C");
            }
        }
        return max_sum;
    }
}
