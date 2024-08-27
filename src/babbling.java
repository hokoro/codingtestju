import java.util.*;
public class babbling {

    public static int solution(String[] babbling) {
        int answer = 0;
        String [] words = {"aya","ye","woo","ma"};
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));

        for(String word : babbling){
            StringBuilder sb = new StringBuilder();
            String lastWord = "";
            for(int i = 0; i < word.length(); i++){
                sb.append(word.charAt(i));
                if(wordSet.contains(sb.toString())){
                    if(lastWord.contentEquals(sb)){
                        continue;
                    }
                    lastWord = sb.toString();
                    sb = new StringBuilder();
                }
            }

            if(sb.toString().isEmpty()){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        String []babbling = {"aya", "yee", "u", "maa"};
//        System.out.println(solution(babbling));

        String []babbling2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling2));
    }
}
