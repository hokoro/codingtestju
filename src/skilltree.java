import java.util.*;
public class skilltree {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>();
        String start = String.valueOf(skill.charAt(0));
        for(int i = 0; i < skill.length(); i++){
            queue.add(String.valueOf(skill.charAt(i)));
            set.add(String.valueOf(skill.charAt(i)));
        }
        for(int i = 0; i < skill_trees.length; i++){
            boolean isAnswer = true;
            for(int j = 0; j < skill_trees[i].length(); j++){
                String token = String.valueOf(skill_trees[i].charAt(j));
                if(set.contains(token) && !token.equals(queue.peek())){
                    isAnswer = false;
                    break;
                }
                if(set.contains(token) && token.equals(queue.peek())){
                    queue.add(queue.poll());
                    continue;
                }
                if (!set.contains(token)){
                    continue;
                }
            }
            if(isAnswer){
                answer++;
            }
            if(!start.equals(queue.peek())){
                while(true){
                    queue.add(queue.poll());
                    if(start.equals(queue.peek())){
                        break;
                    }
                }
            }

        }



        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill,skill_trees));

    }
}
