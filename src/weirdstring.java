import java.util.StringTokenizer;

public class weirdstring {


    public static String solution(String s) {
        String answer = "";
        String[] tokens = s.split(" ",-1);
        StringBuilder sub = new StringBuilder();
        for(int i = 0; i < tokens.length; i++){
            for(int j = 0; j<tokens[i].length(); j++){
                if(j %2 == 0){
                    sub.append(tokens[i].substring(j,j+1).toUpperCase());
                }else if(j %2 !=0){
                    sub.append(tokens[i].substring(j,j+1).toLowerCase());
                }else{
                    sub.append(" ");
                }
            }
            if(i < tokens.length-1){
                sub.append(" ");
            }
        }

        answer = sub.toString();
        return answer;
    }


    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
