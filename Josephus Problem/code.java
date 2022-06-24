package com.abhinaygarg.placement_2022_05_30;

import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 14;
        int k = 2;
        int index = 0;

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        jospehus(nums, k, index);
    }

    public static void jospehus(List<Integer> nums, int k, int index){
        if(nums.size() == 1){
            System.out.println(nums.get(0));
            return;
        }

        index = (index + k) % nums.size();
        nums.remove(index);
        jospehus(nums, k, index);
    }
}
