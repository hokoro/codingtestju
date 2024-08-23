import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class twonumberplus {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(arrayList.contains(sum)){
                    continue;
                }else{
                    arrayList.add(sum);
                }
            }
        }

        Collections.sort(arrayList);

        answer = arrayList.stream().mapToInt(Integer :: intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int []arr = {2,1,3,4,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
