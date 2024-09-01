import java.util.*;

public class gamedistance {

    static boolean[][] visited; // 방문 여부를 체크하는 visited

    static int[][] moves = {{1,0},{-1,0},{0,1},{0,-1}};

    static int[][] moveCounts;


    static int endX;
    static int endY;


    public static void BFS(int x , int y , int[][] maps){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;
        moveCounts[x][y] = 1;
        while (!queue.isEmpty()){
            int []cur = queue.remove();
            x = cur[0];
            y = cur[1];
            for(int i = 0; i < 4; i++){
                int dx = x + moves[i][0];
                int dy = y +  moves[i][1];

                if(0 <= dx && dx < maps.length && 0 <= dy && dy < maps[0].length){
                    if(!visited[dx][dy] && maps[dx][dy] == 1){
                        if(dx == endX && dy == endY){
                            if(moveCounts[dx][dy] == 0){
                                moveCounts[dx][dy] = moveCounts[x][y] +1;
                            }
                            if(moveCounts[dx][dy] > moveCounts[x][y] + 1){
                                moveCounts[dx][dy] = moveCounts[x][y]+1;
                            }
                        }else{
                            moveCounts[dx][dy] = moveCounts[x][y] +1;
                        }
                        queue.add(new int[]{dx,dy});
                        visited[dx][dy] = true;

                    }
                }
            }

        }


    }

    public static int solution(int[][] maps) { // 최단 거리를 구해야 하므로 BFS 방식으로 풀어야 한다.
        int answer = 0;
        visited = new boolean[maps.length][maps[0].length];
        moveCounts = new int[maps.length][maps[0].length];
        endX = maps.length-1;
        endY = maps[0].length-1;

        BFS(0,0 , maps);
        if(moveCounts[endX][endY] == 0){
            answer = -1;
        }else{
            answer = moveCounts[endX][endY];
        }

        return answer;
    }

    public static void main(String[] args) {


        int [][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0, 0, 0, 0, 1}};
        System.out.println(solution(maps));

        int [][]maps2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        System.out.println(solution(maps2));

    }


}
