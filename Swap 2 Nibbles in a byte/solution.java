// A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte. 
// Given a byte, swap the two nibbles in it. For example 100 is be represented as 01100100 in a byte (or 8 bits). 
// The two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.

// The algorithm follows simple steps.
// We 1st convert the given integer input to binary representation
// Then divide the binary representation into 2 halfs.
// Now swap both the halves and merge them together.

public class SwapNibbles {
    public static void main(String[] args) {
        int x = 100;
        String ans = convertToBinary(x);
        System.out.println(ans);
        System.out.println(swapNibbles(ans));
        System.out.println(swapNibbles_binary(100));
    }


//  Brute force
    public static String swapNibbles(String n){
        StringBuilder last_four = new StringBuilder();
        StringBuilder first_four = new StringBuilder();
        int j = 0;
        for(int i = n.length() - 1; i >= 4; i--){
            last_four.append(n.charAt(i));
            first_four.append(n.charAt(j++));
        }

        first_four.reverse();
//        System.out.println(first_four);
//        System.out.println(last_four);

        StringBuilder result = new StringBuilder(first_four);
        result.append(last_four);
        String ans = result.toString();
        return ans;
    }

    public static String convertToBinary(int n){
        String result = "";
        while(n != 0){
            int rem = n % 2;
            n /= 2;
            result += rem;
        }
        while(result.length() < 8){
            result += "0";
        }
        return result;
    }

    static int swapNibbles_binary(int n){
        return ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
        //0x0F is a hexadecimal representation which depicts  0000 1111. gives the lower 4 bits
        //0xF0 represents 1111 0000. gives out the upper 4 bits.
    }
}
