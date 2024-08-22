import java.util.*;

public class delmin {
    /*정수 배열이 주어질떄 가장 작은 수를 제외한 나머지 배열을 리턴하시오
    * 만약 작은수를 빼고 배열이 비어 있다면 -1을 리턴하시오*/
    public static int[] solution(int[] arr) {
        int []answer = {};

        if(arr.length == 1){    // 길이가 1이면 바로 -1 리턴
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }else{      // 아니면 최소를 뺸 나머지 길이만큼 배열 생성
            answer = new int[arr.length-1];
        }

        int min = arr[0];   // 최소 찾기

        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        // 임의로 최소를 제외한 남은 배열을 담은 공간 생성
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(min!=arr[i]){
                arrayList.add(arr[i]);
            }
        }
        // 최소를 제외한 나머지 배열 추가
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
        int[] arr2 = {10};
        System.out.println(Arrays.toString(solution(arr2)));

        int[] arr3 = {101,102};
        System.out.println(Arrays.toString(solution(arr3)));
    }

}
