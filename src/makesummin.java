import java.util.*;
public class makesummin {
    public static int solution(int []A, int []B)
    {
        int answer = 0;
        int len = A.length;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i =0; i < len; i++){
            answer += (A[i] * B[len - i - 1]);
        }


        return answer;
    }

    public static void main(String[] args){
        int []A = {1,4,2};
        int []B = {5,4,4};
        System.out.println(solution(A , B));
    }

}
