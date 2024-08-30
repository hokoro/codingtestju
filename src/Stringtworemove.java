import java.util.*;
public class Stringtworemove {

    public static int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        //1. 문자제거하기
        for (int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }

        }
        answer = (stack.size() == 0) ? 1 : 0;
        return answer;
    }

    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));
    }
}
