import java.util.Arrays;


public class minsquare {
    /*가로 세로를 나타내는 2차원 배열이 존재할때 지갑을 만들기 위한 최소 직사각형의 넓이를 구하시오*/

    public static int solution(int[][] sizes) {
        int answer = 0;
        int []row = new int[sizes.length];
        int []col = new int[sizes.length];

        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] >= sizes[i][1]){
                row[i] = sizes[i][0];
                col[i] = sizes[i][1];
            }else{
                col[i] = sizes[i][0];
                row[i] = sizes[i][1];
            }
        }

        answer = Arrays.stream(row).max().getAsInt() * Arrays.stream(col).max().getAsInt(); // 길이가 긴 것중에 최고 * 길이가 작은것중에 제일 최고


        return answer;
    }

    public static void main(String[] args) {
        int [][] arr = {{60, 50}, {30, 70}, {60, 30},{80, 40}};

        System.out.println((solution(arr)));
    }
}
