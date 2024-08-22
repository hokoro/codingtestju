import java.util.Arrays;

public class GCDLCM {
    /*두수 a,b가 주어질때 최대공약수랑 최소공배수를 구하여 배열로 리턴하시오*/

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a , b;
        if(n < m){
            a = m;
            b = n;
        }else{
            a = n;
            b = m;
        }

        while (true){
            int r = a % b;

            if(r == 0){
                break;
            }
            a = b;
            b = r;

        }

        answer[1] = (n*m) / b;

        answer[0] = b;




        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(solution(3, 12)));
    }
}
