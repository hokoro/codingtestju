package softear;
import java.io.*;
import java.util.*;


public class TrendelFindelMundo {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Integer num = Integer.parseInt(br.readLine());

        int [][] arrs = new int[num][2];

        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            Integer a = Integer.parseInt(st.nextToken());
            Integer b = Integer.parseInt(st.nextToken());

            arrs[i][0] = a;
            arrs[i][1] = b;
        }

        Arrays.sort(arrs , new Comparator<int[]>(){
            @Override
            public int compare(int[] x , int[] y){
                if(x[1] == y[1]){
                    return Integer.compare(x[0],y[0]);
                }
                return Integer.compare(x[1] , y[1]);
            }
        });


        StringBuffer sb = new StringBuffer();

        sb.append(arrs[0][0]).append(" ").append(arrs[0][1]);


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }

}
