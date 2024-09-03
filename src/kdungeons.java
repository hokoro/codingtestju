import java.util.ArrayList;
import java.util.List;

public class kdungeons {

    static List<List<Integer>> result;
    public static void permutation(int[] arr , int[] out , boolean[] visited , int depth , int r){
        if(depth == r){
            List<Integer> arrayList = new ArrayList<>();
            for(int num: out){
                arrayList.add(num);
            }
            result.add(arrayList);
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr , out , visited , depth+1 , r);
                visited[i] = false;
            }
        }
    }

    public static int solution(int k, int[][] dungeons) {
        int answer = -1;
        int []arr = new int[dungeons.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        result = new ArrayList<>();

        permutation(arr , new int[arr.length] , new boolean[arr.length] , 0 , arr.length);

        for(int i = 0; i < result.size(); i++){
            List<Integer> list = result.get(i);
            int sum = 0;
            int temp = k;
            for(int j = 0; j < list.size(); j++){
                int idx = list.get(j);
                if(temp >= dungeons[idx][0]){
                    temp -= dungeons[idx][1];
                    sum++;
                }
            }
            if(answer < sum){
                answer = sum;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution(k , dungeons));
    }
}
