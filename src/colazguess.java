public class colazguess {
    /*입력된 수가 짝수라면 2로 나눈다.
    * 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
    * 결과로 나온수가 1이 될떄까지 반복한다.
    * 이 과정을 500번 수행해도 1이 안되면 -1 1이면 0을 반환*/

    public static int solution(long num) {
        int answer = 0;
        for(int i = 0; i < 500; i++){
            if(num == 1){
                answer = i;
                break;
            }
            if(num % 2 ==0){
                num = num / 2;
            }else{
                num = (num * 3) + 1;
            }
        }
        if(num != 1){
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
        int n2 = 16;
        System.out.println(solution(n2));
        long n3 = 626331;
        System.out.println(solution(n3));
    }
}
