import java.util.*;

public class longetNode {

    static int[] counts;
    static boolean[] visited;

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();


    public static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        counts[v] = 1;

        while(!queue.isEmpty()){
            int x = queue.poll();

            for(int i = 0; i < graph.get(x).size(); i++){
                int y = graph.get(x).get(i);
                if(!visited[y]){
                    visited[y] = true;
                    counts[y] = counts[x]+ 1;
                    queue.add(y);
                }
            }

        }
    }


    public static int solution(int n, int[][] edge) {
        int answer = 0;
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i <edge.length; i++){
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }

        for(int i = 1; i <= n; i++){
            graph.get(i).sort(Comparator.naturalOrder());
        }


        counts = new int[n+1];
        visited = new boolean[n+1];
        BFS(1);

        int max = Arrays.stream(counts).max().getAsInt();
        for(int i = 1; i <= n; i++){
            if(max == counts[i]){
                answer++;
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][]vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        System.out.println(solution(n , vertex));
    }
}
