public class threesumzero {
    /*정수 배열을 받았을 때 세 수의 합이 0이되는 방법의 수를 리턴하시오*/

    public static int solution(int[] number) {
        int answer = 0;

        for(int i = 0; i < number.length - 2; i++){
            for(int j = i+1; j < number.length-1; j++){
                for(int k = j+1; k < number.length; k++){
                    if(number[i] + number[j] + number[k] == 0){ // 총 배열에서 3가지를 중복없이 뽑아 합이 0인 원소만 구하면 된다.
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int []numbers = {-2,3,0,2,-5};

        System.out.println(solution(numbers));
    }

}
