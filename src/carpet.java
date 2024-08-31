import java.util.*;
public class carpet {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        ArrayList<ArrayList<Integer>> squareList = new ArrayList<>();
        for(int i = 1; i < (int)Math.sqrt(sum) + 1; i++){
            ArrayList<Integer> square = new ArrayList<>();
            if(sum % i == 0){
                square.add(sum/i);
                square.add(i);
            }else{
                continue;
            }

            squareList.add(square);
        }


        for(int i = 0; i < squareList.size(); i++){
            if(squareList.get(i).get(0) < 3 || squareList.get(i).get(1) < 3){
                continue;
            }else{
                String[][] squareArray = new String[squareList.get(i).get(1)][squareList.get(i).get(0)];
                int brownCount = 0;
                int yellowCount = 0;
                for(int j = 0; j < squareArray.length; j++){
                    for(int k = 0; k < squareArray[j].length; k++){
                        if(j == 0 || k == 0 || j == squareArray.length - 1 || k == squareArray[j].length -1){
                            squareArray[j][k] = "B";
                            brownCount++;
                        }else{
                            squareArray[j][k] = "Y";
                            yellowCount++;
                        }
                    }
                }
                if(brownCount == brown && yellowCount == yellow){
                    answer[0] = squareList.get(i).get(0);
                    answer[1] = squareList.get(i).get(1);
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        System.out.println(Arrays.toString(solution(brown,yellow)));

        int brown2 = 8;
        int yellow2 = 1;
        System.out.println(Arrays.toString(solution(brown2,yellow2)));

        int brown3 = 24;
        int yellow3 = 24;
        System.out.println(Arrays.toString(solution(brown3,yellow3)));
    }

}
