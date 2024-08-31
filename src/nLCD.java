import java.util.ArrayList;
import java.util.Arrays;

public class nLCD {

    public static int solution(int[] arr) {
        int answer = 0;
        int GCD = 0;

        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];

        while(true){
            int r = b % a;
            if(r == 0){
                GCD = a;
                break;
            }else{
                b = a;
                a = r;
            }
        }

        int LCD = (arr[0] * arr[1]) / GCD;
        int c = 0;
        int d = 0;
        for(int i = 2; i < arr.length; i++){
            if(LCD > arr[i]){
                c = LCD;
                d = arr[i];
            }else{
                c = arr[i];
                d = LCD;
            }

            while (true){
                int r = c % d;
                if(r == 0){
                    GCD = d;
                    break;
                }else{
                    c = d;
                    d = r;
                }
            }

            LCD = (arr[i] *LCD) / GCD;

        }
        answer = LCD;

        return answer;
    }

    public static void main(String[] args) {
        int []arr = {2,6,8,14};
        System.out.println(solution(arr));
    }
}
