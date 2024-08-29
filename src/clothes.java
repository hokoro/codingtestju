import java.util.*;
public class clothes {


    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String , Integer> clotheHashMap = new HashMap<>();

        for(int i = 0; i < clothes.length; i++){
            String key = clothes[i][1];

            if(!clotheHashMap.containsKey(key)){
                clotheHashMap.put(key , 1);
            }else{
                clotheHashMap.put(key , clotheHashMap.get(key)+1);
            }

        }

        for(String key : clotheHashMap.keySet()){
            answer *= (clotheHashMap.get(key) + 1);
        }

        answer -=1;

        return answer;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"} , {"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }
}
