import java.util.*;


public class personalitytype_level1 {
    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        HashMap<String , Integer>personality = new HashMap<>(){{
            put("R",0);
            put("T",0);
            put("C",0);
            put("F",0);
            put("J",0);
            put("M",0);
            put("A",0);
            put("N",0);
        }};

        for(int i = 0; i < survey.length; i++){
            String front = survey[i].substring(0,1);
            String back = survey[i].substring(1,2);


            if(choices[i] > 4){
                if(choices[i] == 5){
                    personality.put(back , personality.get(back)+1);
                }else if(choices[i] == 6){
                    personality.put(back , personality.get(back)+2);
                }else{
                    personality.put(back , personality.get(back)+3);
                }
            } else if (choices[i] < 4) {
                if(choices[i] == 3){
                    personality.put(front , personality.get(front)+1);
                }else if(choices[i] == 2){
                    personality.put(front , personality.get(front)+2);
                }else{
                    personality.put(front , personality.get(front)+3);
                }

            }else{
                continue;
            }

        }

        if(personality.get("R") >= personality.get("T")){
            answer.append("R");
        }else{
            answer.append("T");
        }

        if(personality.get("C") >= personality.get("F")){
            answer.append("C");
        }else{
            answer.append("F");
        }
        if(personality.get("J") >= personality.get("M")){
            answer.append("J");
        }else{
            answer.append("M");
        }
        if(personality.get("A") >= personality.get("N")){
            answer.append("A");
        }else{
            answer.append("N");
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};


        System.out.println(solution(survey , choices));
    }
}
