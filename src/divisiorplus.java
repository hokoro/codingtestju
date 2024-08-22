import java.util.ArrayList;

public class divisiorplus {

    /*두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
    약수의 개수가 짝수인 수는 더하고,
    약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.*/

    public static int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            ArrayList<Integer> arrayList = new ArrayList<>(); // 약수의 개수가 계속 바뀌기 때문에 arrayList로 선언
            for(int j = 1; j<(int)Math.sqrt(i)+1; j++){ // 약수의 개수 구하기
               if(i % j == 0){
                   if(i / j == j){   // ex) 16 = 4*4 (중복 x)
                       arrayList.add(j);
                       continue;
                   }
                   // 그외 나머지
                   arrayList.add(j);
                   arrayList.add(i/j);
               }
            }
            if(arrayList.size() % 2 == 0){  // 짝수는 더하고
                answer += i;
            }else{              // 홀수는 뺸다.
                answer -= i;
            }
        }



        return answer;
    }



    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        System.out.println(solution(left , right));
    }
}
