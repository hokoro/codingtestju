import java.util.*;

public class numplus {

    public static int solution2(int n){
        int answer = 0;

        while(true){
            answer += (n % 10);

            if(n < 10){ // n이 10보다 낮아지면 나눌 필요가 없기 때문에
                break;
            }

            n = n / 10;

        }
        return  answer;
    }


    /*자연수N이 주어지면 각 자리수의 합을 구해서 return하는 함수를 작성하시오*/
    public static int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for(int i = 0; i<s.length(); i++){
            answer += (Integer.parseInt(s.substring(i,i+1)));
        }


        return answer;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
        System.out.println(solution2(n));
    }

}
