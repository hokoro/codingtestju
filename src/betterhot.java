import java.util.*;
public class betterhot {

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> food = new PriorityQueue<>();
        for (int value : scoville){
            food.add(value);
        }
        if(!food.isEmpty()){
            while (food.peek() < K){
                if(food.size() == 1){
                    answer = -1;
                    break;
                }
                int a = food.poll();
                int b = food.poll();
                int sum = a + (b * 2);
                answer++;
                food.add(sum);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(scoville , k));
    }
}
