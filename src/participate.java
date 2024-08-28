import java.util.HashMap;

public class participate {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String , Integer> countHashMap = new HashMap<>();

        for(int i = 0; i < participant.length; i++){
            if(!countHashMap.containsKey(participant[i])){
                countHashMap.put(participant[i],1);
            }else{
                countHashMap.put(participant[i],countHashMap.get(participant[i])+1);
            }
        }

        for(int i = 0; i < completion.length; i++){
            if(countHashMap.containsKey(completion[i])){
                countHashMap.put(completion[i], countHashMap.get(completion[i]) - 1);
            }
        }

        for(String key : countHashMap.keySet()){
            if(countHashMap.get(key) > 0){
                answer = key;
            }
        }




        return answer;
    }

    public static void main(String[] args) {
        String [] participant = {"leo", "kiki", "eden"};
        String [] completion = {"eden", "kiki"};
        System.out.println(solution(participant , completion));
    }
}
