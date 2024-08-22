public class absolutesum {
    /*어떤 정수 배열과 음향을 나타내는 boolean 배열이 있을떄
    * 각 인덱스에 맞는 수와 음향을(+,-)를 조합하여 합을 구하시오*/
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < signs.length; i++){
            if(!signs[i]){
                absolutes[i] = absolutes[i] * -1;
            }

            answer += (absolutes[i]);
        }
        return answer;
    }



    public static void main(String[] args) {
        int [] absolute = {4,7,12};
        boolean[] signs = {true,false,true};

        System.out.println(solution(absolute , signs));
    }
}
