import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moummdict {

    static ArrayList<String> arrayList;
    public static void permutation(String[] arr , String[]out ,int depth , int r){
        if(depth == r){
            StringBuilder sb = new StringBuilder();
            for(String num: out){
                sb.append(num);
            }
            arrayList.add(sb.toString());
            return;
        }
        for(int i = 0; i<arr.length; i++){
            out[depth] = arr[i];
            permutation(arr,out,depth+1,r);
        }
    }


    public static int solution(String word) {
        int answer = 0;
        String[] tokens = {"A","E","I","O","U"};
        arrayList = new ArrayList<>();
        for(int i =1; i <=5; i++){
            permutation(tokens , new String[i] , 0 , i);
        }
        Collections.sort(arrayList);


        answer = arrayList.indexOf(word) + 1;
        return answer;
    }

    public static void main(String[] args) {
        String word = "AAAAE";
        System.out.println(solution(word));
    }
}
