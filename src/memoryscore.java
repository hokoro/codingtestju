import java.util.*;
public class memoryscore {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String , Integer> hashMap = new HashMap<>();    // name 인물 정보를 저장하기 위한 해시맵

        for(int i = 0; i < name.length; i++){   // 데이터 저장
            hashMap.put(name[i] , yearning[i]);
        }

        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j =0; j < photo[i].length; j++){    // 해당하는 사람 맵에서 계산
                if(hashMap.containsKey(photo[i][j])){
                    sum += (hashMap.get(photo[i][j]));
                }
            }
            answer[i] = sum;    // 답에 저장
        }

        return answer;
    }

    public static void main(String[] args) {
        String []name = {"may", "kein", "kain", "radi"};
        int []yearning = {5,10,1,3};
        String[][]photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name , yearning , photo)));
    }
}
