
import java.util.Arrays;

public class integerresever {
    /*자연수 n이 주어질떄 각 자리수 원소를 가지는 배열 형태를 리턴하시오*/

    public static int[] solution(long n) {

        int[] arr = new int[Long.toString(n).length()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (n %10); // 형변환시 연산 값도 괄호를 해야 한다
            n = n /10;
        }

        return arr;
    }

    public static void main(String[] args) {
        long n = 10000000000L;

        System.out.println(Arrays.toString(solution(n)));
    }
}
