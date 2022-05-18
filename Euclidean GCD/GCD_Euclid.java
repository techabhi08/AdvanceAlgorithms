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
    }
}
