import java.util.*;
public class rollcake {

    public static int solution(int[] topping) {
        int answer = 0;
        Set<Integer> old = new HashSet<>();
        HashMap<Integer,Integer> young = new HashMap<>();

        for(int i = 0; i < topping.length;i++){
            young.put(topping[i],young.getOrDefault(topping[i] , 0) + 1);
        }

        for(int i = 0; i < topping.length; i++){
            if(!old.contains(topping[i])){
                old.add(topping[i]);
                young.put(topping[i] , young.get(topping[i]) -1);
            }else{
                young.put(topping[i] , young.get(topping[i]) -1);
            }

            if(young.get(topping[i]) == 0){
                young.remove(topping[i]);
            }

            if(old.size() == young.size()){
                answer++;
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(solution(topping));
    }
}
