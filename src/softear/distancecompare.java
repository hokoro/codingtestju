package softear;
import java.io.*;
import java.util.*;


public class distancecompare {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer a = Integer.parseInt(st.nextToken());
        Integer b = Integer.parseInt(st.nextToken());

        if(a>b){
            sb.append("A");
        }else if(a<b){
            sb.append("B");
        }else{
            sb.append("same");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }

}
