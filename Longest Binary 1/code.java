package com.abhinaygarg.placement_2022_05_19;

public class LongestBinary1 {
    public static void main(String[] args) {
        System.out.println(maxWidth("0100111101001111"));

    }

    public static int maxWidth(String num){
        int[] ans = new int[num.length()];
        int count = 0;
        boolean isZero = false;
        char[] arr = num.toCharArray();
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < num.length()){
            if(arr[i] == '1') {
                count++;
                i++;
            }
            else if(!isZero && arr[i] == '0'){
                isZero = true;
                count++;
            }else if(arr[i] == '0' && isZero){
                while(j < i && arr[j] != 0){
                    j++;
                }
                j++;
            }
            i++;
            ans[k++] = count;
        }

        int max = 0;
        for(int n : ans){
            if(n > max){
                max = n;
            }
        }
        return max;
    }
}
