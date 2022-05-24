// Given a string P consisting of small English letters and a string Q consisting of weight of all characters of English alphabet such that for all ‘i’, 0 ≤ Q[i] ≤ 9. 
// The task is to find the total numbers of unique substring with sum of weights atmost K.

public class WeightedSubstring {
    public static void main(String[] args) {
        String P = "HelloWorld";
        String Q = "4987653215";
        int K = 20;
        int N = P.length();
        findMaxWeightedSubstring(P, Q, K, N);
    }

    private static void findMaxWeightedSubstring(String P, String Q, int K, int N) {

        for(int i = 0; i < N; i++){
            int ans = 0;
            String s = "";

            for(int j = i; j < N; j++){
                s += P.charAt(j);
                int weight = Q.charAt(j) - '0';
                ans += weight;

                if(ans <= K){
                    System.out.print(s + " : ");
                    System.out.println(ans);
                }else{
                    break;
                }
            }
        }
    }
}
