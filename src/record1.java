
import java.util.*;

public class record1 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> rank = new ArrayList<>();


        for(int i =0; i < score.length; i++){
            rank.add(score[i]); // 일단 랭크에 추가
            if(rank.size()> k){ // 랭크에 들어가 있는 순위가 k를 넘어갈 경우
                int min = Collections.min(rank);
                rank.remove(Integer.valueOf(min));  // 해당 안되는 가장 작은수를 뺸다.
            }

            answer[i] = Collections.min(rank);  // k번째 해당하는 점수 추가

        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int []scores = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution(k,scores)));
        int k2 = 4;
        int []scores2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(solution(k2,scores2)));
    }
}
