import java.util.Arrays;

public class twojinloop {
        public static int[] solution(String s) {
            int[] answer = new int[2];

            while (!s.equals("1")){
                int count = 0;
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == '0'){
                        count++;
                    }else{
                        sb.append(s.charAt(i));
                    }
                }
                int len = sb.length();
                String binary = Integer.toBinaryString(len);
                answer[0]++;
                answer[1] = answer[1] + count;
                s = binary;
            }

            return answer;
        }

    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(Arrays.toString(solution(s)));
    }
}
