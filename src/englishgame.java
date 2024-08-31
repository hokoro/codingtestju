import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class englishgame {

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int [] peopleCount = new int[n];
        String lastChar = "";
        Set<String> set = new HashSet<>();
        for(int i = 0; i < words.length; i++){
            if(i == 0){
                lastChar = String.valueOf(words[i].charAt(words[i].length()-1));
                set.add(words[i]);
            }else{
                String nowChar = String.valueOf(words[i].charAt(0));
                if(lastChar.equals(nowChar) && !set.contains(words[i])){
                    lastChar = String.valueOf(words[i].charAt(words[i].length()-1));
                    set.add(words[i]);
                }else{
                    answer[0] = i%n +1;
                    answer[1] = peopleCount[i%n] +1;
                    break;
                }
            }
            peopleCount[i%n]++;
        }


        return answer;
    }


    public static void main(String[] args){
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution(n, words)));

    }
}
