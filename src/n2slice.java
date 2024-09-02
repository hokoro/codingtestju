import java.util.*;
public class n2slice {


    public static int[] solution(int n, long left, long right) {
        int[] answer = {};
        int[][] graphs = new int[n][n];
        int[] oneArr = new int[n*n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j ==0){
                    graphs[i][j] = 1;
                    oneArr[i * n + j] = graphs[i][j];
                    continue;
                }
                if(i == j){
                    graphs[i][j] = graphs[i-1][j-1] + 1;
                    oneArr[i * n + j] = graphs[i][j];
                    continue;
                }if(i == 0 && j >0){
                    graphs[i][j] = graphs[i][j-1] + 1;
                    oneArr[i * n + j] = graphs[i][j];
                    continue;
                }if(i > 0 && j == 0){
                    graphs[i][j] = graphs[i-1][j] + 1;
                    oneArr[i * n + j] = graphs[i][j];
                    continue;
                }if(i > 0 && j > 0){
                    if(i > j){
                        graphs[i][j] = graphs[i-1][j] + 1;
                        oneArr[i * n + j] = graphs[i][j];
                    }else{
                        graphs[i][j] = graphs[i][j-1] + 1;
                        oneArr[i * n + j] = graphs[i][j];
                    }
                }
            }
        }

        int len = (int)(right-left+1);
        int count = (int)left;
        answer=  new int[len];
        for(int i = 0; i < len; i++){
            answer[i] = oneArr[count];
            count++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        long left = 2;
        long right = 5;

        System.out.println(Arrays.toString(solution(n , left , right)));

        int n2 = 4;
        long left2 = 7;
        long right2 = 14;

        System.out.println(Arrays.toString(solution(n2 , left2 , right2)));

    }
}
