import java.util.*;
public class orangeselect {

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Set<Integer> orange = new HashSet<>();
        HashMap<Integer,Integer> orangeCount = new HashMap<>();

        for(int i =0; i < tangerine.length; i++){
            if(orange.contains(tangerine[i])){
                orangeCount.put(tangerine[i] , orangeCount.get(tangerine[i]) + 1);
            }else{
                orange.add(tangerine[i]);
                orangeCount.put(tangerine[i] , 1);
            }
        }

        int count = 0;

        int[] values = orangeCount.values().stream().mapToInt(Integer::intValue).toArray();
        int [] keys = orangeCount.keySet().stream().mapToInt(Integer::intValue).toArray();
        int temp = 0;

        for(int i = 0; i < values.length-1; i++){
            for(int j = i+1; j <values.length; j++ ){
                if(values[i] <values[j]){
                    temp = keys[i];
                    keys[i] = keys[j];
                    keys[j] = temp;
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }

        for(int i =0 ; i < keys.length; i++){
            if(count + values[i] >= k){
                answer++;
                break;
            }else{
                answer++;
                count += values[i];
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k , tangerine));

        int k2 = 4;
        int[] tangerine2 = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k2 , tangerine2));

        int k3= 2;
        int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3};
        System.out.println(solution(k3 , tangerine3));
    }
}
