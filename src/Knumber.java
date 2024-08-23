import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Knumber {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            ArrayList<Integer> arrayList = new ArrayList<>();
            int start = commands[i][0];
            int end = commands[i][1];
            /*배열 복사가 이렇게도 가능하다*/
            int []arr = Arrays.copyOfRange(array , start-1 , end);

            for(int j = start-1; j < end; j++){
                arrayList.add(array[j]);
            }
            Collections.sort(arrayList);
            answer[i] = arrayList.get(commands[i][2]-1); // arrayList 역시 배열과 마찬가지로 idx가 0부터 시작
        }

        return answer;
    }

    public static void main(String[] args) {
        int []array = {1,5,2,6,3,7,4};
        int[][]commands = {{2,5,3},{4,4,1},{1,7,3}};

        System.out.println(Arrays.toString(solution(array, commands)));
    }
}
