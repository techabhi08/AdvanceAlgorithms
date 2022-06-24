package com.abhinaygarg.placement_2022_05_25;

public class sortedUniquePermutation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
        printCombinations(arr, n, r);
    }

    public static void permute(int[] arr, int[] data, int start, int end, int index, int r){
        if(index == r){
            for(int i = 0; i < r; i++){
                System.out.print(data[i] + " ");
            }
            System.out.println(" ");
            return;
        }

        for(int i = start; i < end && end-i+1 >= r - index; i++){
            data[index] = arr[i];
            permute(arr, data, i + 1, end, index + 1, r);
        }
    }

    public static void printCombinations(int[] arr, int n, int r){
        int[] data = new int[r];
        permute(arr, data, 0, n - 1, 0, r);
    }
}
