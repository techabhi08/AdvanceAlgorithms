public class EuclideanGCD {
    public static void main(String[] args) {
        System.out.println(Euclidean(24, 27));
        System.out.println(Gcd_Sub(24, 27));
    }

    public static int gcd_rec(int n1, int n2){
        if(n2 == 0){
            return n1;
        }
        return gcd_rec(n2, n1 % n2);
    }
}
