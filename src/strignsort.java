import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class strignsort {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) == o2.charAt(n)){   // edc , abc 처럼 c를 기준으로 볼떄는 사전순 정렬
                    return o1.compareTo(o2);
                }
                return Character.compare(o1.charAt(n) , o2.charAt(n));  // 그게 아니면 그냥 글자 기준 정렬
            }
        });



        answer = strings;




        return answer;
    }

    public static void main(String[] args) {
        String []strings = {"sun","bed","car"};
        int n = 1;

        System.out.println(Arrays.deepToString(solution(strings, n)));

        String []strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;

        System.out.println(Arrays.deepToString(solution(strings2, n2)));

        String[] strings3 = {"edc","abc"};
        int n3 = 2;
        System.out.println(Arrays.deepToString(solution(strings3 , n3)));
    }
}
