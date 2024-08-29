public class nextbignum {
    public static int solution(int n) {
        int answer = 0;
        String n2 = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < n2.length(); i++){
            if(n2.charAt(i) == '1'){
                count++;
            }
        }
        int i = n+1;
        while (true){
            int count2 = 0;
            String n3 = Integer.toBinaryString(i);
            for(int j = 0; j < n3.length(); j++){
                if(n3.charAt(j) == '1'){
                    count2++;
                }
            }
            if (count2 ==count){
                break;
            }
            i++;
        }
        answer = i;
        return answer;
    }

    public static void main(String[] args) {
        int n = 78;
        System.out.println(solution(n));
    }
}
