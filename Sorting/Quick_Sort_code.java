package com.abhinaygarg.placement_2022_05_23;

public class QuickSort {
    public static void main(String[] args) {
      int[] arr = {3, 5, 1, 7, 9, 2, 45};
      quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int s = lo;
        int e = hi;
        int mid = s + (e - s)/2;
        int pivot = arr[mid];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, lo, e);
        quickSort(arr, s, hi);
    }
}
