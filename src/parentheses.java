import java.util.*;
public class parentheses {
    public static int solution(String s) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();

        for(int i =0; i < s.length(); i++){
            queue.add(s.charAt(i));
        }

        for(int i = 0; i < s.length(); i++){
                Stack<Character> stack = new Stack<>();
                for(int j = 0; j < s.length(); j++){
                    if(stack.isEmpty()){
                        stack.push(s.charAt(j));
                        continue;
                    }
                    if(stack.peek() == '{' &&  s.charAt(j)== '}'){
                        stack.pop();
                        continue;
                    }if(stack.peek() == '[' && s.charAt(j) == ']'){
                        stack.pop();
                        continue;
                    }if(stack.peek() == '(' && s.charAt(j) == ')'){
                        stack.pop();
                        continue;
                    }else{
                        stack.push(s.charAt(j));
                    }
                }
                if(stack.isEmpty()){
                    answer++;
                }
                queue.add(queue.poll());
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < queue.size(); j++){
                    char c = queue.poll();
                    sb.append(c);
                    queue.add(c);
                }
                s = sb.toString();
        }


        return answer;
    }

    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(solution(s));

        String s2 = "[)(]";
        System.out.println(solution(s2));
    }
}
