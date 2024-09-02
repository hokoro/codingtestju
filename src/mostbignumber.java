import java.util.*;

public class mostbignumber {

    public static String solution(int[] numbers) {
        String answer = "";
        String[] numberString = new String[numbers.length];
        /*6,2,10 -> 3*2*1 = 6가지*/
        for(int i = 0; i < numbers.length; i++){
            numberString[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numberString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1+o2;
                String b = o2+o1;
                return b.compareTo(a);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<numberString.length; i++){
            sb.append(numberString[i]);
        }

        answer = sb.toString();

        if(answer.startsWith("0")){
            return "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        int[]numbers = {6,10,2};
        System.out.println(solution(numbers));

        int[]numbers2 = {0,0,0};
        System.out.println(solution(numbers2));
    }
}
