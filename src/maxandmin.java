import java.util.StringTokenizer;

public class maxandmin {
    public static String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        int min = Integer.parseInt(st.nextToken());
        int max = min;

        while (st.hasMoreElements()){
            int num = Integer.parseInt(st.nextToken());

            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }


        answer = min + " " + max;

        return answer;
    }

    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        System.out.println(solution(s));
    }

}
