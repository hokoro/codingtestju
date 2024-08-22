public class squareroot {
    /*임의의 양의 정수 n에 대하여 n이 어떤 양의 정수 x의 제곱인지 판단할려고 할때
    * n이 양의 정수 x의 제곱이라면 x+1을 리턴하고 n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 작성하시오 */

    public static long solution(long n) {
        long answer = 0;
        long x = (long) Math.sqrt(n);

        if(x*x == n){
            answer = (x+1) * (x+1);
        }else{
            answer = -1;
        }

        return answer;
    }


    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));
        long n2 = 3;
        System.out.println(solution(n2));
    }
}
