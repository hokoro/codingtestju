package softear;
import java.util.*;
import java.io.*;


public class VoteCounting {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();
        Integer count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){

            Integer n = Integer.parseInt(br.readLine());

            int x = n / 5;
            int a = n % 5;

            for(int j = 0; j < x; j++){
                sb.append("++++ ");
            }
            for(int k = 0; k < a; k++){
                sb.append("|");
            }

            sb.append("\n");

        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();



    }

}
