public class numberexpression {
    public static int solution(int n) {
        int answer = 0;
        int k = 1;
        while (true){
            int a = (2 * n - k * (k-1))/ (2 * k);
            int sum = 0;
            if(a <= 0){
                break;
            }
            while(true){
                sum += a;
                if(sum == n){
                    answer++;
                    break;
                }
                if(sum > n){
                    break;
                }
                a++;
            }
            k++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));

    }
}
