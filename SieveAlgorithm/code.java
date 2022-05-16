public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30;
        System.out.print("Following are the prime numbers ");
        sieve(n);
    }

    static void sieve(int n){
//        Making an array of type boolean and assuming each number
//        as a prime number, hence making all the numbers initially prime.
        boolean[] isPrime = new boolean[n + 1];
        for(int i = 0; i <= n; i++){
            isPrime[i] = true;
        }

        for(int j = 2; j * j <= n; j++){
//            checking is prime of j is not changed after iteration then it will be prime only.
//            hence we will iterate over multiples of this j as well
            if(isPrime[j]){
//                make all the multiples of j as false, they won't be counted as prime number
                for(int k = j * j; k <= n; k += j){
                    isPrime[k] = false;
                }
            }
        }

//        Printing all the prime numbers
        for(int i = 1; i <= n; i++){
            if(isPrime[i]){
                System.out.println(i + " ");
            }
        }
    }
}
