import java.util.*;
public class tuple {

    public static int[] solution(String s) {
        int[] answer = {};
        s = s.substring(2 , s.length()-2);

        String [] strs = s.split("\\},\\{");
        int []lens = new int[strs.length];
        for(int i = 0; i < lens.length; i++){
            lens[i] = strs[i].length();
        }
        int temp = 0;
        String tempStr = "";
        for(int i = 0; i < lens.length-1; i++){
            for(int j = i+1; j < lens.length; j++){
                if(lens[i] > lens[j]){
                    temp = lens[i];
                    lens[i] = lens[j];
                    lens[j] = temp;
                    tempStr = strs[i];
                    strs[i] = strs[j];
                    strs[j] = tempStr;
                }
            }
        }


        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            String[] tokens = strs[i].split(",");
            for(int j = 0; j < tokens.length; j++){
                if(!arrayList.contains(Integer.parseInt(tokens[j]))){
                    arrayList.add(Integer.parseInt(tokens[j]));
                    break;
                }
            }
        }
        answer = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        System.out.println(Arrays.toString(solution(s)));

        String s2 = "{{20,111},{111}}";
        System.out.println(Arrays.toString(solution(s2)));

    }
}
