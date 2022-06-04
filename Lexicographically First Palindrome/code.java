package com.abhinaygarg.placement_2022_05_23;

import java.util.Scanner;

public class LexicographicallyFirstPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isPalindromicString(str));
    }

    static void countFrequency(String str, int[] freq, int len){
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }
    }

    static boolean checkIfPalindromic(int[] freq, int len){
        int odds = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] % 2 != 0){
                odds++;
            }
        }

        if(len % 2 == 0){
            if(odds > 0){
                return false;
            }else{
                return true;
            }
        }
        if(odds != 1){
            return false;
        }
        return true;
    }

    static String isPalindromicString(String str){
        int len = str.length();
        int[] freq = new int[26];
        countFrequency(str, freq, len);
        if(!checkIfPalindromic(freq, len)){
            return "No palindromic string exist";
        }

        String odd_str = findOddAndRemoveItsFrequency(freq);

        String front_str = "";
        String rear_str = "";
        for(int i = 0; i < 26; i++){
            String temp = "";
            if(freq[i] != 0){
                char ch = (char)(i + 'a');

                for(int j = 0; j < freq[i] / 2; j++){
                    temp += ch;
                }
                front_str = front_str + temp;
                rear_str = temp + rear_str;
            }
        }
        return front_str + odd_str + rear_str;
    }

    private static String findOddAndRemoveItsFrequency(int[] freq) {
        String odd_str = "";
        for(int i = 0; i < 26; i++){
            if(freq[i] % 2 != 0){
                freq[i]--;
                odd_str += (char)(i + 'a');
                return odd_str;
            }
        }
        return odd_str;
    }
}
