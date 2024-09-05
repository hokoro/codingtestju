import java.util.*;
public class press {
    public static int[] solution(String msg) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int j = 1;
        for (int i = 65; i < 65 + 26; i++) {
            hashMap.put(String.valueOf((char) i), j);
            j++;
        }
        int i = 0;
        String now = "";
        while (!msg.equals(now)){
            String token = String.valueOf(msg.charAt(i));
            while (i<msg.length()-1) {
                int k = i + 1;
                String next = String.valueOf(msg.charAt(k));
                if (!hashMap.containsKey(token + next)) {
                    hashMap.put(token + next, j);
                    j++;
                    break;
                } else {
                    token += next;
                    i++;
                }
            }

            now += token;
            arrayList.add(hashMap.get(token));
            i++;
        }


        answer = new int[arrayList.size()];
        for(int u = 0; u < answer.length; u++){
            answer[u] = arrayList.get(u);
        }
        return answer;
    }

    public static void main(String[] args) {
        String msg = "KAKAO";
        System.out.println(Arrays.toString(solution(msg)));
    }
}
