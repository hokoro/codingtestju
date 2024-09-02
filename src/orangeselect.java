import java.util.*;
public class orangeselect {

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < tangerine.length; i++){
            if(!set.contains(tangerine[i])){
                set.add(tangerine[i]);
            }
        }

        int max = Arrays.stream(tangerine).max().getAsInt();
        int[] orangeCount = new int[max+1];
        for(int i = 0; i < tangerine.length;i++){
            orangeCount[tangerine[i]]++;
        }

        System.out.println(Arrays.toString(orangeCount));
        

        return answer;
    }


    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {2,2,2,2,2,2,2,2};
        System.out.println(solution(k , tangerine));
    }
}
