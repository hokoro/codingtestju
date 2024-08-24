import java.util.Arrays;

public class secretmap {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; i++){
            int token = arr1[i] | arr2[i];  // 둘중 하나만 벽이면 벽이기 때문에 or 사용
            String line = Integer.toString(token , 2); // 2진수로 변경
            if(line.length() != n){
                int len = n - line.length();
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < len; j++){   // 만약에 길이가 n이랑 일치하지 않으면 n을 맞춰줘야 함
                    sb.append(" ");
                }
                line = sb.toString() + line;
            }
            line = line.replace('1','#'); // 1은 벽으로
            line = line.replace('0',' '); // 0은 빈칸으로

            answer[i] = line;
        }



        return answer;
    }

    public static void main(String[] args) {

//        int n = 5;
//        int []arr1 = {9,20,28,18,11};
//        int []arr2 = {30,1,21,17,28};
//
//        System.out.println(Arrays.toString(solution(n , arr1 , arr2)));


        int n2 = 6;
        int []arr3 = {46,33,33,22,31,50};
        int []arr4 = {27,56,19,14,14,10};

        //"######", "### #", "## ##", " #### ", " #####", "### # "

        System.out.println(Arrays.toString(solution(n2 , arr3 , arr4)));
    }
}
