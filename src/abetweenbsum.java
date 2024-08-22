public class abetweenbsum {
    /*a,b 정수가 주어질떄 a부터 b사이의 모든 수들의 합을 구하시오*/
    public static long solution(int a, int b) {
        long answer = 0;

        if(a > b){
            for(int i = b; i <=a; i++){
                answer += i;
            }
        } else if (a < b) {
            for(int i = a; i <=b; i++){
                answer += i;
            }
        }else{
            answer = a;
        }

        return answer;
    }


    public static void main(String[] args) {
        int a = 3 ,b = 5;

        System.out.println(solution(a,b));
        int a2 = -4 ,b2 = -8;

        System.out.println(solution(a2,b2));

    }
}
