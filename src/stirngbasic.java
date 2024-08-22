import java.util.Objects;

public class stirngbasic {
    /*문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.*/

    public static boolean solution(String s) {
        boolean answer = true;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char token = s.charAt(i);

            int num = Character.getNumericValue(token); // char -> int로 변경하는 함수 a = 10 b = 11 0 = 0
            sb.append(num);
        }

        if(!s.contentEquals(sb)){   // contentEquals String , StringBuilder , StringBuffer를 포함하여 같은지 비교해주는 함수
            answer = false;
        }
        if(s.length() != 4 && s.length() != 6){
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "a234";

        System.out.println(solution(s));

        String s2 = "1234";

        System.out.println(solution(s2));
    }


}
