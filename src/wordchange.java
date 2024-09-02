import java.util.*;

public class wordchange {

    static boolean[] visited;

    static int[] counts;

    static int targetIdx;

    public static boolean isOneDiff(String a , String b){
        int count = 0; // 몇글자 차이나는지 확인
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i)){
                continue;
            }else{
                count++;
            }
        }

        if(count == 1){
            return true;
        }else{
            return false;
        }

    }

    public static void BFS(int idx , String[] words){
        Queue<Integer> idxs = new LinkedList<>();
        idxs.add(idx);
        visited[idx] = true;
        counts[idx] = 1;
        while (!idxs.isEmpty()){
            int id = idxs.poll();

            for(int i = 0; i < words.length; i++){
                if(isOneDiff(words[id] , words[i])){
                    if(!visited[i]){
                        idxs.add(i);
                        visited[i] = true;
                        counts[i] = counts[id] + 1;
                    }
                }
            }

        }

    }

    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean isWord = false;
        for(int i = 0; i < words.length; i++){
            if(target.equals(words[i])){
                targetIdx = i;
                isWord = true;
                break;
            }
        }
        if(!isWord){
            return answer;
        }else{
            visited = new boolean[words.length];
            counts = new int[words.length];
            for(int i = 0; i < words.length; i++){
                if(isOneDiff(begin , words[i])){
                    BFS(i  , words);
                }
            }

            System.out.println(Arrays.toString(counts));
        }

        answer = counts[targetIdx];

        return answer;
    }
    public static void main(String[] args) {

        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution(begin , target , words));


        String begin2 = "hit";
        String target2 = "cog";
        String[] words2 = {"hot", "dot", "dog", "lot", "log"};
        System.out.println(solution(begin2 , target2 , words2));
    }
}
