package softear;
import java.io.*;
import java.util.*;

public class PracticeQuestion {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int sum = 0;

        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String []start = st.nextToken().split(":");
            String []end = st.nextToken().split(":");

            int start_h = Integer.parseInt(start[0]);
            int start_m = Integer.parseInt(start[1]);

            int end_h = Integer.parseInt(end[0]);
            int end_m = Integer.parseInt(end[1]);

            if(end_m < start_m){
                end_h--;
                end_m += 60;
                end_m = end_m - start_m;
                end_h = end_h - start_h;

            }else{
                end_h = end_h - start_h;
                end_m = end_m - start_m;
            }

            sum += (end_h * 60);
            sum += end_m;


        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
