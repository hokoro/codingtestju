import java.util.*;
public class behindbignum {

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = numbers.length-1; i >= 0; i--){
            while (true){
                if(stack.isEmpty()){    // 뒤에 큰수가 없기 떄문에 -1
                    answer[i] = -1;
                    stack.add(numbers[i]);
                    break;
                }else{          // 스택에 제일 위에 부분이 큰수면 그 수가 정답
                    if(numbers[i] < stack.peek()){
                        answer[i] = stack.peek();
                        stack.add(numbers[i]);
                        break;
                    }else{      // 아니면 다음수를 찾아야 하기때문에 pop
                        stack.pop();
                    }
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {9, 1, 5, 3, 6, 2};
        System.out.println(Arrays.toString(solution(nums)));
    }
}
