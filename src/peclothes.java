import java.util.*;
public class peclothes {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] counts = new int[n];
        Arrays.fill(counts,1);

        for(int i = 0; i < lost.length; i++){
            counts[lost[i]-1]--;
        }
        for(int i = 0; i < reserve.length; i++){
            counts[reserve[i]-1]++;
        }

        for(int i = 0; i < counts.length; i++){
            if(counts[i] == 2){
                if(i-1 >= 0 && counts[i-1] == 0){
                    counts[i-1] = 1;
                    counts[i] = 1;
                    continue;
                }
                if(i+1 < counts.length && counts[i+1] ==0){
                    counts[i+1] = 1;
                    counts[i] = 1;
                }
            }
        }


        for(int i = 0; i < counts.length; i++){
            if(counts[i] > 0){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int []reverse = {1,3,5};
        System.out.println(solution(n,lost,reverse));

        int n2 = 5;
        int[] lost2 = {4,5};
        int []reverse2 = {3,4};
        System.out.println(solution(n2,lost2,reverse2));


        int n3 = 3;
        int[] lost3 = {3};
        int []reverse3 = {1};
        System.out.println(solution(n3,lost3,reverse3));
    }
}
