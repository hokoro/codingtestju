import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class lotto {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero_count = 0;
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer , Integer> hashMap = new HashMap<>(){{
            put(6, 1);
            put(5, 2);
            put(4, 3);
            put(3, 4);
            put(2 ,5);
        }};

        for(int a : win_nums){
            arrayList.add(a);
        }
        for(int i = 0; i < lottos.length; i++){
            if(arrayList.contains(lottos[i])){
                count++;
                arrayList.remove(Integer.valueOf(lottos[i]));
            }if(lottos[i] == 0){
                zero_count++;
            }
        }

        if(hashMap.containsKey(count+zero_count)){
            answer[0] = hashMap.get(count+zero_count);
        }else{
            answer[0] = 6;
        }

        if(hashMap.containsKey(count)){
            answer[1] = hashMap.get(count);
        }else{
            answer[1] = 6;
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {44,1,0,0,31,25};
        int[] win_hums = {31,10,45,1,6,19};
        System.out.println(Arrays.toString(solution(lottos, win_hums)));
    }
}
