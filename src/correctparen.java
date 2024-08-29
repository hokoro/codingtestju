import java.util.*;
public class correctparen {
    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stacks = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(!stacks.isEmpty()){
                if(stacks.peek() == '(' && s.charAt(i) == ')'){
                    stacks.pop();
                    continue;
                }
            }

            stacks.add(s.charAt(i));
        }

        if(!stacks.isEmpty()){
            answer = false;
        }




        return answer;
    }

    public static void main(String[] args) {
        String s = "(())()";
        System.out.println(solution(s));
    }
}
