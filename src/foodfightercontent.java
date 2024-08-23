public class foodfightercontent {
    public static String solution(int[] food) {
        String answer = "";
        StringBuilder front = new StringBuilder();
        StringBuilder back = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            int div = food[i] / 2;
            for(int j = 0; j < div; j++){
                front.append(String.valueOf(i));
                back.append(String.valueOf(i));
            }
        }

        back.reverse();
        front.append(0);
        front.append(back);
        answer = front.toString();

        return answer;
    }

    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        System.out.println(solution(food));
    }

}

