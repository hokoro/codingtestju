import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hatesamenum {
    /*이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
    단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. */

    public static int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        int last = arr[0];
        list.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(last != arr[i]){
                list.add(arr[i]);
            }

            last = arr[i];
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();




        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
        int[] arr2 = {4,4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr2)));
    }
}
