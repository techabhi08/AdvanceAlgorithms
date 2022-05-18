import java.util.Stack;

public class StroboGrammatic {
    public static void main(String[] args) {
        System.out.println(stackPseudo(19891));
        System.out.println(pseudoBrute(19891));
    }

    static boolean stackPseudo(int n){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(n != 0){
            int num = n % 10;
            if(num == 0 || num == 1 || num == 8) {
                s1.push(num);
            }else if(num == 6){
                s1.push(9);
            }else if(num == 9){
                s1.push(6);
            }else{
                return false;
            }
            n /= 10;
        }
//        System.out.println(s1);
        int s1_size = s1.size() / 2;

        while(s2.size() < s1_size ){
            int num = s1.pop();
            s2.push(num);
        }

        System.out.println(s1);
        System.out.println(s2);

        if(s1.size() > s2.size()){
           s1.pop();
        }else if(s1.size() < s2.size()){
            s2.pop();
        }

        while(!s1.empty()){
            int n1 = s1.pop();
            int n2 = s2.pop();
            if(n1 != n2)
                return false;
        }
        return true;
    }
}
