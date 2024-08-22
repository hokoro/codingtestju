import java.util.Arrays;

public class kiminseoul {
    /*String 배열 seoul 안에서 김서방은 x에 있다 String을 반환 하는 함수를 작성하시오*/
    public static String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        int x2 = Arrays.asList(seoul).indexOf("Kim");
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                x = i;
                break;
            }
        }

        answer = "김서방은 " + x +"에 있다";

        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane" , "Kim"};
        System.out.println(solution(seoul));
    }

}
