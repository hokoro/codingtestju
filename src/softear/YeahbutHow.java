package softear;
import java.io.*;
import java.util.*;
public class YeahbutHow {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tokens = br.readLine().split("");

        StringBuffer sb = new StringBuffer();

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            if(stack.isEmpty()){
                stack.add(tokens[i]);
                sb.append(tokens[i]);
            }else{
                if(stack.peek().equals("(") && tokens[i].equals(")")){
                    stack.pop();
                    sb.append(1);
                    sb.append(tokens[i]);
                    sb.append("+");
                }else{
                    stack.add(tokens[i]);
                    sb.append(tokens[i]);
                }
            }
        }

        String answer = sb.substring(0,sb.length()-1);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();

    }


}
