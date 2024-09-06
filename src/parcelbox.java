import java.util.*;
public class parcelbox {
    public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stacks = new Stack<>();// 보조 스택
        int i = 1;  // 1-2-3-4-5
        int j = 0; // 4-3-1-2-5

        while(true){
            if(answer == order.length){
                break;
            }
            if(!stacks.isEmpty()){
                if(order[j] != i && stacks.peek() != i){
                    break;
                }
            }

            if(order[j] == i){
                j++;
                i++;
                answer++;
            }else{
                stacks.add(i);
                i++;
                continue;
            }

            if(!stacks.isEmpty()){
                if(stacks.peek() == i){
                    answer++;
                    i++;
                }else{
                    stacks.add(i);
                    i++;
                }
            }
        }

        return answer;
    }

    public static void main(String[]args){
        int[] order = {5,4,3,2,1};
        System.out.println(solution(order));
    }
}
