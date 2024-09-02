import java.util.*;
public class hindex {

    public static int solution(int[] citations) {
        int answer = 0;
        int max = Arrays.stream(citations).max().getAsInt();
        int h = 0;
        for(int i = 0; i <= max; i++){
            h = i;
            int hCount = 0;
            int notHCount = 0;
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= h){
                    hCount++;
                }else{
                    notHCount++;
                }
            }
            if(hCount >= h && notHCount <= h){
                if(answer < h){
                    answer = h;
                }
            }

        }


        return answer;
    }


    public static void main(String[] args) {
        int [] citations = {3,0,6,1,5};
        System.out.println(solution(citations));

    }
}
