public class makesosu {
    public static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean issosu = true;
                    for(int h = 2; h < (int)Math.sqrt(sum) + 1; h++){
                        if(sum % h == 0){
                            issosu = false;
                            break;
                        }
                    }

                    if(issosu){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        System.out.println(solution(nums));
    }
}
