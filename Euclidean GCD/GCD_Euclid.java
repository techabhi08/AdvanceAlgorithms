public class EuclideanGCD {
    public static void main(String[] args) {
        System.out.println(Euclidean(24, 27));
        System.out.println(Gcd_Sub(24, 27));
    }

    public static int Euclidean (int n1, int n2){

        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        int rem = 0;

        while(a % b != 0){
            rem = a % b;
            a = b;
            b = rem;

        }
        return rem;
        
        //Beliveing that the value of b is small only. Then the complexity will also be O(log B)
//        int temp = 0;
//        while(b != 0){
//            temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
    }
}
