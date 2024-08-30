public class fibonachi {
    public static int solution(int n) {
        int answer = 0;
        int []nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;

        for(int i = 2; i <=n; i++){
            nums[i] = (nums[i-1] + nums[i-2]) % 1234567;
        }

        answer = nums[n];
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }
}
