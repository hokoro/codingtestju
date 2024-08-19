import java.util.Arrays;
import java.util.Objects;

public class screenclean_level1 {

    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        boolean found = false;
        for(int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (Objects.equals(wallpaper[i].substring(j, j + 1), "#")) {
                    if (!found) {
                        found = true;
                        answer[0] = i;  // 이놈은 제일 먼저 발견 되었기 때문에 확정
                        answer[1] = j;
                        answer[2] = i;
                        answer[3] = j;
                    } else {
                        if (answer[1] > j) {
                            answer[1] = j;
                        }
                        if (answer[2] < i) {
                            answer[2] = i;
                        }
                        if (answer[3] < j) {
                            answer[3] = j;
                        }
                    }

                }
            }


        }
        answer[2]++;
        answer[3]++;

        return answer;
    }


    public static void main(String[] args) {
        String[] wallpaper = {".#...","..#..","...#."}; // 벽 데이터

        System.out.println(Arrays.toString(solution(wallpaper)));
    }
}
