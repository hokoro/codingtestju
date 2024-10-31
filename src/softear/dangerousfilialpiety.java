package softear;
import java.io.*;
import java.util.*;
public class dangerousfilialpiety {
    public static void main(String[] args) throws IOException{

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer a = Integer.parseInt(st.nextToken());
        Integer b = Integer.parseInt(st.nextToken());
        Integer d  = Integer.parseInt(st.nextToken());
        int count = 0;
        int move = 0;
        int time = 0;
        boolean movebool = true;
        while(count != 2){
            if(movebool){
                move += a;
                time += a;
            }else{
                time += b;
            }

            if(move >= d){
                if(move > d){
                    time -= (move - d);
                }
                count++;
                int temp;
                move = 0;
                temp = a;
                a = b;
                b = temp;
                continue;
            }
            movebool = !movebool;
        }

        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
    }


}
