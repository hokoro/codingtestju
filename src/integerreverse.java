import java.util.Arrays;


public class integerreverse {
    /*정수 n을 매개 변수롤 입력받고 큰것부터 작은 순으로 정렬 한 새로운 정수를 리턴하시오*/

    public static long solution(long n) {
        long answer = 0;
        long[] arr = new long[Long.toString(n).length()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = n%10;
            n = n/10;
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i>=0; i--){
            sb.append(arr[i]);
        }

        answer = Long.parseLong(sb.toString());



        return answer;
    }

    public static void main(String[] args) {
        long n =  118372;
        System.out.println(solution(n));
    }
}
