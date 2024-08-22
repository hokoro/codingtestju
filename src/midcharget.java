public class midcharget {
    /*문자열 s가 주어질떄 해당 문자열의 가운데 문자를 반환하는 solution을 만드시오 짝수면 두글자*/

    public static String solution(String s) {
        String answer = "";

        if(s.length() % 2 == 0){ // 짝수
            int len = s.length() / 2;
            answer = s.substring(len - 1 , len +1);
        }else{      // 홀수
            int len = s.length() / 2;
            answer = s.substring(len , len+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));

        String s2 = "qwer";
        System.out.println(solution(s2));
    }

}
