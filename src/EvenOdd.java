public class EvenOdd {
    /*짝수이면 Even 리턴 , 홀수이면 Odd를 리턴하는 프로그램을 작성*/
    public static String solution(int num) {
        if(num % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }


    public static void main(String[] args) {
        int num = 3;
        System.out.println(solution(num));

        int num2 = 4;
        System.out.println(solution(num2));
    }
}
