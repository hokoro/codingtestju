public class notexistnumsum {
    /*0부터 9까지의 숫자중 일부의 숫자들이 배열로 존재한다 이떄 배열에서 찾을 수 없는 숫자를 더하는 프로그램을 작성하시오*/

    public static int solution(int[] numbers) {
        int answer = 45;

        for(int num : numbers){
            answer -= num;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }
}
