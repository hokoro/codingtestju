import java.util.*;
public class parcelbox {
    public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stacks = new Stack<>();// 보조 스택
        int j = 0; // 4-3-1-2-5
        Queue<Integer> queue = new LinkedList<>();
        for(int k = 0; k < order.length; k++){
            queue.add(k+1);
        }
        int num = queue.remove();
        while(true){
            if(j < order.length){
                if(order[j] == num){
                    j++;
                    if(!queue.isEmpty()){
                        num = queue.remove();
                    }
                    answer++;
                }else{
                    if(!stacks.isEmpty()){
                        if(stacks.peek() == order[j]){
                            j++;
                            answer++;
                            stacks.pop();
                        }else{
                            if(!queue.isEmpty()){
                                stacks.push(num);
                                num = queue.remove();
                            }else{
                                break;
                            }
                        }
                    }else{
                        if(queue.isEmpty()){
                            break;
                        }else{
                            stacks.push(num);
                            num = queue.remove();
                        }
                    }
                }
            }else{
                break;
            }
        }

        return answer;
    }

    public static void main(String[]args){
        int[] order = {5,4,3,2,1};
        System.out.println(solution(order));
    }
}
