import java.util.Arrays;

public class arithmeticsequence {
    /*x 만큼 간격이 존재하는 등차수열 구하기
    * x랑 n이 주어진다
    * x에서 시작하여 x번 증가하는 등차수열을 n번 반복하여 리턴해야 한다,*/

    public static long[] solution2(int x, int n){
        long[] answer = new long[n];
        answer[0] = x;

        for(int i = 1; i < n; i++){
            answer[i] = answer[i-1] + x;    // 등차수열이기 때문에 시작 값만 대입 하고 x만큼 증가
        }


        return answer;
    }



    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            answer[i] = x + ((long) x * i); // x,i는 int형 이기 때문에 타입 캐스팅을 해줘야 한다.
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Arrays.toString(solution(x,n)));

        int x2 = -4;
        int n2= 2;
        System.out.println(Arrays.toString(solution(x2,n2)));
    }
}
