public class StroboGrammatic {
    public static void main(String[] args) {
        System.out.println(pseudoBrute(19891));
    }
  
    static boolean pseudoBrute(int n){
        int[] arr = new int[n];
        int i = 0;
        while(n  > 0){
            int num = n % 10;
            if(num == 0 || num == 1 || num == 8){
                arr[i] = num;
            }
            else if(num == 6){
                arr[i] = 9;
            }else if(num == 9){
                arr[i] = 6;
            }else{
                return false;
            }
            n = n / 10;
            i++;
        }

        int reverse = 0;
        for(int j = 0; j < arr.length; j++){
            reverse = reverse * 10 + arr[j];
        }

        return reverse == n;
    }
}
