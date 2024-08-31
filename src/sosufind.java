import java.util.*;
public class sosufind {


    public static void permutation(int[] arr, int[] out, boolean[] visited, int depth, int r , List<Integer> result){
        if(depth == r){
            StringBuilder sb = new StringBuilder();
            for(int num: out) {
                sb.append(num);
            }
            result.add(Integer.parseInt(String.valueOf(sb)));

            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, out, visited, depth+1, r , result);
                visited[i] = false;
            }
        }
    }



    public static int solution(String numbers) {
        int answer = 0;
        int[] strNums = new int[numbers.length()];

        for(int i = 0; i < numbers.length(); i++){
           strNums[i] = Integer.parseInt(numbers.substring(i,i+1));
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= numbers.length(); i++){;
            permutation(strNums , new int[i] , new boolean[strNums.length], 0 , i , result);
        }
        Set<Integer> set = new HashSet<>(result);
        for(int i : set){
            if(i < 2){
                continue;
            }else{
                ArrayList<Integer> sosu = new ArrayList<>();
                for(int j = 1; j < (int)Math.sqrt(i) + 1; j++){
                    if(i % j == 0){
                        if(i / j == j){
                            sosu.add(j);
                            continue;
                        }
                        sosu.add(j);
                        sosu.add(i/j);
                    }
                }

                if(sosu.size() == 2){
                    answer++;
                }
            }


        }




        return answer;
    }

    public static void main(String[] args) {
        String numbers = "011";
        System.out.println(solution(numbers));

    }
}
