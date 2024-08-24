public class exchangecola {

    public static int solution(int a, int b, int n) {
        int answer = 0;
        while(true){
            int exchangeCola = (n / a) * b; // 교환 되는 콜라수 계산
            if(exchangeCola == 0){  // 교환되는 콜라가 없으면 종료
                break;
            }
            answer += exchangeCola; // 교환받은 콜라 더하고
            n = n % a;  // 나머지 콜라는 보관
            n += exchangeCola; // 받은 콜라를 다시 더함
        }

        return answer;
    }



    public static void main(String[] args) {

        int a = 3;
        int b = 1;
        int n = 20;

        System.out.println(solution(a,b,n));
    }
}
