package softear;
import java.util.*;
import java.io.*;



public class AplusB {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        Integer num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer a  = Integer.parseInt(st.nextToken());
            Integer b = Integer.parseInt(st.nextToken());

            Integer sum = a+b;
            sb.append("Case #").append(i + 1).append(": ").append(sum).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();



    }
}
