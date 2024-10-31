package softear;
import java.io.*;
import java.util.*;
public class treeattack {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer nm = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nm.nextToken());
        int m = Integer.parseInt(nm.nextToken());

        int [][]boards = new int[n][m];
        int oneCount = 0;
        for(int i = 0; i < n; i++){
            StringTokenizer tokens = new StringTokenizer(br.readLine());
            for(int j = 0; j <m; j++){
                boards[i][j] = Integer.parseInt(tokens.nextToken());
                if(boards[i][j] == 1){
                    oneCount++;
                }
            }
        }
        for(int i = 0; i < 2; i++){
            StringTokenizer attacks = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(attacks.nextToken());
            int end = Integer.parseInt(attacks.nextToken());

            int[] nums = new int[n];

            Arrays.fill(nums , start-1 , end, 1);
            for(int j = start-1; j < end; j++){
                for(int k = 0; k < m; k++){
                    if(boards[j][k] == 1 && nums[j] == 1){
                        oneCount--;
                        boards[j][k] = 0;
                        nums[j] = 0;
                    }
                }
            }
        }


        bw.write(String.valueOf(oneCount));
        bw.flush();
        bw.close();

    }



}
