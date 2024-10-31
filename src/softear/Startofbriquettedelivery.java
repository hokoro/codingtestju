package softear;
import java.util.*;
import java.io.*;
public class Startofbriquettedelivery {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Integer count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[count];
        int [] diffs = new int[count-1];
        for(int i = 0; i < count; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int min = 1000000;
        int answer = 0;

        for(int i = 0; i < count-1; i++){
            int diff = nums[i+1] - nums[i];

            if(diff < min){
                min = diff;
            }
            diffs[i] = diff;
        }

        for(int i = 0; i < count-1; i++){
            if(min == diffs[i]){
                answer++;
            }
        }


        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();



    }

}
