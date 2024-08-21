public class mod {
    /*n이 주어졌을떄 n을 나눈 나머지가 1이되는 최솟값을 찾으시오*/

    public static int solution(int n) {
        int answer = n;

        for(int i = n; i > 0; i--){
            if(n % i == 1 && answer > i){   // 1이 되는 나머지와 + 결과값이 더 작은 수가 있다면 값을 변경
                answer = i;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

        int n2 = 12;
        System.out.println(solution(n2));
    }


}
