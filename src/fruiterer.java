import java.util.Arrays;

public class fruiterer {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        int count = 0;
        for(int i = score.length-1; i > -1; i--){
            count++;
            if(count == m){
                count = 0;
                answer += (score[i] * m);
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        int k  = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        System.out.println(solution(k,m,score));
    }
}
