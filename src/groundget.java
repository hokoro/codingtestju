import java.util.*;
public class groundget {



    public static int solution(int[][] land) {
        int answer = 0;
        int [][]sums = new int[land.length][4];
        for (int i = 0; i < 4; i++) {
            sums[0][i] = land[0][i];
        }

        for(int i = 1; i < land.length; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    if(j != k){
                        if(sums[i][j] < sums[i-1][k] + land[i][j]){
                            sums[i][j] = sums[i-1][k] + land[i][j];
                        }
                    }
                }
            }
        }

        answer = Arrays.stream(sums[land.length-1]).max().getAsInt();

        return answer;
    }

    public static void main(String[] args) {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution(land));
    }

}
