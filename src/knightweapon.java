import java.util.Arrays;

public class knightweapon {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] powers = new int[number];

        for(int i = 0; i < number; i++){
            int point = i+1;
            if(point == 1){
                powers[i] = 1;
                continue;
            }else{
                int sum = 0;
                for(int j =1; j < (int)Math.sqrt(point) + 1; j++){
                    if(point % j == 0){
                        if(point / j == j){
                            sum++;
                            continue;
                        }
                        sum += 2;
                    }
                }

                if(sum > limit){
                    powers[i] = power;
                }else{
                    powers[i] = sum;
                }

            }
        }


        answer  = Arrays.stream(powers).sum();

        return answer;
    }


    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;

        System.out.println(solution(number ,limit , power));
    }
}
