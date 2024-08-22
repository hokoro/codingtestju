import java.io.*;
import java.util.*;
public class squarestar {
    /*이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
    별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder answer = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i = 0; i < b; i++){
            for(int j = 0; j<a; j++){
                answer.append("*");
            }
            answer.append("\n");
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

}
