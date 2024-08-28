public class stringsplit {
    public static int solution(String s) {
        int answer = 0;
        int x_count = 0;
        int last_count = 0;
        String x = "";

        for(int i = 0; i < s.length(); i++){
            if(x.isBlank()){
                x = s.substring(i,i+1);
                x_count++;
            }else{
                String token = s.substring(i,i+1);
                if(x.equals(token)){
                    x_count++;
                }else{
                    last_count++;
                }

                if(x_count == last_count){
                    x = "";
                    answer++;
                    x_count = 0;
                    last_count = 0;
                }
            }
        }

        if(!x.isBlank()){
            answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        String s = "abracadabra";
        System.out.println(solution(s));
    }
}
