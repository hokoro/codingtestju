import java.util.ArrayList;
import java.util.Arrays;

public class tonermant {
    public static int solution(int n, int a, int b)
    {
        int answer = 0;
        int nd = n;
        int round = (int)(Math.log(nd) / Math.log(2));
        ArrayList<Integer> members = new ArrayList<>();

        for(int i = 0; i<n; i++){
            members.add(i+1);
        }
        boolean isMatch = false;
        for(int i = 1; i <= n; i++){
            ArrayList<Integer> nextRound = new ArrayList<>();
            for(int j = 0; j < members.size(); j+=2){
                int front = members.get(j);
                int back = members.get(j+1);

                if((front != a && back != b) && (front != b && back != a)){
                    nextRound.add(front);
                    continue;
                }

                if((front == a && back == b) || (front == b && back == a)){
                    isMatch = true;
                    break;
                }

                if(front == a){
                    nextRound.add(front);
                    continue;
                }
                if(front == b){
                    nextRound.add(front);
                    continue;
                }
                if(back == a){
                    nextRound.add(back);
                    continue;
                }
                if(back == b){
                    nextRound.add(back);
                }
            }
            if(isMatch){
                answer = i;
                break;
            }
            members =nextRound;
        }


        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;

        System.out.println(solution(n , a, b));
    }
}
