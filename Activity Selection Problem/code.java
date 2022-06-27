package com.abhinaygarg.placement_2022_06_01;

class Activity{
    int start;
    int finish;

    public Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {
    public static void main(String[] args) {
        int s[] =  {5, 1, 3, 0, 5, 8};
        int f[] =  {9, 2, 4, 6, 7, 9};

        printActivityCount(s, f);
    }
    public static void printActivityCount(int[] s, int[] f){
        int i = 0;
        System.out.print(i + " ");
        int count = 0;

        for(int j = i + 1; j < s.length; j++){
            if(s[j] >= f[i]){
                System.out.print(j + " ");
                i = j;
                count++;
            }
        }
        System.out.println(count);
    }
}
