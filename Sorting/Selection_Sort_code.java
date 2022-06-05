package com.abhinaygarg.placement_2022_05_23;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int findLargest(int[] arr, int start, int end){
        int max = start;
        for(int i = 0; i < end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = findLargest(arr, 0 , last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
