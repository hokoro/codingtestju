import java.io.*;
import java.util.*;


public class neighborblock_level1 {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int [][]moves = {{1,0} , {-1,0} ,{0,1} , {0,-1}};
        String color = board[h][w];

        for(int i = 0; i < 4; i++){
            int dx = h + moves[i][0];
            int dy = w + moves[i][1];

            if(0<=dx && dx< board.length && 0<=dy && dy < board.length){
                if(Objects.equals(color, board[dx][dy])){
                    answer++;
                }
            }
        }

        return answer;
    }
}
