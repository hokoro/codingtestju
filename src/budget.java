
import java.util.Arrays;


public class budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = Arrays.stream(d).sum();   // 현재 부서의 예산 요청 합

        if(sum <= budget){
            return d.length;
        }

        Arrays.sort(d);
        sum = 0;
        for(int i = 0; i < d.length; i++){
            if(sum + d[i] >budget){
                break;
            }else{
                sum += d[i];
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(solution(d , budget));
        int[] d2 = {2,2,3,3};
        int budget2 = 10;

        System.out.println(solution(d2, budget2));
    }

}