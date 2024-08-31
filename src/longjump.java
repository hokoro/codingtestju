public class longjump {

    public static int factorial(int x){
        int result = 1;
        for(int i = 2; i <= x; i++){
            result *= i;
        }

        return result;
    }

    public static long solution(int n) {
        long a = 1L;
        long b = 2L;
        if (n == 1) {
            return a;
        } else if (n == 2) {
            return b;
        }
        for (int i = 3; i <= n; i++) {
            long tmp = (a + b) % 1234567;
            a = b;
            b = tmp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println(solution(n));

        int n2 = 3;

        System.out.println(solution(n2));
    }
}
