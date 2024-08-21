public class stringtoint {
    /*문자열 s가 주어질떄 s를 정수로 바꾸는 프로그램을 작성하시오*/

    public static int solution(String s) {
        int answer = 0;
        if(s.charAt(0) == '-'){ // -일때만 - 부호 변경
            answer = Integer.parseInt(s.substring(1));
            answer = answer *-1;
        }else{
            answer = Integer.parseInt(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "-1234";
        String s2 = "1234";

        System.out.println(solution(s));
        System.out.println(solution(s2));


    }


}
