import java.util.Arrays;

public class lastchar {

    /*문자열 s가 주어졌을떄 s의 각 위치마다 자신마다 앞에 나왔으면서 , 자신과 가장 가까운 글자가 어디있는지 */

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            char token = s.charAt(i);

            if(i == s.indexOf(token)){
                answer[i] = -1;
            }else{
                int idx = 0;
                for(int j = i-1; j > -1; j--){
                    if(s.charAt(j) == token){
                        idx = j;
                        break;
                    }
                }
                answer[i] = i - idx;
            }

        }



        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
        System.out.println(Arrays.toString(solution(s)));
    }

}
