public class moneycaculator {
    /* 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
    * 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
    * 금액이 부족하지 않으면 0을 리턴하시오*/
    public static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;   // count만큼 이용했을떄 전체 요금
        for(int i = 1; i <= count; i++){
            sum += (long)(price * i);   // long범위의 값이기 때문에 long으로 casting
        }

        answer = sum - money;       // 부족한 돈 계산

        if(answer <=0){ // money 가진돈이 더 많으면 0으로 리턴
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(solution(price,money,count));

    }


}
