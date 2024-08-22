import java.util.ArrayList;

import java.util.Collections;

public class divisonarray {
    /*array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.*/

    public static ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answers = new ArrayList<>();
        for (int num : arr){
            if(num % divisor == 0){
                answers.add(num);
            }
        }

        if(answers.isEmpty()){
            answers.add(-1);
        }

        Collections.sort(answers);

        return answers;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int divisor = 5;
        System.out.println(solution(arr , divisor));
    }
}
