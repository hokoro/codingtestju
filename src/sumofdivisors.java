public class sumofdivisors {
    /*정수 n이 주어질 때 n의 약수를 모두 더한 값을 구하시오*/
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i<(int)Math.sqrt(n)+1; i++){
            if(n % i == 0){
                if(n/i == i){
                    answer += i;
                    continue;
                }
                answer += i;
                answer += n / i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
        int n2 = 5;
        System.out.println(solution(n2));

        int n3 =25;
        System.out.println(solution(n3));
    }
}
