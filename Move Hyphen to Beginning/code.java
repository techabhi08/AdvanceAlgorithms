public class MoveHyphenToBeginning {
    public static void main(String[] args) {

    }

//    public static void moveHyphen(int[] arr){
//        int count = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == '-'){
//                count++;
//            }
//        }
//        while(count > 0){
//            System.out.println('-');
//            count--;
//        }
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] != '-'){
//                System.out.println(arr[i]);
//            }
//        }
//    }
    public static void moveHyphen(char[] arr){
        int i = arr.length - 1;
        for(int j = i; j >= 0; j++){
            if(arr[j] == '-'){
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i--;
            }
        }
    }
}
