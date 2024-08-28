import java.util.HashSet;
import java.util.Set;

public class twosecretpassword {
    public static String solution(String s, String skip, int index) {
        String answer = "";
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < skip.length(); i++){
            set.add(skip.charAt(i));
        }

        for(int i = 0 ; i < s.length(); i++){
            char token = s.charAt(i);
            int count = index;  // skip에 포함안되어 있을떄만 감소시킬 count
            while(count !=0){
                token++;

                if (token > 'z') {
                    token = 'a';
                }

                if(!set.contains(token)){   // 포함 안될때만
                    count--;
                }
            }

            sb.append(token);

        }

        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(solution(s,skip,index));
    }
}
