package softear;

import java.io.*;
import java.util.*;

public class treeplant {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int []nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        int a = nums[n-1] * nums[n-2];
        int b = nums[0] * nums[1];
        int answer = 0;

        if(a > b){
            answer = a;
        }else{
            answer = b;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

}
