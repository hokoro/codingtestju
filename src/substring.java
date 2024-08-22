import java.util.Objects;

public class substring {
    public static int solution(String t, String p) {
        int answer = 0;
        int len = p.length();// 부분 문자열 계산할 길이
        long p_num = Long.parseLong(p);
        for(int i = 0; i < t.length()-len+1; i++){
            String sub = t.substring(i , i+len);
            long sub_num = Long.parseLong(sub);
            if(p_num >= sub_num){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";

        System.out.println(solution(t,p));
    }
}
