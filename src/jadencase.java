import java.util.*;
public class jadencase {

    public static String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder token = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append(token);
                sb.append(s.charAt(i));
                token = new StringBuilder();
            }else{
                if(token.length() == 0){
                    token.append(String.valueOf(s.charAt(i)).toUpperCase());
                }else{
                    token.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
            }
        }

        sb.append(token);
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args){
        String s = "3people unFollowed  me";
        System.out.println(solution(s));
    }
}
