public class caesarcipher {
    /*
    * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
    * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. */

    public static String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < s.length(); i++){
            char token = s.charAt(i);
            int tokenNum = (int)token;
            if(65 <= tokenNum && tokenNum <= 90){
                tokenNum+= n;
                if(tokenNum > 90){
                    tokenNum = (tokenNum % 90) + 64;
                }
            }else if(97 <= tokenNum && tokenNum <= 122 ){
                tokenNum += n;
                if(tokenNum > 122){
                    tokenNum = (tokenNum % 122) + 96;
                }

            }else{
                sb.append(" ");
                continue;
            }

            sb.append((char)tokenNum);


        }

        answer = sb.toString();



        return answer;
    }

    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int n = 25;
        System.out.println(solution(s,n));
        String s2 = "z";
        int n2 = 1;
        System.out.println(solution(s2,n2));
        String s3 = "a B z";
        int n3 = 4;
        System.out.println(solution(s3,n3));



    }
}
