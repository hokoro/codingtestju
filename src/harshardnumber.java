public class harshardnumber {
    /*어떤 양의 정수 x가 주어질때 이수가 하샤드 수인지 판별하시오*/
    public static boolean solution(int x) {
        boolean answer = true;
        int num = 0;

        int target = x;

        while(true){
            num += (target % 10);

            if(target < 10){
                break;
            }

            target = target / 10;
        }

        if(x % num != 0){
            answer = false;
        }


        return answer;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(solution(x));
        int x1 = 11;
        System.out.println(solution(x1));
        int x2 = 12;
        System.out.println(solution(x2));
        int x3 = 13;
        System.out.println(solution(x3));
    }
}
