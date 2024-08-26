public class findsosu {
    public static int solution(int n) {
        int answer = 0;

        for(int i = 2; i<=n; i++){
            boolean issosu = true;
            for(int j = 2; j < (int)Math.sqrt(i) + 1; j++){
                if(i % j == 0){
                    issosu = false;
                    break;
                }
            }

            if(issosu){
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
}
