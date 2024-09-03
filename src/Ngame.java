import java.util.*;
public class Ngame {
    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        int i = 0;
        int k = 0;
        while(answer.length() != t){
            String s = Integer.toString(i , n);
            s = s.toUpperCase();
            for(int j = 0; j < s.length(); j++){
                String token = s.substring(j , j+1);
                if((p-1) == k % m){
                    answer += token;
                }
                if(answer.length() ==t){
                    break;
                }
                k++;
            }
            i++;
        };

        return answer;
    }

    public static void main(String[] args) {
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;
        System.out.println(solution(n,t,m,p));

        int n2 = 16;
        int t2 = 16;
        int m2 = 2;
        int p2 = 1;
        System.out.println(solution(n2,t2,m2,p2));

    }

}
