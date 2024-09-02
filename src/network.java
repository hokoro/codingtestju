public class network {

    static boolean[] visited;

    public static void DFS(int v , int[][]computers){
        visited[v] = true;
        for(int i = 0; i < computers[v].length; i++){
            int y = computers[v][i];
            if(!visited[i] && y == 1){
                DFS(i , computers);
            }
        }
    }


    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                answer++;
                DFS(i,computers);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(n , computers));

        int n2 = 3;
        int[][] computers2 = {{1,1,0},{1,1,1},{0,1,1}};
        System.out.println(solution(n , computers2));
    }
}
