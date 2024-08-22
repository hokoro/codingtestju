public class threereverse {
    public static int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n , 3); // 3진법;
        StringBuilder sb = new StringBuilder(three);
        String threeReverse = sb.reverse().toString();

        for(int i =0; i < threeReverse.length(); i++){
            String num = threeReverse.substring(i,i+1);
            int num2 = Integer.parseInt(num);
            answer += (int) (num2  * Math.pow(3, threeReverse.length() - i-1));
            System.out.println(answer);
        }
        return answer;
    }


    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }
}
