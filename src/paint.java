import java.util.HashSet;

public class paint {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean []isPainting = new boolean[n];
        HashSet<Integer> notHashSet = new HashSet<>();
        for(int i =0; i < section.length; i++){
            notHashSet.add(section[i]);
        }

        for(int i = 0; i < isPainting.length; i++){
            if(!notHashSet.contains(i+1)){
                isPainting[i] = true;
            }
        }

        for(int i = 0; i < isPainting.length; i++){
            if(!isPainting[i]){
                answer++;
                for(int j = 0; j < m; j++){
                    if(i+j < isPainting.length && !isPainting[i+j]){
                        isPainting[i+j] = true;
                    }
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] selection = {2,3,6};
        System.out.println(solution(n,m,selection));
    }
}
