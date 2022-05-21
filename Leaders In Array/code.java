// Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side.
// And the rightmost element is always a leader. For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2. 
// Let the input array be arr[] and size of the array be size.

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 8, 7, 9, 11, -2, 0};
        leaders(arr, 7);
    }

    public static void leaders(int[] arr, int n){
        int maxElement = arr[n - 1];

        System.out.print(maxElement + " ");
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > maxElement){
                maxElement = arr[i];
                System.out.print(maxElement + " ");
            }
        }
    }
}
