import java.util.HashSet;
import java.util.Set;

public class phonecektmon {
    public static int solution(int[] nums) {
        int answer = 0;
        Set<Integer> arr = new HashSet<>(); // 중복 요소를 제거하기 위해 set

        for(int i =0; i < nums.length; i++){    // 데이터 추가
            arr.add(nums[i]);
        }


        int len = nums.length/2;    // 가져갈 수 있는 포켓몬 수

        if(len >= arr.size()){  // 고를수 있는 포켓몬의 종류가 len 보다 작으면
            answer = arr.size();    // 최대 값은 중복없는 포켓몬의 수
        }else{
            answer = len;   // 종류가 더 많으면 len 길이가 최대
        }

        return answer;
    }

    public static void main(String[] args) {
        int []nums = {3,1,2,3};
        System.out.println(solution(nums));
    }
}
