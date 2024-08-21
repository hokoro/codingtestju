public class pycount {

    /*문자열 s가 주어질때 p의 개수와 y의 개수를 비교해 같으면 true , 아니면 false를 리턴하시오*/

    public static boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pCount++;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                yCount++;
            }
        }

        if(pCount != yCount){
            answer = false;
        }
        return answer;
    }


    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
    }
}
