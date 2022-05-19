// Problem Statement:
// Through algorithm we need to find whether the given integer num in its binary form is a palindrome or not.
// To find this we follow few simple steps:
// 1st Find the binary representation of the given integer number.
// 2nd, as usual check if the given string is palindrome or not.


public class BinaryPalindrome {
    public static void main(String[] args) {
        int num = 21;
        System.out.println(convert_Binary(num));
    }

    public static boolean isPalindrome(String n){
        int num = Integer.parseInt(n);
        System.out.println(num);
        int temp = num;
        int reverse = 0;
        while(temp != 0){
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
//        System.out.println(num);
        System.out.println(reverse);
        if(reverse == num){
            return true;
        }else{
            return false;
        }
    }

    public static boolean convert_Binary(int num){
        String result = "";
        while(num != 0){
            int rem = num % 2;
            num = num/2;
            result += rem;
        }
        return isPalindrome(result);
    }
}
