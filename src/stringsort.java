import java.util.Arrays;

public class stringsort {
    /*문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.*/

    public static String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        // 정렬을 위한 문자 배열
        char[] s_char = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            s_char[i] = s.charAt(i);
        }

        Arrays.sort(s_char);

        for(int i = s_char.length-1; i > -1; i--){
            sb.append(s_char[i]);
        }

        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));

    }
}
