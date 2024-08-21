import java.util.Arrays;

public class mean {

    /*정수를 담고 있는 배열 arr이 주어지면 return 하는 함수를 작성하시오*/

    public static double solution2(int[] arr){
        return Arrays.stream(arr).average().getAsDouble();  // Arrays 배열을 사용하여 구하는 평균
    }

    public static double solution(int[] arr) {
        double answer = 0;
        for(int num : arr){ // arr안에 존재하는 모든 수를 더하고
            answer += num;
        }
        answer = answer / arr.length;   // arr의 길이만큼 나눠주면 끝난다.
        return answer;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(solution(arr));

        int [] arr2 = {5,5};
        System.out.println(solution2(arr2));
    }
}
