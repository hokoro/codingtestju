import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mathgiveup {


    public static int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();

        int [][]temp = {{1,2,3,4,5} ,{2,1,2,3,2,4,2,5} ,{3,3,1,1,2,2,4,4,5,5}};



        for(int i =0; i < temp.length; i++){
            int correct = 0;
            for(int j = 0; j < answers.length; j++){
                if(temp[i][j % temp[i].length]  == answers[j]){ // 각 인원마다 찍는 패턴이 다르기 때문에 각각의 패턴의 길이로 나눠 문제의 정답과 비교해야 한다.
                    correct++;
                }
            }
            answerList.add(correct);
        }

        int[] correctArr = answerList.stream().mapToInt(Integer :: intValue).toArray();
        int max = Arrays.stream(correctArr).max().getAsInt();
        List<Integer> maxList = new ArrayList<>();
        for(int i =0; i < 3; i++){
            if(max == correctArr[i]){
                maxList.add(i+1);
            }
        }

        answer = maxList.stream().mapToInt(Integer::intValue).toArray();


        return answer;
    }

    public static void main(String[] args) {
        int []answers = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(answers)));
        int []answers2 = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution(answers2)));
    }
}
