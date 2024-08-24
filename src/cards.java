import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class cards {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> card1Queue = new LinkedList<>();
        Queue<String> card2Queue = new LinkedList<>();
        Queue<String> resultQueue = new LinkedList<>();

        Collections.addAll(card1Queue , cards1); // 배열에 원소를 한번에 넣는 방법
        Collections.addAll(card2Queue , cards2);
        Collections.addAll(resultQueue , goal);

        for(int i = 0; i < goal.length; i++){
            String need = resultQueue.poll();   // 해당 토큰
            if(!Objects.equals(card1Queue.peek(), need) && !Objects.equals(card2Queue.peek() , need)){  // 만약 앞에 있는 큐가 둘다 없으면 탈출
                answer = "No";
                break;
            }else{
                if(Objects.equals(card1Queue.peek(), need)){    // 있으면 하나씩 뺸다.
                    card1Queue.poll();
                    continue;
                }
                if(Objects.equals(card2Queue.peek(), need)){
                    card2Queue.poll();
                    continue;
                }

            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goals = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1 , cards2 , goals));
    }
}
