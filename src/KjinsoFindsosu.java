import java.util.*;
public class KjinsoFindsosu {
    public static int solution(int n, int k) {
        int answer = 0;
        String s = Long.toString(n , k);
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            String token = s.substring(i,i+1);
            if(token.equals("0")){
                if(sb.toString().isEmpty()){
                    arrayList.add(token);
                    continue;
                }
                arrayList.add(sb.toString());
                arrayList.add(token);
                sb = new StringBuilder();
            }else{
                sb.append(token);
            }
        }
        if(!sb.toString().isEmpty()){
            arrayList.add(sb.toString());
        }



        for(int i = 0; i < arrayList.size(); i++){
            String check = arrayList.get(i);
            if(!check.equals("0") && !check.equals("1")){
                long num = Long.parseLong(check);
                boolean sosu = true;
                for(long j = 2; j < (long)Math.sqrt(num) + 1; j++){
                    if(num % j == 0){
                        sosu = false;
                        break;
                    }
                }
                if(sosu){
                    if(i-1 > 0 && i+1 < arrayList.size()){
                        if(arrayList.get(i-1).equals("0") && arrayList.get(i+1).equals("0")){
                            answer++;
                        }
                    }else if(i-1 > 0){
                        if(arrayList.get(i-1).equals("0")){
                            answer++;
                        }

                    } else if (i+1 < arrayList.size()) {
                        if(arrayList.get(i+1).equals("0")){
                            answer++;
                        }
                    }else if(arrayList.size() == 1){
                        answer++;
                    }
                }
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        int n = 437674;
        int k = 3;
        System.out.println(solution(n , k));

        int n2 = 110011;
        int k2 = 10;
        System.out.println(solution(n2 , k2));

        int n3 = 797161;
        int k3 = 3;
        System.out.println(solution(n3 , k3));
    }
}
