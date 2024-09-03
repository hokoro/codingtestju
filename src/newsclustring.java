import java.util.*;

public class newsclustring {
    public static int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        HashMap<String , Integer> str1Set = new HashMap<>();
        HashMap<String , Integer> str2Set = new HashMap<>();
        Set<String> keys = new HashSet<>();
        for(int i = 0; i < str1.length()-1; i++){
            String s = str1.substring(i , i+2);
            boolean isEng = true;
            for(int j = 0; j < 2; j++){
                if(!('A'<= s.charAt(j) && s.charAt(j) <= 'Z')){
                    isEng = false;
                    break;
                }
            }
            if(isEng){
                if(str1Set.containsKey(s)){
                    str1Set.put(s , str1Set.get(s) + 1);
                }else{
                    str1Set.put(s , 1);
                }
                keys.add(s);
            }
        }

        for(int i = 0; i < str2.length()-1; i++){
            String s = str2.substring(i , i+2);
            boolean isEng = true;
            for(int j = 0; j < 2; j++){
                if(!('A'<= s.charAt(j) && s.charAt(j) <= 'Z')){
                    isEng = false;
                    break;
                }
            }
            if(isEng){
                if(str2Set.containsKey(s)){
                    str2Set.put(s , str2Set.get(s) + 1);
                }else{
                    str2Set.put(s , 1);
                }
                keys.add(s);
            }
        }

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> inter = new ArrayList<>();
        for(String key : keys){
            if(str1Set.containsKey(key) && str2Set.containsKey(key)){
                if(str1Set.get(key) < str2Set.get(key)){
                    int str2len = str2Set.get(key);
                    int str1len = str1Set.get(key);

                    for(int i = 0; i < str2len; i++){
                        union.add(key);
                    }
                    for(int i = 0; i < str1len; i++){
                        inter.add(key);
                    }

                } else if (str1Set.get(key) >= str2Set.get(key)) {
                    int str2len = str2Set.get(key);
                    int str1len = str1Set.get(key);

                    for(int i = 0; i < str1len; i++){
                        union.add(key);
                    }
                    for(int i = 0; i < str2len; i++){
                        inter.add(key);
                    }
                }
                continue;
            }
            if(str1Set.containsKey(key)){
                int str1len = str1Set.get(key);
                for(int i = 0; i < str1len; i++){
                    union.add(key);
                }
                continue;
            }
            if(str2Set.containsKey(key)){
                int str2len = str2Set.get(key);
                for(int i = 0; i < str2len; i++){
                    union.add(key);
                }
            }
        }
        if(union.isEmpty() && inter.isEmpty()){
            return 65536;
        }

        double cluster=  ((double)inter.size() / union.size());
        answer = (int)(cluster * 65536);

        return answer;
    }

    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";
        System.out.println(solution(str1 , str2));

        String str3 = "handshake";
        String str4 = "shake hands";
        System.out.println(solution(str3 , str4));

        String str5 = "aa1+aa2";
        String str6 = "AAAA12";
        System.out.println(solution(str5 , str6));

        String str7 = "E=M*C^2";
        String str8 = "e=m*c^2";
        System.out.println(solution(str7 , str8));

    }
}
