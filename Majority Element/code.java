// Write a function which takes an array and prints the majority element (if it exists), otherwise prints “No Majority Element”. 
// A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element)

public class MajorityElement {
    public static void main(String[] args) {

    }

    public static int findMajority(int[] nums){
//        Method 1
//         Arrays.sort(nums);
//         return nums[nums.length / 2];

        //Method 2
//        boolean swapped;
//        for(int i = 0; i < nums.length; i++){
//            swapped = false;
//            for(int j = 1; j < nums.length - i; j++){
//                if(nums[j] < nums[j - 1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j - 1];
//                    nums[j - 1] = temp;
//                    swapped = true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }
//        return nums[nums.length / 2];

        //Method 3
         Map<Integer, Integer> map = new HashMap<>();
         int ans = 0;

         for(int num : nums){
             if(!map.containsKey(num)){
                 map.put(num, 1);
             }else{
                 map.put(num, map.get(num) + 1);
             }
             if(map.get(num) > nums.length / 2){
                 ans = num;
             }
         }
         return ans;
    }
}
