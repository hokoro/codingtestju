import java.util.HashMap;

public class intstringword {
    public static int solution(String s) {
        int answer = 0;
        HashMap<String , String> hashMap = new HashMap<>(){
            {
                put("one" , "1");
                put("two" , "2");
                put("three","3");
                put("four","4");
                put("five","5");
                put("six","6");
                put("seven","7");
                put("eight","8");
                put("nine","9");
                put("zero","0");
            }
        };

        StringBuffer sb = new StringBuffer();
        StringBuffer word = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            String sub = s.substring(i,i+1);
            try{
                if(0<=Integer.parseInt(sub) && Integer.parseInt(sub) <=9){
                    sb.append(sub);

                }
            }catch (NumberFormatException e){
                word.append(sub);

                if(hashMap.containsKey(word.toString())){
                    sb.append(hashMap.get(word.toString()));
                    word = new StringBuffer();
                }
            }
        }

        answer = Integer.parseInt(sb.toString());


        return answer;
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}
