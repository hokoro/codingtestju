import java.util.*;

public class failscore {

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer , Integer> stageHashSet = new HashMap<>();
        HashMap<Integer , Double>  failHashSet = new HashMap<>();

        for(int i  = 0; i < stages.length; i++){
            if(!stageHashSet.containsKey(stages[i])){
                stageHashSet.put(stages[i] , 0);
            }
            stageHashSet.put(stages[i] , stageHashSet.get(stages[i])+1);
        }
        int count = stages.length;
        for(int i : stageHashSet.keySet()){
            failHashSet.put(i , (double) stageHashSet.get(i) / count);
            count -= stageHashSet.get(i);
        }

        double[] failScores = new double[N];

        for(int i = 0; i < N; i++){
            if(failHashSet.containsKey(i+1)){
                failScores[i] = failHashSet.get(i+1);
            }
            answer[i] = i+1;
        }

        double temp = 0;
        int tempIdx = 0;

        for(int i = 0; i < failScores.length-1; i++){
            for(int j = i+1; j < failScores.length; j++){
                if(failScores[i] < failScores[j]){
                    temp = failScores[i];
                    failScores[i] = failScores[j];
                    failScores[j] = temp;
                    tempIdx = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tempIdx;
                } else if (failScores[i] == failScores[j] && answer[i] > answer[j]) {
                    tempIdx = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tempIdx;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int []stages = {2,1,2,6,2,4,3,3};
        System.out.println(Arrays.toString(solution(n , stages)));
        int n2 = 4;
        int []stages2 = {4,4,4,4,4};
        System.out.println(Arrays.toString(solution(n2 , stages2)));
    }
}
