import java.util.*;
public class process {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> valueQueue = new ArrayDeque<>();
        Queue<Integer> indexQueue = new ArrayDeque<>();
        int locationIndex = 0;
        for(int i = 0; i < priorities.length; i++){
            if(i == location){
                locationIndex = i;
            }
            valueQueue.add(priorities[i]);
            indexQueue.add(i);
        }
        int count = 1;
        boolean isAnswer = false;
        while (!valueQueue.isEmpty()){
            int max = Collections.max(valueQueue);
            for(int i = 0; i < valueQueue.size();i++){
                if(valueQueue.peek() == max){   // 프로세스가 가장 먼저 처리해야하는 기준
                    if(indexQueue.peek() == locationIndex){
                        answer = count;
                        isAnswer =true;
                    }
                    count++;
                    indexQueue.remove();
                    valueQueue.remove();
                    break;
                }else{  // 우선순위가 아니라면 뒤로 밀림
                    valueQueue.add(valueQueue.poll());
                    indexQueue.add(indexQueue.poll());
                }
            }

            if(isAnswer){
                break;
            }
        }



        return answer;
    }


    public static void main(String[] args) {
        int [] priorities = {2,1,3,2};
        int location = 2;
        System.out.println(solution(priorities , location));

        int [] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;
        System.out.println(solution(priorities2 , location2));
    }
}
