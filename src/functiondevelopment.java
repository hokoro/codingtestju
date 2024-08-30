import java.util.*;
public class functiondevelopment {


    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i =0; i < progresses.length; i++){
            int rest = 100 - progresses[i];
            if(rest % speeds[i] == 0){
                arrayList.add(rest / speeds[i]);
            }else{
                arrayList.add((rest/speeds[i]) +1);
            }
        }
        int days = arrayList.get(0);
        ArrayList<Integer>answerList = new ArrayList<>();
        int count = 1;
        for(int i = 1; i <arrayList.size();i++){
            int temp = arrayList.get(i);
            if (days >= temp){
                count++;
            }else{
                answerList.add(count);
                days = temp;
                count = 1;
            }
        }

        answerList.add(count);

        answer = new int[answerList.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses , speeds)));

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2= {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(progresses2 , speeds2)));
    }


}
